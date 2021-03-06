<%@ page import="org.jdom.Element" %>
<%@ page import="org.yawlfoundation.yawl.resourcing.rsInterface.WorkQueueGatewayClient" %>
<%@ page import="org.jdom.output.XMLOutputter" %>
<%@ page import="org.jdom.output.Format" %>
<%@ page import="org.jdom.input.SAXBuilder" %>
<%@ page import="java.io.StringReader" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="taglib.jsp"%>

<!--
  ~ Copyright (c) 2004-2010 The YAWL Foundation. All rights reserved.
  ~ The YAWL Foundation is a collaboration of individuals and
  ~ organisations who are committed to improving workflow technology.
  ~
  ~ This file is part of YAWL. YAWL is free software: you can
  ~ redistribute it and/or modify it under the terms of the GNU Lesser
  ~ General Public License as published by the Free Software Foundation.
  ~
  ~ YAWL is distributed in the hope that it will be useful, but WITHOUT
  ~ ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
  ~ or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General
  ~ Public License for more details.
  ~
  ~ You should have received a copy of the GNU Lesser General Public
  ~ License along with YAWL. If not, see <http://www.gnu.org/licenses/>.
  --!>

<!-- *  A simple custom form example and usage guide.
     *  author Michael Adams
     *  version 2.01, 09/2009  -->

<%
    // the calling or source URL is passed as a request parameter. Make sure we save it
    // so we can redirect back to the same place when ready
    // 获得返回的URL
    String redirectURL = (String) session.getAttribute("redirectURL");
    if (redirectURL == null) {
        redirectURL = request.getParameter("source");
        session.setAttribute("redirectURL", redirectURL);
    }

    // If the Cancel button has been clicked on the form below, clean up any session
    // attributes we set previously, then return directly to the worklist
    // NOTE: if the form is located outside of the resource service, then all of the
    // session.removeAttribute lines should be removed and replaced with a single
    // session.invalidate() 
    // 取消按钮触发时返回worklist列表
    String submit = request.getParameter("submit");
    if ((submit != null) && (submit.equals("Cancel"))) {
        session.removeAttribute("itemXML");
        session.removeAttribute("workitem");
        session.removeAttribute("handle");
        session.removeAttribute("redirectURL");

        response.sendRedirect(response.encodeURL(redirectURL));
        return;
    }

    // To retrieve the workitem xml, use a workqueue gateway client object.
    // The url shown is a default - change it to match your installed path.
    // If your forms are outside the resource service's webapp dir, place the
    // YResourceServiceClient.jar in the same location - it contains all the necessary
    // classes to communicate through the gateway
    String wqURL = "http://localhost:8080/resourceService/workqueuegateway";
    WorkQueueGatewayClient wqClient = new WorkQueueGatewayClient(wqURL);

    // get the workitem xml. If the form has refreshed, it will be stored in a session
    // attribute (see below). If not, get it from the gateway
    String itemXML = (String) session.getAttribute("itemXML");
   
    if (itemXML == null) {

        // The workitem id and user's session handle are passed as parameters. Use them
        // to get an xml record of the workitem.
        String itemid = request.getParameter("workitem");
        String handle = request.getParameter("handle");

        itemXML = wqClient.getWorkItem(itemid, handle);
        session.setAttribute("itemXML", itemXML);
        session.setAttribute("workitem", itemid);
        session.setAttribute("handle", handle);
    }

    // the workitem's data is found in the <data> 1st level element. Any appropriate
    // xml parsing method can be used. Here we use JDOM (and ignore possible exceptions
    // for simplicity).
    // 取得workitem 数据
    Element wir = new SAXBuilder().build(new StringReader(itemXML)).getRootElement();
    Element data = wir.getChild("data");

    // one level down from data is the actual workitem data tree
    Element wirData = (Element) data.getChildren().get(0);
    
    Element update = (Element)wir.getChild("updateddata");
    Element updData = null;
    if (update.getChildren().size() != 0) {
    	updData = (Element)update.getChildren().get(0);
    }

    // if there was a problem getting the workitem's xml, the xml will contain an
    // error message instead. It can be tested like this:
    String error = null;
    if (! wqClient.successful(itemXML)) {
        
        // show the message to the user in an appropriate way. In this case, we'll
        // simply show it on the form below
        error = itemXML+"error";
    } else {
        // Here we read new values as entered on this form (see the html below)
        String eventID = request.getParameter("eventID");
        String eventStatus = request.getParameter("eventStatus");
        
        // if the value(s) on this form have been updated, post them back to the worklist.
        if (eventID != null && eventStatus != null) {
            if (wirData != null) {

                
                Element dataitem1 = wirData.getChild("eventID");
                Element dataitem2 = wirData.getChild("eventStatus");
                
                dataitem1.setText(eventID);
                dataitem2.setText(eventStatus);
                //wirData.addContent(dataitem1);
                //wirData.addContent(dataitem2);

                // once the data updates are complete, update the workitem's data via
                // the gateway.
                String itemid = (String) session.getAttribute("workitem");
                String handle = (String) session.getAttribute("handle");
                String dataString = new XMLOutputter(Format.getCompactFormat()).outputString(wirData);
                String result = wqClient.updateWorkItemData(itemid, dataString, handle);

                // check all is ok - if so, close the form
                if (wqClient.successful(result)) {

                    // clean up our stored session attributes
                    session.removeAttribute("itemXML");
                    session.removeAttribute("workitem");
                    session.removeAttribute("handle");
                    session.removeAttribute("redirectURL");

                    // now we can redirect back to the worklist.
                    // if you want the workitem to complete when it posts back, add
                    // the parameter below and set it to 'true'; if it's false or
                    // missing, the workitem will update but remain on the worklist's
                    // 'started' queue (a 'save')
                    if (submit.equals("Complete")) {
                    		redirectURL += "?complete=true";
                    }

                    response.sendRedirect(response.encodeURL(redirectURL));
                } else {
                	error = result;
                }
            } else {
                error = "This workitem does not contain any data for updating.";
            }
        }
    }
%>

<!DOCTYPE>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>生成事件</title>
    <%@ include file="common.jsp"%>
    <script type="text/javascript">
   		$(function() 
   		{
   			$("#showEventStatus").change(function() {
   				$("#eventStatus").val($(this).val());
   			});
   			   			
	   		$("#eventFormField").submit(function() {
	   			$.ajax({
	   				url : "addEvent.action",
	   				type : "POST",
	   				data : $(this).serialize(),
	   				dataType : "json",
	   				success : function(response) {
	   					$("#showEventID").val(response.eventID);
	   					$("#eventID").val(response.eventID);
	   					onEventFormed();
	   					loadHistory(response);
	   				}
	   			});
	   			return false;
	   		});
   		});
   		
   		function loadHistory(condition) {
   			$.ajax({
   				url : "findSameTypeEvent.action",
   				data : {
   					eventType : condition.eventType
   				},
   				dataType : "json",
   				success : function(response) 
   				{
   					onHistoryLoaded();
   					
   					var t = document.createElement('table');
   					
   					
   					for(var i = 0; i < response.events.length; i++)
   					{
   						var r = t.insertRow();
   						var c1 = r.insertCell();
   						c1.innerHTML =  response.events[i].eventID;
   						var c2 = r.insertCell();
   						c2.innerHTML =  response.events[i].eventSource;
   						var c3 = r.insertCell();
   						c3.innerHTML =  response.events[i].eventType;
   						var c4 = r.insertCell();
   						c4.innerHTML =  response.events[i].eventDesc;
   						document.getElementById('history').appendChild(t);
   						t.setAttribute('border', '1');
   					}
   					var firstrow = t.insertRow();
   					var cn1 = firstrow.insertCell();
   					cn1.innerHTML = "eventID";
   					var cn2 = firstrow.insertCell();
   					cn2.innerHTML = "eventSource";
   					var cn3 = firstrow.insertCell();
   					cn3.innerHTML = "eventType";
   					var cn4 = firstrow.insertCell();
   					cn4.innerHTML = "eventDesc";
   				}
   			});
   		};
   		
   		function onEventFormed() 
   		{
   			$("#eventHistoryField").show("fast", function() 
   			{
   				$("#eventFormField").hide("slow");
   			});
   			$("#formedEventField").show("fast");
   			
   			$("#showEventStatus").val("completed");
   			$("#eventStatus").val($("#showEventStatus").val());
   		};
   		
   		function onHistoryLoaded() 
   		{
   			$("#loading").hide();
   		};
   		
   		function onWorkorderFormed()
   		{
   			$("#formedWorkorderField").show("fast", function() 
   			{
   				$("#eventHistoryField").hide("slow");
   				$("#formedEventField").hide("slow");
   			});
   		}
    </script>
</head>

<body style="text-align: center;">
	<div style="width: 800px; margin: 0 auto;">
    
		<% if (error != null) 
		{ 
		%>
      		<p><%=error%></p>
		<%
		} 
		%>
      
		<fieldset style="margin: 20px 0;">
				<legend style="text-align: left;"><b>来电信息</b></legend>
				<table style="border: 0; cellspacing: 2px; cellpadding: 5px;">
						<tr>
                <td valign="top" width="150">来电号码:</td>
                <td><%=(wirData != null) ? wirData.getChildText("customerPhoneNumber") : "null"%></td>
            </tr>
            <tr>
                <td valign="top" width="150">客户名称:</td>
              		<td><%=(wirData != null) ? wirData.getChildText("customerInfo") : "null"%></td>
          		</tr>
				</table>
		</fieldset>
		
		<form id="eventFormField">		        
				<fieldset style="margin: 20px 0;">
						<legend style="text-align: left;"><b>事件表单</b></legend>
						<table style="border: 0; cellspacing: 2px; cellpadding: 5px;">
							<tr>
								<td valign="top" width="150">事件来源:</td>
	              					<td><input name="event.FEventsource"></td>
							</tr>
							<tr>
								<td valign="top" width="150">事件类型:</td>
	              					<td><input name="event.FEventtype"></td>
							</tr>
							<tr>
								<td valign="top" width="150">事件描述:</td>
	              					<td><input name="event.FEventdesc"></td>
							</tr>
		            		<tr>
		            			<td><input type="reset" value="重填事件"/></td>
		            			<td><input type="submit" value="生成事件"/></td>
		            		</tr>
         				</table>
				</fieldset>
		</form>
		
		
		<fieldset id="eventHistoryField" style="margin: 20px 0; display: none;">
				<legend style="text-align: left;"><b>历史事件</b></legend>
				<p id="loading" style="text-align: center; font-size: 8pt; margin: 5px 0;">正在加载历史事件....</p>
				<table id="history">
					<tr>
						<td>
						</td>
					</tr>
				</table>
		</fieldset>
		
		<fieldset style="margin: 20px 0; display: none;" id="formedEventField">
				<legend style="text-align: left;"><b>生成的事件</b></legend>
				<table style="border: 0; cellspacing: 2px; cellpadding: 5px;">
          		<tr>
              		<td valign="top" width="150">事件ID:</td>
              		<td><input disabled="disabled" id="showEventID" name="showEventID"></td>
          		</tr>
           		<tr>
              		<td valign="top" width="150">事件状态:</td>
              		<td>
              			<select id="showEventStatus">
              					<option value="one">一线</option>
              					<option value="two">二线</option>
              					<option value="thre">三线</option>
              					<option value="completed">事件完成</option>
              					<option value="closed">事件关闭</option>
              			</select>
              		</td>
              		<td style=" font-size: 8px; padding-left: 20px; color: red;">*电话解决则关闭事件，否则选择相应工程师类别生成工单</td>
          		</tr>
          		<tr>
            		<td><input type="hidden" value="生成工单" onClick="onWorkorderFormed()" /></td>
            	</tr>
				</table>
		</fieldset>
		
		
		<fieldset style="margin: 20px 0; display: none;" id="formedWorkorderField">
				<legend style="text-align: left;"><b>生成的工单</b></legend>
				<table style="border: 0; cellspacing: 2px; cellpadding: 5px;">
          		<tr>
              		<td valign="top" width="150">事件ID:</td>
              		<td><input disabled="disabled" id="showWorkorderID"></td>
          		</tr>
           		<tr>
              		<td valign="top" width="150">工程师ID:</td>
              		<td><input id="showWorkorderID"></td>
          		</tr>
          		<tr>
              		<td valign="top" width="150">工单描述:</td>
              		<td><input id="showWorkorderID"></td>
          		</tr>
				</table>

		</fieldset>
		
		
				
		<form method="post" action="" name="customformtest">
			<fieldset style="margin: 20px 0;">
				<legend style="text-align: left;"><b>可选操作</b></legend>
				<input type="hidden" id="eventID" name="eventID" value="<%=(updData != null) ? updData.getChildText("eventID") : wirData.getChildText("eventID")%>">

				<input type="hidden" id="eventStatus" name="eventStatus" value="<%=(updData != null) ? updData.getChildText("eventStatus") : wirData.getChildText("eventStatus")%>">
				<table style="border: 0; cellspacing: 20px; width: 100px;">
					<tr>
		                <td align="right"><input value="Cancel" name="submit" type="submit"/></td>
		                <td align="center"><input value="Save" name="submit" type="submit"/></td>
		                <td align="left"><input value="Complete" name="submit" type="submit"/></td>
		            </tr>
				</table>
			</fieldset>
    </form>
  </div>
</body>
</html>
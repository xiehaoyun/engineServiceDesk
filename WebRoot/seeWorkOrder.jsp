<%@ page import="org.jdom.Element" %>
<%@ page import="org.yawlfoundation.yawl.resourcing.rsInterface.WorkQueueGatewayClient" %>
<%@ page import="org.jdom.output.XMLOutputter" %>
<%@ page import="org.jdom.output.Format" %>
<%@ page import="org.jdom.input.SAXBuilder" %>
<%@ page import="java.io.StringReader" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

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

        String workorderID = request.getParameter("workorderID");
        String workorderchoose = request.getParameter("workorderchoose");
        
        // if the value(s) on this form have been updated, post them back to the worklist.
        if (workorderID != null && workorderchoose != null) {
            if (wirData != null) {

                Element dataitem = wirData.getChild("workorderID");
                //Element dataitem2 = wirData.getChild("workorderchoose");
                Element dataitem2 = new Element("workorderchoose");
                
                dataitem.setText(workorderID);
                dataitem2.setText(workorderchoose);
                //wirData.addContent(dataitem1);
                wirData.addContent(dataitem2);

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
    <title>查看工单</title>
    <script type="text/javascript" src="jquery-1.8.2.min.js"></script>
    <script type="text/javascript">
   		$(function() 
   		{
   			   			
	   		$("#seeOrderFormField").submit(function() {
	   			
	   			$.ajax({
	   				url : "findWorkorderByID.action",
	   				type : "POST",
	   				data : $(this).serialize(),
	   				dataType : "json",
	   				success : function(response) {
	   					$("#WorkOrderField").show("fast");
	   					$("#wk").val(response.workorderID);
	   					$("#wkLevel").val(response.workorderLevel);
	   					$("#wkDesc").val(response.workorderDesc);
	   				}
	   			});
	   			return false;
	   		});
   		});
   		
   		function levelUp()
   		{
   			$("#workorderchoose").val("2");
   			alert("您选择了工单升级!");
   		}
   		
   		function end()
   		{
   			$("#workorderchoose").val("1");
   			alert("您选择了工单结束!");
   		}
   		
   		function management()
   		{
   			$("#workorderchoose").val("3");
   			alert("您选择了"+"配置管理!");
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
      
      	<form method="post" id="seeOrderFormField"  name="seeOrderFormField" action="">
			<fieldset style="margin: 20px 0;">
					<legend style="text-align: left;"><b>工单信息</b></legend>
					<table style="border: 0; cellspacing: 2px; cellpadding: 5px;">
						<tr>
			                <td valign="top" width="150">工单ID:</td>
			                <td><input type="text" id="wkid" name="wkid" value="<%=(wirData != null) ? wirData.getChildText("workorderID") : "null"%>"></td>
		           		</tr>
		           		<tr>
		               		<td><input type="submit" value="查看详情"/></td>
		          		</tr>
					</table>
			</fieldset>
		</form>
			        
		<fieldset style="margin: 20px 0; display: none;" id="WorkOrderField">
				<legend style="text-align: left;"><b>工单记录</b></legend>
				<table style="border: 0; cellspacing: 2px; cellpadding: 5px;">
					<tr>
						<td valign="top" width="150">工单描述:</td>
             					<td><input name="wkDesc" id="wkDesc"></td>
					</tr>
					<tr>
						<td valign="top" width="150">工单ID:</td>
             					<td><input name="wk" id="wk"></td>
					</tr>
					<tr>
						<td valign="top" width="150">工单级别:</td>
             					<td><input name="wklevel" id="wkLevel" ></td>
					</tr>
					
            		<tr>
         				
            			<td><input type="button" value="工单结束" onClick="end()"/></td>
            			<td><input type="button" value="工单升级" onClick="levelUp()"/></td>
            			<td><input type="button" value="配置管理" onClick="management()"/></td>
            		</tr>
            		<tr>
            			<td>默认会选择工单结束</td>
            		</tr>
       			</table>
		</fieldset>
		
		<form method="post" action="" name="customformtest">
			<fieldset style="margin: 20px 0;">
				<legend style="text-align: left;"><b>可选操作</b></legend>
				<input type="hidden" id="workorderID" name="workorderID" value="<%=(updData != null) ? updData.getChildText("workorderID") : wirData.getChildText("workorderID")%>">
				<input type="text" id="workorderchoose" name="workorderchoose" value="<%=(updData != null) ? updData.getChildText("workorderchoose") : wirData.getChildText("workorderchoose")%>">
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
<%@ page import="org.jdom.Element" %>
<%@ page import="org.yawlfoundation.yawl.resourcing.rsInterface.WorkQueueGatewayClient" %>
<%@ page import="org.jdom.output.XMLOutputter" %>
<%@ page import="org.jdom.output.Format" %>
<%@ page import="org.jdom.input.SAXBuilder" %>
<%@ page import="java.io.StringReader" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/pages/common/taglib.jsp"%>

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


<!DOCTYPE>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>生成事件</title>
    <%@ include file="/pages/common/common.jsp"%>
    <script type="text/javascript">
   		$(function() 
   		{
   			$("#showEventStatus").change(function() {
   				$("#eventStatus").val($(this).val());
   			});
   			   			
	   		$("#eventFormField1").submit(function() {
	   		alert("活动1");
	   			$.ajax({
	   				url : "incident/addEvent.action",
	   				type : "POST",
	   				data : $(this).serialize(),
	   				dataType : "json",
	   				success : function(response) {
	   					alert("活动2");
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
    
	
      
		<fieldset style="margin: 20px 0;">
				<legend style="text-align: left;"><b>来电信息</b></legend>
				<table style="border: 0; cellspacing: 2px; cellpadding: 5px;">
						<tr>
                <td valign="top" width="150">来电号码:</td>
                </tr>
            <tr>
                <td valign="top" width="150">客户名称:</td>
             		</tr>
				</table>
		</fieldset>
		
		<form id="eventFormField" action="incident/addEvent.action">		        
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
		
		
		
  </div>
</body>
</html>
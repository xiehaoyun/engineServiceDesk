<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/pages/common/taglib.jsp"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<base href="<%=basePath%>">

	<title>My JSP 'searchEventSolution.jsp' starting page</title>
	<%@ include file="/pages/common/common.jsp"%>
	<link rel="stylesheet" type="text/css" href="<c:url value='/resources/scripts/jquery-ui/css/demos.css' />" />

	<script type="text/javascript">
		$(function() {
			//输入提示
			$(document).tooltip({track: true});
    		//事件解决方案弹出框
    		$("#viewEventSolutionDialog" ).dialog({
      			autoOpen: false,
      			height: 450,
      			width: 500,
      			modal: true,
      			buttons: {
	        		"退出": function() {
          				$( this ).dialog( "close" );
        				}
      			}
    		});
    		//初始化信息
			init();
		});
		
		//初始化信息
		function init() {
		};
	</script>
</head>

<body>
	<form id="modifyDeviceinfoForm" method="post">
		<fieldset style="margin: 20px 0;">
			<legend style="text-align: left;">
				<b class="STYLE19">修改设备/部件信息</b>
			</legend>
		<table style="border: 0; cellspacing: 2px; cellpadding: 5px;">
			<tr>
				<td width="80" class="STYLE19">公司名称：</td>
			<!--下一行的name属性应该修改-->
				<td><input type="text" id="companyName" name="deviceinfoForm.companyName" size="25" maxlength="100"
						title="请输入公司名称" /></td>
			</tr>
			<tr>
				<td width="80" class="STYLE19">区域名称：</td>
			<!--下一行的name属性应该修改-->
				<td><input type="text" id="areaName" name="deviceinfoForm.areaName" size="25" maxlength="100"
						title="请输入区域名称" /></td>
			</tr>
			<tr>
			<td width="80" class="STYLE19">设备类型：</td>
			<!--下一行的name属性应该在action中创建-->
				<td><select id="eventSource" name="deviceinfo.FDevname" class="sel00">
					<option value="1" selected="selected">空调</option>
					<option value="2">照明</option>
					<option value="3">插座</option>
					</select>
				</td>
			<!--下一行的name属性应该在action中创建-->	
				<td><input type="button" id="modifyDeviceinfo" name="modifyDeviceinfo" class="STYLE19" value="&nbsp;搜  索&nbsp;" /></td>
			</tr>
		</table>
		<hr />
		</fieldset>
	</form>
</body>
</html>
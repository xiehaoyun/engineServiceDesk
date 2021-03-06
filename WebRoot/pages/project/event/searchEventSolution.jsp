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
			//搜索事件解决方案
			$("#searchEventSolution").button().click(function() {searchEventSolution();});
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
		//查询事件解决方案
		function searchEventSolution(){
			var keywords = $("#keywords").val();
			if(keywords==null || keywords==''){
				alert("请输入关键字！");
				return;
			}
			$.ajax({
				url : "<c:url value="/eventSolutionJson/searchEventSolution.action" />",
				type : "POST",
				data : {"eventSolutionForm.keywords": keywords},
				dataType : "json",
				success : function(dataMap) {
					//如果该关键字下没有解决方案信息，提示
					if(dataMap.eventSolutionFormList.length==0){
						$("#eventSolution").hide();
						$("#noEventSolution").show();
					}else{
						$("#noEventSolution").hide();	
						$("#eventSolution").show(); //隐藏机构信息打开
						$("tr[name='eventSolutionTr']").remove(); //清空解决方案
						//加入解决方案信息
						for(var i=0;i<dataMap.eventSolutionFormList.length;i++){
							$("#eventSolutionTable").append("<tr name='eventSolutionTr'  onmouseover='onmouseover(this)'>"+
								"<td height='20' width='6%' bgcolor='#FFFFFF' class='STYLE19'><div align='center'>"+dataMap.eventSolutionFormList[i].eventSolutionId+"</div></td>"+
  								"<td height='20' width='8%' bgcolor='#FFFFFF' class='STYLE19'><div align='center'>"+dataMap.eventSolutionFormList[i].eventType+"</div></td>"+
  								"<td height='20' width='23%' bgcolor='#FFFFFF' class='STYLE19'><div align='center' title='"+dataMap.eventSolutionFormList[i].description+"'>"+dataMap.eventSolutionFormList[i].description.substring(0,20)+"</div></td>"+
  								"<td height='20' width='23%' bgcolor='#FFFFFF' class='STYLE19'><div align='center' title='"+dataMap.eventSolutionFormList[i].solution+"'>"+dataMap.eventSolutionFormList[i].solution.substring(0,20)+"</div></td>"+
  								"<td height='20' width='8%' bgcolor='#FFFFFF' class='STYLE19'><div align='center'>"+dataMap.eventSolutionFormList[i].creatorName+"</div></td>"+
  								"<td height='20' width='8%' bgcolor='#FFFFFF' class='STYLE19'><div align='center'>"+dataMap.eventSolutionFormList[i].createTime.substring(0,10)+"</div></td>"+
  								"<td height='20' width='24%' bgcolor='#FFFFFF' class='STYLE19'><div align='center'>"+
  									"<input type='button' value='&nbsp;查 看' onclick='viewEventSolutinoInfo("+dataMap.eventSolutionFormList[i].eventRequestId+","+dataMap.eventSolutionFormList[i].eventSolutionId+")'/> "+
  									"<input type='button' value='有用("+dataMap.eventSolutionFormList[i].thumbsUp+")' id='"+dataMap.eventSolutionFormList[i].eventSolutionId+"' onclick='eventSolutionThumbsUp(this)'/>"+
  									"<input type='button' value='没用("+dataMap.eventSolutionFormList[i].thumbsDown+")' id='"+dataMap.eventSolutionFormList[i].eventSolutionId+"' onclick='eventSolutionThumbsDown(this)'/></div></td></tr>");			
						}
					}
  				}
			});
		}
		//查看解决方案下的事件、工单信息，打开对话框
		function viewEventSolutinoInfo(eventRequestId,eventSolutionId){
			$.ajax({
				url : "<c:url value="/eventJson/viewEventSolutionInfo.action" />",
				type : "POST",
				data : {"eventRequestId": eventRequestId},
				dataType : "json",
				success : function(dataMap) {
					//返回成功 先清空dialog信息，然后填充信息
					initViewEventSolutionDialog();
					if(dataMap.success==true){
						$("#eventSolutionId-d").append(eventSolutionId);
						$("#eventType-d").append(dataMap.eventRequest.eventType);
						$("#description-d").append(dataMap.eventRequest.description);
						$("#eventSolutionTable-d").append("<tr><td valign='top' width='100'>客服人员：</td><td>"+dataMap.eventRequest.serviceRecord+"</td></tr>");
						for(var i=0;i<dataMap.eventWorkOrderList.length;i++){
							$("#eventSolutionTable-d").append("<tr><td valign='top' width='100'>工程师：</td><td>"+dataMap.eventWorkOrderList[i].serviceRecord+"</td></tr>");
						}
						$("#viewEventSolutionDialog").dialog("open");
					}
				}
			});
		}
		function initViewEventSolutionDialog(){
			$("#eventSolutionId-d").html("");
			$("#eventType-d").html("");
			$("#description-d").html("");
			$("#eventSolutionTable-d").html("");
		}
		//事件好评，有用
		function eventSolutionThumbsUp(e){
			var eventSolutionId = $(e).attr("id");
			$.ajax({
				url : "<c:url value="/eventSolutionJson/eventSolutionThumbsUp.action" />",
				type : "POST",
				data : {"eventSolutionForm.eventSolutionId": eventSolutionId},
				dataType : "json",
				success : function(dataMap) {
					//返回成功 返回后更改评论数，同时将按钮灰显
					var newThumbsUp = dataMap.thumbsUp;
					if(newThumbsUp!=null && newThumbsUp!=''){
						alert("评论成功！该解决方案目前得到的好评为："+newThumbsUp+"个");
						$(e).attr("value","有用("+newThumbsUp+")").attr("disabled","disabled"); //有用disabled
						$(e).parent().find("input[type=button]").next().next().attr("disabled","disabled"); //没用disabled
					}
  				}
			});
		}
		//事件差评，没用
		function eventSolutionThumbsDown(e){
			var eventSolutionId = $(e).attr("id");
			$.ajax({
				url : "<c:url value="/eventSolutionJson/eventSolutionThumbsDown.action" />",
				type : "POST",
				data : {"eventSolutionForm.eventSolutionId": eventSolutionId},
				dataType : "json",
				success : function(dataMap) {
					//返回成功 返回后更改评论数，同时将按钮灰显
					var newThumbsDown = dataMap.thumbsDown;
					if(newThumbsDown!=null && newThumbsDown!=''){
						alert("评论成功！该解决方案目前得到的差评为："+newThumbsDown+"个");
						$(e).attr("value","没用("+newThumbsDown+")").attr("disabled","disabled"); //没用disabled
						$(e).parent().find("input[type=button]").next().attr("disabled","disabled"); //有用disabled
					}
				}
			});
		}
	</script>

</head>

<body>
	<form id="searchEventSolutionForm"  method="post">
		<fieldset style="margin: 20px 0;">
			<legend style="text-align: left;">
				<b class="STYLE19">搜索相关解决方案</b>
			</legend>
		<table style="border: 0; cellspacing: 2px; cellpadding: 5px;">
			<tr>
				<td width="80" class="STYLE19">关键字：</td>
				<td><input type="text" id="keywords" name="eventSolutionForm.keywords" size="25" maxlength="100"
						title="如果有多个关键字，请用空格隔开(如：空调 无法启动)" /></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td><input type="button" id="searchEventSolution" name="searchEventSolution" class="STYLE19" value="&nbsp;搜  索&nbsp;" /></td>
			</tr>
		</table>
		<hr />
		<div id="eventSolution" style="display:none;">
			<table id="eventSolutionTable" class="stripe" width="100%" border="0"
				cellpadding="0" cellspacing="1" bgcolor="#a8c7ce">
				<tr>
					<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center">方案编号</div></td>
					<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center">类型</div></td>
					<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center">描述</div></td>
					<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center">解决方案</div></td>
					<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center">录入人</div></td>
					<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center">录入时间</div></td>
					<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center">操作</div></td>
				</tr>
			</table>
		</div>
		<div id="noEventSolution" style="display:none;">没有相关的解决方案！</div>
		</fieldset>
	</form>
	
	<!-- 查看事件解决方案对话框 -->
	<div id="viewEventSolutionDialog" title="事件解决方案">
  		<form>
  			<fieldset>
  				<table style="border: 0; cellspacing: 2px; cellpadding: 5px;">
					<tr>
						<td valign="top" width="100">方案编号：</td>
						<td id="eventSolutionId-d"></td>
						<td valign="top" width="80"></td>
						<td valign="top" width="100">类型：</td>
						<td id="eventType-d"></td>
					</tr>
					<tr>
						<td valign="top" width="100">录入人：</td>
						<td id="creatorName-d"></td>
						<td valign="top" width="80"></td>
						<td valign="top" width="100">类型：</td>
						<td id="creatorName2-d"></td>
					</tr>
				</table>
				<table style="border: 0; cellspacing: 2px; cellpadding: 5px;">
					<tr>
						<td valign="top" width="100">事件描述：</td>
						<td id="description-d"></td>
					</tr>
				</table>
				<p id="eventSolutionName">解决方案：</p>
				<table id="eventSolutionTable-d" style="border: 0; cellspacing: 2px; cellpadding: 5px;">
					
				</table>
			</fieldset>
  		</form>
	</div>
</body>
</html>

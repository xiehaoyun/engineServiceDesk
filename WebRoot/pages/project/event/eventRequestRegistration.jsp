<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/pages/common/taglib.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'eventRequestRegistration.jsp' starting page</title>
    <%@ include file="/pages/common/common.jsp"%>
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/scripts/jquery-ui/css/demos.css' />" />    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<script type="text/javascript">
   		$(function() {
			//可折叠项设置
			$("#accordion").accordion({collapsible : true,heightStyle: "content"});
			//多tab设置
			$("#tabs").tabs({collapsible : true});
			//输入提示
			$(document).tooltip({track: true});
			//button，统一为jq风格
			$("#resetProperty").button().click(function() {resetProperty();});
			$("#eventRequestRegistration").button().click(function() {eventRequestRegistration();});
			$("#generateWorkOrder").button().click(function() {generateWorkOrder();});
			$("#eventSummarize").button().click(function() {eventSummarize();}); 
			//机构信息展开/折叠
			var count = 0;
			$("#flip").click(function(){
				count++;
    			$(".panel").slideToggle("2000");
    			if (count%2==0) {
    				$("#flip").empty().append("折叠机构信息<img src='<c:url value="/resources/images/arrow_top.png" />'/>");
  				} else {
    				$("#flip").empty().append("展开机构信息<img src='<c:url value="/resources/images/arrow_down.png" />'/>");
  				}
			});
			//查询机构信息
			$("#searchOrgInfo").button().click(function() { searchOrgInfo(); });
			//根据建筑信息，如果运维区域信息不为空，获取设备位置信息
			$("#buildId").change(function(){
				var buildId = $("#buildId option:selected").val();
				//在建筑信息改变下，重新查询运维区信息，且清空设备位置信息
				if(buildId!=-1){
					initMaintAreaInfo();  //清空运维区域信息下拉表单
					initDevLocationInfo(); //清空设备位置信息下拉表单					
					searchMaintAreaInfo(buildId); //查询运维区域信息
				}
			});
			//根据运维区域信息，查找设备位置信息
			$("#maintAreaId").change(function(){
				var maintAreaId = $("#maintAreaId option:selected").val();
				//在建筑信息改变下，且选中的运维区不为空，则获取设备位置信息
				if(maintAreaId!=-1){
					initDevLocationInfo(maintAreaId); //清空设备位置信息下拉表单
					searchDevLocationInfo(maintAreaId);
				}
			});
			//根据设备信息，查询设备历史维修记录
			$("#devLocationId").change(function(){
				var devAssetsId = $("#devLocationId option:selected").val();
				//在设备信息改变下，且选中的设备信息不为空，则获取设备位置信息
				if(devAssetsId!=-1){
					searchHistoryMaintenanceRecord(devAssetsId);
				}
			});
			//搜索事件解决方案
			$("#searchEventSolution").button().click(function() {searchEventSolution();});			
			//隔行变色方法
			$("tr[name=maintenanceRecordTr]").hover(
        		function(){$(this).addClass('on');},
        		function(){$(this).removeClass('on');}
    		);
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
		//查询机构信息
		function searchOrgInfo(){
			var formData = $("#searchOrgInfoForm").serialize();
			$.ajax({
				url :  "<c:url value='/eventJson/searchOrgInfo.action' />",
				type : "POST",
				data : formData,
				dataType : "json",
				success : function(dataMap) {
					//暂时只显示一条信息,如果信息有误,则在进行搜索.如果列表为空,则提示
					if(dataMap.moOrgbaseinfoFormList.length==0){
						//清空变量值 先清空tr里面的信息
						$("#orgInfoTr").html("");
						$("#managerId,#managerName").attr("value","");
						//重新初始化建筑信息、运维区域信息、设备位置信息
  						initLocationInfo();
						alert("没有搜索到相应的机构信息，请重新搜索！");
						return;
					}else{
						//加入机构信息
						addOrgInfo(dataMap);
						//设置变量值
  						$("#orgName").attr("value",dataMap.moOrgbaseinfoFormList[0].FOrgname);
  						$("#managerId").attr("value",dataMap.moOrgbaseinfoFormList[0].FStaffId);
  						$("#managerName").attr("value",dataMap.moOrgbaseinfoFormList[0].FStaffName);
  						//重新初始化建筑信息、运维区域信息、设备位置信息
  						initLocationInfo();
  						//根据组织机构ID-查询建筑信息
  						searchBuildInfo(dataMap.moOrgbaseinfoFormList[0].FOrgcode);
  					}
				}
			});
		}
		//重新初始化建筑信息、运维区域信息、设备位置信息
		function initBulidInfo(){
			var $option=$("<option></option>");
			$option.attr("value",-1);
			$option.text("--请选择--");
			$("#buildId").empty().append($option);
		}
		function initMaintAreaInfo(){
			var $option=$("<option></option>");
			$option.attr("value",-1);
			$option.text("--请选择--");
			$("#maintAreaId").empty().append($option);
		}
		function initDevLocationInfo(){
			var $option=$("<option></option>");
			$option.attr("value",-1);
			$option.text("--请选择--");
			$("#devLocationId").empty().append($option);
		}
		function initLocationInfo(){
			initBulidInfo();
			initMaintAreaInfo();
			initDevLocationInfo();
		}
		//加入机构信息
		function addOrgInfo(dataMap){
			$("#orgInfo").show(); //隐藏机构信息打开
			$("#orgInfoTr").html(""); //先清空tr里面的信息
			$("#orgInfoTr").append("<td height='20' bgcolor='#FFFFFF' class='STYLE19'><div align='center'>"+dataMap.moOrgbaseinfoFormList[0].FOrgcode+"</div></td>"+
  				"<td height='20' bgcolor='#FFFFFF' class='STYLE19'><div align='center'>"+dataMap.moOrgbaseinfoFormList[0].FOrgname+"</div></td>"+
  				"<td height='20' bgcolor='#FFFFFF' class='STYLE19'><div align='center'>"+ChangeTimeFormat(dataMap.moOrgbaseinfoFormList[0].FStartTime)+"</div></td>"+
  				"<td height='20' bgcolor='#FFFFFF' class='STYLE19'><div align='center'>"+ChangeTimeFormat(dataMap.moOrgbaseinfoFormList[0].FEndTime)+"</div></td>"+
  				"<td height='20' bgcolor='#FFFFFF' class='STYLE19'><div align='center'>"+dataMap.moOrgbaseinfoFormList[0].FState+"</div></td>"+
  				"<td height='20' bgcolor='#FFFFFF' class='STYLE19'><div align='center'>"+dataMap.moOrgbaseinfoFormList[0].FDescription+"</div></td>"+
  				"<td height='20' bgcolor='#FFFFFF' class='STYLE19'><div align='center'>"+dataMap.moOrgbaseinfoFormList[0].FStaffId+"</div></td>"+
  				"<td height='20' bgcolor='#FFFFFF' class='STYLE19'><div align='center'>"+dataMap.moOrgbaseinfoFormList[0].FStaffName+"</div></td>"+
  				"<td height='20' bgcolor='#FFFFFF' class='STYLE19'><div align='center'>"+dataMap.moOrgbaseinfoFormList[0].FStaffTel+"</div></td>");
		};
		//根据组织机构ID-查询建筑信息
		function searchBuildInfo(orgcode){
			$.ajax({
				url : "<c:url value="/eventJson/searchBuildInfo.action" />",
				type : "POST",
				data : {"moOrgbaseinfoForm.FOrgcode": orgcode},
				dataType : "json",
				success : function(dataMap) {
					//如果组织机构下没有查询到建筑信息，提示
					if(dataMap.bdBuildbaseinfoFormList.length==0){
						alert("该组织机构下没有建筑信息！");
					}else{
						//加入建筑信息
						for(var i=0;i<dataMap.bdBuildbaseinfoFormList.length;i++){
							var $option=$("<option></option>");
							$option.attr("value",dataMap.bdBuildbaseinfoFormList[i].FBuildid);
							$option.text(dataMap.bdBuildbaseinfoFormList[i].FBuildname);
							$("#buildId").append($option);
						}
					}
  				}
			});
		};
		//根据建筑信息-查询运维区域信息
		function searchMaintAreaInfo(buildId){
			$.ajax({
				url : "<c:url value="/eventJson/searchMaintAreaInfo.action" />",
				type : "POST",
				data : {"bdBuildbaseinfo.FBuildid": buildId},
				dataType : "json",
				success : function(dataMap) {
					//如果该建筑下没有运维区域信息，提示
					if(dataMap.pdMaintareainfoFormList.length==0){
						alert("该建筑下没有运维区域信息！");
					}else{
						//运维区域信息
						for(var i=0;i<dataMap.pdMaintareainfoFormList.length;i++){
							var $option=$("<option></option>");
							$option.attr("value",dataMap.pdMaintareainfoFormList[i].FMaintareaid);
							$option.text(dataMap.pdMaintareainfoFormList[i].FMaintareaname+"（第"+dataMap.pdMaintareainfoFormList[i].FFloornum+"层）");
							$("#maintAreaId").append($option);
						}
					}
  				}
			});
		};
		//根据建筑信息，运维区域获得设备位置信息
		function searchDevLocationInfo(maintAreaId){
			$.ajax({
				url : "<c:url value="/eventJson/searchDevLocationInfo.action" />",
				type : "POST",
				data : {"pdMaintareainfo.FMaintareaid": maintAreaId},
				dataType : "json",
				success : function(dataMap) {
					//如果该运维区域下没有设备位置信息，提示
					if(dataMap.pdDevlocationinfoFormList.length==0){
						alert("该运维区域下没有设备位置信息！");
					}else{
						//加入设备位置信息
						for(var i=0;i<dataMap.pdDevlocationinfoFormList.length;i++){
							var $option=$("<option></option>");
							$option.attr("value",dataMap.pdDevlocationinfoFormList[i].FDevAssetsId);
							$option.text(dataMap.pdDevlocationinfoFormList[i].FDevlocationname);
							$("#devLocationId").append($option);
						}
					}
  				}
			});	
		};
		//简单转换时间格式
		function ChangeTimeFormat(time) {
			if(time==null || time==''){
				return time;
			}
    		var newTime = time.replace("T"," ");
    		return newTime;
		};
		//根据设备资产id，查询该设备资产的历史维修记录
		function searchHistoryMaintenanceRecord(devAssetsId){
			$.ajax({
				url : "<c:url value="/eventJson/searchHistoryMaintenanceRecord.action" />",
				type : "POST",
				data : {"pdDevassetsinfo.FDevassetsid": devAssetsId},
				dataType : "json",
				success : function(dataMap) {
					//如果该运维区域下没有设备位置信息，提示
					if(dataMap.eventWorkOrderFormList.length==0){
						$("#maintenanceRecord").hide();
						$("#noMaintenanceRecord").show();
					}else{
						$("#noMaintenanceRecord").hide();	
						$("#maintenanceRecord").show(); //隐藏机构信息打开
						$("tr[name='maintenanceRecordTr']").remove(); //清空历史维修记录
						//加入设备位置信息
						for(var i=0;i<dataMap.eventWorkOrderFormList.length;i++){
							$("#maintenanceRecordTable").append("<tr name='maintenanceRecordTr'>"+
								"<td height='20' bgcolor='#FFFFFF' class='STYLE19'><div align='center'>"+dataMap.eventWorkOrderFormList[i].eventWorkOrderId+"</div></td>"+
  								"<td height='20' bgcolor='#FFFFFF' class='STYLE19'><div align='center'>"+dataMap.eventWorkOrderFormList[i].eventType+"</div></td>"+
  								"<td height='20' bgcolor='#FFFFFF' class='STYLE19'><div align='center'>"+dataMap.eventWorkOrderFormList[i].eventLevel+"</div></td>"+
  								"<td height='20' bgcolor='#FFFFFF' class='STYLE19'><div align='center'>"+dataMap.eventWorkOrderFormList[i].description+"</div></td>"+
  								"<td height='20' bgcolor='#FFFFFF' class='STYLE19'><div align='center'>"+dataMap.eventWorkOrderFormList[i].eventStatus+"</div></td>"+
  								"<td height='20' bgcolor='#FFFFFF' class='STYLE19'><div align='center'>"+ChangeTimeFormat(dataMap.eventWorkOrderFormList[i].requestTime)+"</div></td>"+
  								"<td height='20' bgcolor='#FFFFFF' class='STYLE19'><div align='center'>"+ChangeTimeFormat(dataMap.eventWorkOrderFormList[i].solveTime)+"</div></td>"+
  								"<td height='20' bgcolor='#FFFFFF' class='STYLE19'><div align='center'>详情</div></td></tr>");						
						}
					}
  				}
			});
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
		//重置
		function resetProperty(){
		};
		//录入事件
		function eventRequestRegistration(){
		};
		//生成工单
		function generateWorkOrder(){
		};
		//取消，回到事件汇总页面 
		function eventSummarize(){
		};
		
		
	</script>	
	<style type="text/css"> 
		div.panel,p.flip{
			margin:0px;
			padding:0px;
			text-align:center;
			border:solid 2px #e6e6e6;
		}
		p.flip{
		background:#e6e6e6;
		}
	</style>

	<style>
		tr.even{ background:#9C6 }
		tr.odd { background:#fff; }
		tr.on{ background:#FC6 }
	</style>

  </head>
  
  <body>
  	<!-- <h3 align="center">事件登记</h3> -->
  	
	<p id="flip" class="flip">折叠机构信息<img src="<c:url value='/resources/images/arrow_top.png' />"/></p>
	<form id="searchOrgInfoForm" action="searchOrgInfo.action" method="post">
		<div class="panel">		
		<fieldset style="margin: 20px 0;">
			<legend style="text-align: left;">
				<b>机构信息搜索</b>
			</legend>
			<table style="border: 0; cellspacing: 2px; cellpadding: 5px;">
				<tr>
					<td valign="top" height="20" width="100" class="STYLE19">&nbsp;&nbsp;公司代码：<input name="moOrgbaseinfoForm.FOrgcode"></td>
					<td valign="top" height="20" width="100" class="STYLE19">&nbsp;&nbsp;公司名称：<input name="moOrgbaseinfoForm.FOrgName"></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td><input type="button" id="searchOrgInfo" name="searchOrgInfo" value="&nbsp;搜  索&nbsp;"/></td>
				</tr>
			</table>
		</fieldset>
		
		<fieldset id="orgInfo" style="margin: 20px 0; display:none;">
			<legend style="text-align:left; "><b>机构相关信息</b></legend>
			<div id="orgInfoShow">
				<table id="orgInfoTable" width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#a8c7ce" >
					<tr>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center">机构代码</div></td>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center">详细名称</div></td>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center">服务开始时间</div></td>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center">服务结束时间</div></td>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center">服务状态</div></td>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center">备注</div></td>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center">客户经理ID</div></td>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center">客户经理姓名</div></td>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center">客户经理联系电话</div></td>				
					</tr>
					<tr id="orgInfoTr">
					</tr>
				</table>
			</div>
		</fieldset>
		</div>
	</form>
	
	<form id="eventRequestRegistrationForm" action="eventRequestRegistration.action" method="post">
		<!-- 隐藏变量 -->
		<input type="hidden" id="managerId" name="eventRequest.managerId"/> <!-- 客户经理Id -->
		<input type="hidden" id="managerName" name="eventRequest.managerName"/> <!-- 客户经理姓名 -->
		<input type="hidden" id="buildName" name="eventRequest.buildName"/> <!-- 建筑名称 -->
		<input type="hidden" id="maintAreaName" name="eventRequest.maintAreaName"/> <!-- 运维区域名称 -->
		<input type="hidden" id="deviceLocationName" name="eventRequest.deviceLocationName"/> <!-- 设备位置名称 -->
		<input type="hidden" id="deviceAssetId" name="eventRequest.deviceAssetId"/> <!-- 设备资产ID -->
		
		<fieldset style="margin: 20px 0;">
			<legend style="text-align: left;"><b>事件登记</b></legend>
			<table style="border: 0; cellspacing: 2px; cellpadding: 5px;">
				<tr>
					<td valign="top" width="100">记录人ID：</td>
					<td><input type="text" id="creatorId" name="eventRequest.creatorId" size="25" maxlength="100"
							readonly="readonly" value="<%=request.getParameter("userId")%>" />
					</td>
					<td valign="top" width="80"></td>
					<td valign="top" width="100">记录人姓名：</td>
					<td><input type="text" id="creatorName" name="eventRequest.creatorName" size="25" maxlength="100"
							readonly="readonly" value="<%=new String(request.getParameter("userName").getBytes("ISO8859-1"),"UTF-8")%>" />
					</td>
				</tr>
			</table>
			<table style="border: 0; cellspacing: 2px; cellpadding: 5px;">
				<tr>
					<td valign="top" width="100">事件来源：</td>
					<td><select id="eventSource" name="eventRequest.eventSource" class="sel00">
							<option value="1">电话</option>
							<option value="2">邮件</option>
							<option value="3">QQ消息</option>
							<option value="4">电话传真</option>
							<option value="4">其他</option>
					</select></td>
				</tr>
				<tr><!-- 事件位置包括 1.机构详细名称 2.建筑名称 3.运维区域信息 4.设备位置信息（设备位置信息跟设备资产信息一一对应） -->
					<td valign="top" width="100">事件位置：</td>
					<td><input type="text" id="orgName" name="eventRequest.orgName" size="25" maxlength="100" readonly="readonly"/>
						<select id="buildId" class="sel00"><!-- 根据机构信息得到建筑名称 -->
							<option value="-1">--请选择--</option>
						</select>
						<select id="maintAreaId" class="sel00"><!-- 根据机构信息得到运维区域信息 -->
							<option value="-1">--请选择--</option>
						</select>
						<select id="devLocationId" class="sel00"><!-- 根据建筑信息、运维区域信息得到设备资产信息 -->
							<option value="-1">--请选择--</option>
						</select>
					</td>
				</tr>
				<tr>
					<td valign="top" width="100">事件描述：</td>
					<%-- 输入框为输入时，显示提示信息，鼠标点击时默认值消失 --%>
					<td><textarea id="eventDescription" name="eventRequest.eventDescription" cols="50" rows="3" class="tex_00"
							onfocus="if('在这里写下客户的事件描述……'==this.value)this.value=''">在这里写下客户的事件描述……</textarea>
					</td>
				</tr>
				<tr>
					<td valign="top" width="100">事件类型：</td>
					<td><select id="eventType" name="eventRequest.eventType" onclick="searchCase()" class="sel00">
							<option value="">--请选择--</option>
							<option value="">电话咨询</option>
					</select></td>
				</tr>
				<tr>
					<td valign="top" width="100">事件级别：</td>
					<td><select id="eventLevel" name="eventRequest.eventLevel" class="sel00">
							<option value="1">普通&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</option>
							<option value="2">中等</option>
							<option value="3">紧急</option>
					</select></td>
				</tr>
				<tr>
					<td valign="top" width="100">采用方案：</td>
					<td><input type="text" id="recordId" name="eventRequest.recordId" size="25" maxlength="100"
							title="采用方案必须确实存在"/>
					</td>
				</tr>
				<tr>
					<td valign="top" width="100">完成日期：</td>
					<td><input type="text" id="limitTime"
						name="eventRequest.limitTime" size="25"
						onclick="WdatePicker({startDate:'%y-%M-%d %H:%m:%s',dateFmt:'yyyy-MM-dd HH:mm:ss',alwaysUseStartDate:true})"
						class="Wdate" />
					</td>
				</tr>
				<tr>
					<td valign="top" width="100">服务记录：</td>
					<%-- 输入框为输入时，显示提示信息，鼠标点击时默认值消失 --%>
					<td><textarea id="serviceRecord"
							name="eventRequest.serviceRecord" cols="50" rows="3"
							class="tex_00"
							onfocus="if('在这里写下自己的服务记录……'==this.value)this.value=''">在这里写下自己的服务记录……</textarea>
					</td>
				</tr>

			</table>
			<hr/>
			<div>
				<input type="reset" id="resetProperty" name="resetProperty" onclick="viewEventSolutinoInfo(1)" value="重&nbsp;&nbsp;置"/>
				<input type="button" id="eventRequestRegistration" name="eventRequestRegistration" value="录入事件"/>
				<input type="button" id="generateWorkOrder" name="generateWorkOrder" value="生成工单"/>
				<input type="button" id="eventSummarize" name="eventSummarize" value="取&nbsp;&nbsp;消"/>
			</div>

		</fieldset>

	</form>

	<div id="tabs">
		<ul>
			<li><a href="#jqtabs-1">历史维修记录</a></li>
			<li><a href="#jqtabs-2">解决方案搜索</a></li>
			<li><a href="#jqtabs-3">历史维修记录111</a></li>
		</ul>
		<div id="jqtabs-1">
			<div id="maintenanceRecord" style="display:none;">
				<table id="maintenanceRecordTable" width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#a8c7ce" >
					<tr>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center">工单号</div></td>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center">类型</div></td>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center">级别</div></td>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center">描述</div></td>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center">状态</div></td>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center">生成日期</div></td>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center">完成日期</div></td>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center">操作</div></td>				
					</tr>
				</table>
			</div>
			<div id="noMaintenanceRecord" style="display:none;">没有相关的历史维修记录！</div>
		</div>
		<div id="jqtabs-2">
			<form id="searchEventSolutionForm" action="searchEventSolution.action" method="post">
				<table style="border: 0; cellspacing: 2px; cellpadding: 5px;">
				<tr>
					<td width="80">关键字：</td>
					<td><input type="text" id="keywords" name="eventSolutionForm.keywords" size="25" maxlength="100" 
							title="如果有多个关键字，请用空格隔开(如：空调 无法启动)"/></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td><input type="button" id="searchEventSolution" name="searchEventSolution" value="&nbsp;搜  索&nbsp;"/></td>
				</tr>
				</table>
				<hr />
				<div id="eventSolution" style="display:none;">
					<table id="eventSolutionTable" class="stripe" width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#a8c7ce" >
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
			</form>
		</div>
		<div id="jqtabs-3">
			<div id="accordion">
				<h3>Section 1</h3>
				<div>
					<p>Sed non urna. Donec et ante. Phasellus eu ligula. </p>
				</div>
				<h3>Section 2</h3>
				<div>
					<p>Nam enim risus, molestie et, porta ac</p>
					
				</div>
			</div>

		</div>
	</div>

	<hr />
	
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

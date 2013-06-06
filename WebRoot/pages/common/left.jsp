<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="taglib.jsp"%>
<html>
	<head>
		<title>left</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<%@ include file="common.jsp"%>
	<style>
		body {
			background-color: white;
			margin:0; padding:0;
			text-align: center;
		}
		div, p,table, th, td {
			list-style:none;
			margin:0; padding:0;
			color:#333; font-size:12px;
			font-family:dotum, Verdana, Arial, Helvetica, AppleGothic, sans-serif;
		}
  	</style>
		
	<link rel="stylesheet" href="<c:url value='/resources/scripts/jquery-ztree/css/zTreeStyle/zTreeStyle.css' />" type="text/css">
	<!-- 此处用的jquery版本为1.4.4，高版本这里用不了  -->
	<script type="text/javascript" src="<c:url value='/resources/scripts/jquery-ztree/js/jquery-1.4.4.min.js' />"></script>
	<script type="text/javascript" src="<c:url value='/resources/scripts/jquery-ztree/js/jquery.ztree.core-3.5.js' />"></script>		

	<SCRIPT type="text/javascript">
		$(function() {
			init(); ////初始化页面信息，初始化目录树
			var t = $("#tree");
			t = $.fn.zTree.init(t, setting, zNodes); //生成目录树
			//var zTree = $.fn.zTree.getZTreeObj("tree");
			//zTree.selectNode(zTree.getNodeByParam("id", 101));
			
			$("#expandAllBtn").bind("click", {type:"expandAll"}, expandNode);
			$("#collapseAllBtn").bind("click", {type:"collapseAll"}, expandNode);			
	  	});
	
		//设置zTree属性
		var zTree;
		var setting = {
			view : {
				dblClickExpand : false,
				showLine : true,
				selectedMulti : false,
				expandSpeed: ($.browser.msie && parseInt($.browser.version)<=6)?"":"fast"
			},
			data : {
				simpleData : {
				enable:true,
				idKey: "id",
				pIdKey: "pId",
				rootPId: ""
				}
			},
			callback: {
				beforeClick: function(treeId, treeNode) {
				var zTree = $.fn.zTree.getZTreeObj("tree");
				if (treeNode.isParent) {
					zTree.expandNode(treeNode);
					return false;
				} else {
					demoIframe.attr("src",treeNode.file + ".html");
					return true;
				}
			}
		}
		};
		var zNodes = []; //树节点
		var beginVar = 0;
		
		//初始化函数
	  	function init(){
			//获得角色信息
		 	//加入树节点
	 	 	
	 	 		dTreeBegin("事件管理");
	 	 		workList(); //任务列表
	 	 		knowledgeBase(); //知识库
	 	 		customerInfo(); //客户资料
	 	 		workOrderInfo();
	 	 		configPlan();
	 	 		configData();
	 	 		operateData();
	 	 	
		}
		
		//关闭、打开目录树节点
		function expandNode(e) {
			var zTree = $.fn.zTree.getZTreeObj("tree"),
			type = e.data.type,
			nodes = zTree.getSelectedNodes();
			
			if (type == "expandAll") {
				zTree.expandAll(true);
			} else if (type == "collapseAll") {
				zTree.expandAll(false);
			}
		}
		//目录树开始
		function dTreeBegin(treeName){
			zNodes.push({ id:++beginVar, pId:0, name:treeName, open:true, iconOpen:"<c:url value='/resources/scripts/jquery-ztree/css/zTreeStyle/img/diy/1_open.png' />", iconClose:"<c:url value='/resources/scripts/jquery-ztree/css/zTreeStyle/img/diy/1_close.png' />"});
		}
		//任务列表
		function workList(){
			var firstIndex = 1; //第一层
			var secondIndex = 0; //第二层
			var thirdIndex = 0;//第三层
			
			var userId = "111";
			var userName ="name";
			
			zNodes.push({ id:++beginVar, pId:firstIndex, name:"任务列表", open:true});
				secondIndex = beginVar;
				zNodes.push({ id:++beginVar, pId:secondIndex, name:"事件管理", open:true});
					thirdIndex = beginVar;
					zNodes.push({ id:++beginVar, pId:thirdIndex, name:"事件登记", url:"http://localhost:8080/engineServiceDesk/pages/project/event/eventRequestRegistration.jsp?userId="+userId+"&userName="+userName+"", target:"right"});
					zNodes.push({ id:++beginVar, pId:thirdIndex, name:"事件升级", url:"http://localhost:8080/resourceService/faces/caseMgt.jsp?user=HHL",target:"right"});
					zNodes.push({ id:++beginVar, pId:thirdIndex, name:"事件汇总", url:"http://localhost:8080/engineServiceDesk/event/searchEventRequest.action?eventRequest.creatorId="+userId+"", target:"right"});
					zNodes.push({ id:++beginVar, pId:thirdIndex, name:"事件查询", url:"http://localhost:8080/engineServiceDesk/pages/project/event/searchEventRequest.jsp", target:"right"});
				zNodes.push({ id:++beginVar, pId:secondIndex, name:"工单管理",target:"right"});
					thirdIndex = beginVar;
					zNodes.push({ id:++beginVar, pId:thirdIndex, name:"我的工单汇总",target:"right"});
					zNodes.push({ id:++beginVar, pId:thirdIndex, name:"工单查询",target:"right"});
				zNodes.push({ id:++beginVar, pId:secondIndex, name:"业务管理",target:"right"});
					thirdIndex = beginVar;
					zNodes.push({ id:++beginVar, pId:thirdIndex, name:"业务登记",target:"right"});						
		}
		
		//知识库
		function knowledgeBase(){
			var firstIndex = 1; //第一层
			var secondIndex = 0; //第二层
			var thirdIndex = 0;//第三层
			
			zNodes.push({ id:++beginVar, pId:firstIndex, name:"知识库", open:true});
				secondIndex = beginVar;
				zNodes.push({ id:++beginVar, pId:secondIndex, name:"常见故障与解决方案", url:"http://www.baidu.com",target:"right"});
				zNodes.push({ id:++beginVar, pId:secondIndex, name:"搜索相关解决方案", url:"http://localhost:8080/engineServiceDesk/pages/project/event/searchEventSolution.jsp",target:"right"});	
		}
		
		//客户资料
		function customerInfo(){
			var firstIndex = 1; //第一层
			var secondIndex = 0; //第二层
			var thirdIndex = 0;//第三层
			
			zNodes.push({ id:++beginVar, pId:firstIndex, name:"客户管理", open:true});
				secondIndex = beginVar;
				zNodes.push({ id:++beginVar, pId:secondIndex, name:"客户资料", url:"http://www.baidu.com",target:"right"});
		}
		
		//工单信息
		function workOrderInfo(){
			var firstIndex = 1; //第一层
			var secondIndex = 0; //第二层
			var thirdIndex = 0;//第三层
			
			zNodes.push({ id:++beginVar, pId:firstIndex, name:"工单信息", open:true});
				secondIndex = beginVar;
				zNodes.push({ id:++beginVar, pId:secondIndex, name:"待处理工单", url:"http://www.baidu.com", target:"right"});
				zNodes.push({ id:++beginVar, pId:secondIndex, name:"处理中工单", url:"http://www.baidu.com", target:"right"});
					thirdIndex = beginVar;
					zNodes.push({ id:++beginVar, pId:thirdIndex, name:"处理中",target:"right"});
					zNodes.push({ id:++beginVar, pId:thirdIndex, name:"变更审核中",target:"right"});
					zNodes.push({ id:++beginVar, pId:thirdIndex, name:"审核已通过",target:"right"});
				zNodes.push({ id:++beginVar, pId:secondIndex, name:"审核中工单", url:"http://www.baidu.com", target:"right"});
				zNodes.push({ id:++beginVar, pId:secondIndex, name:"已处理工单", url:"http://www.baidu.com", target:"right"});
				zNodes.push({ id:++beginVar, pId:secondIndex, name:"工单汇总", url:"http://www.baidu.com", target:"right"});								
		}
		
		//配置计划
		function configPlan(){
			var firstIndex = 1; //第一层
			var secondIndex = 0; //第二层
			var thirdIndex = 0;//第三层
			
			zNodes.push({ id:++beginVar, pId:firstIndex, name:"配置计划", open:true});
				secondIndex = beginVar;
				zNodes.push({ id:++beginVar, pId:secondIndex, name:"配置登记表", url:"http://localhost:8080/engineServiceDesk/pages/project/config/MyJsp.jsp", target:"right"});
				zNodes.push({ id:++beginVar, pId:secondIndex, name:"录入设备/部件信息", url:"http://www.baidu.com", target:"right"});
				zNodes.push({ id:++beginVar, pId:secondIndex, name:"导入数据", url:"http://www.baidu.com", target:"right"});
		}
		
		//维护配置数据
		function configData(){
			var firstIndex = 1; //第一层
			var secondIndex = 0; //第二层
			var thirdIndex = 0;//第三层
			
			zNodes.push({ id:++beginVar, pId:firstIndex, name:"维护配置数据", open:true});
				secondIndex = beginVar;
				zNodes.push({ id:++beginVar, pId:secondIndex, name:"确认配置变更", open:true});
					thirdIndex = beginVar;
					zNodes.push({ id:++beginVar, pId:thirdIndex, name:"待确认", url:"http://www.baidu.com", target:"right"});
					zNodes.push({ id:++beginVar, pId:thirdIndex, name:"已拒绝", url:"http://www.baidu.com", target:"right"});
					zNodes.push({ id:++beginVar, pId:thirdIndex, name:"已确认", url:"http://www.baidu.com", target:"right"});
				zNodes.push({ id:++beginVar, pId:secondIndex, name:"修改配置数据", open:true});
					thirdIndex = beginVar;
					zNodes.push({ id:++beginVar, pId:thirdIndex, name:"修改区域信息", url:"http://localhost:8080/engineServiceDesk/pages/project/config/modifyMaintAreaInfo.jsp", target:"right"});
					zNodes.push({ id:++beginVar, pId:thirdIndex, name:"修改电路信息", url:"http://www.baidu.com", target:"right"});
					zNodes.push({ id:++beginVar, pId:thirdIndex, name:"修改设备/部件信息", url:"http://localhost:8080/engineServiceDesk/pages/project/config/modifyDeviceInfo.jsp", target:"right"});								
		}
		
		//查询/导出配置数据
		function operateData(){
			var firstIndex = 1; //第一层
			var secondIndex = 0; //第二层
			var thirdIndex = 0;//第三层
			
			zNodes.push({ id:++beginVar, pId:firstIndex, name:"查询/导出配置数据", url:"http://www.baidu.com", open:true});							
		}
	
	</SCRIPT>
	</HEAD>

	<BODY>
	<div id="treeId">
		<p align="left">
			<a href="#" id="expandAllBtn" style="font-family: Verdana, Geneva, Arial, Helvetica, sans-serif;font-size: 11px;color: #333; text-decoration: none;">
			打开全部结点</a>| <a href="#" id="collapseAllBtn" style="font-family: Verdana, Geneva, Arial, Helvetica, sans-serif;font-size: 11px;color: #333; text-decoration: none;">
			关闭全部结点</a>
		</p>
		<ul id="tree" class="ztree" style="width:220px; overflow:auto;"></ul>
	</div>

</BODY>
</HTML>


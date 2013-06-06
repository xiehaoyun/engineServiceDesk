<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="taglib.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>left</title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<%@ include file="common.jsp"%>
		
	<style type="text/css">
	<!--
	body {
		margin-left: 0px;
		margin-top: 0px;
		margin-right: 0px;
		margin-bottom: 0px;
	}
	-->
	</style>
	
	<script type="text/javascript" charset="UTF-8">
	 	$(function() {
			init(); ////初始化页面信息，初始化目录树
	  	});
	  	
	  	d = new dTree('d');	
	  	var beginVar = 0;
	  	
	  	//初始化函数
	  	function init(){
			//获得角色信息，
	  		var role=1;
	 	 	//绘制目录树
	 	 	if(role=1){
	 	 		dTreeBegin("事件管理");
	 	 		workList(); //任务列表
	 	 		knowledgeBase(); //知识库
	 	 		customerInfo(); //客户资料
	 	 		workOrderInfo();
	 	 		$("#dtreeId").append(""+d+"");  //加入目录树
	 	 	}
		}
		
		//目录树开始
		function dTreeBegin(dTreeName){
			d.add(0, -1, dTreeName, '');
		}
		
		//任务列表
		function workList(){
			var firstIndex = 0; //第一层
			var secondIndex = 0; //第二层
			var thirdIndex = 0//第三层
			d.add(++beginVar, firstIndex, '任务列表', '');
				secondIndex = beginVar;
				d.add(++beginVar, secondIndex, '事件管理', '');
					thirdIndex = beginVar;	
					d.add(++beginVar, thirdIndex, '事件登记',"http://www.baidu.com",'事件登记', 'right');
					d.add(++beginVar, thirdIndex, '事件升级',"www.baidu.com",'事件升级', 'right');
					d.add(++beginVar, thirdIndex, '事件汇总',"www.baidu.com",'事件汇总', 'right');
					d.add(++beginVar, thirdIndex, '事件查询',"www.baidu.com",'事件查询', 'right');
				d.add(++beginVar, secondIndex, '工单管理', '');
					thirdIndex = beginVar;
					d.add(++beginVar, thirdIndex, '我的工单汇总',"http://localhost:8080/resourceService/faces/Login.jsp",'我的工单汇总', 'right');
					d.add(++beginVar, thirdIndex, '工单查询',"http://localhost:8080/resourceService/faces/Login.jsp",'工单查询', 'right');
				d.add(++beginVar, secondIndex, '业务管理', '');
					thirdIndex = beginVar;
					d.add(++beginVar, thirdIndex, '业务登记',"http://localhost:8080/resourceService/faces/Login.jsp",'业务登记', 'right');			
		}
		
		//知识库
		function knowledgeBase(){
			var firstIndex = 0; //第一层
			var secondIndex = 0; //第二层
			var thirdIndex = 0//第三层
			d.add(++beginVar, firstIndex, '知识库', '');
				secondIndex = beginVar;
				d.add(++beginVar, secondIndex,'常见故障与解决方案',"http://www.baidu.com",'常见故障与解决方案', 'right');
				d.add(++beginVar, secondIndex,'搜索相关解决方案',"http://www.baidu.com",'搜索相关解决方案', 'right');			
		}
		
		//客户资料
		function customerInfo(){
			var firstIndex = 0; //第一层
			var secondIndex = 0; //第二层
			var thirdIndex = 0//第三层
			d.add(++beginVar, firstIndex, '客户管理', '');
				secondIndex = beginVar;
				d.add(++beginVar, secondIndex,'客户资料',"http://www.baidu.com",'客户资料', 'right');
		}
		
		//工单信息
		function workOrderInfo(){
			var firstIndex = 0; //第一层
			var secondIndex = 0; //第二层
			var thirdIndex = 0//第三层
			d.add(++beginVar, firstIndex, '工单信息', '');
				secondIndex = beginVar;
				d.add(++beginVar, secondIndex, '待处理工单',"http://www.baidu.com",'待处理工单', 'right');
				d.add(++beginVar, secondIndex, '处理中工单', '');
					thirdIndex = beginVar;	
					d.add(++beginVar, thirdIndex, '处理中',"http://www.baidu.com",'处理中', 'right');
					d.add(++beginVar, thirdIndex, '变更审核中',"www.baidu.com",'变更审核中', 'right');
					d.add(++beginVar, thirdIndex, '审核已通过',"www.baidu.com",'审核已通过', 'right');
				d.add(++beginVar, secondIndex, '审核中工单',"http://www.baidu.com",'审核中工单', 'right');
				d.add(++beginVar, secondIndex, '已处理工单',"http://www.baidu.com",'已处理工单', 'right');
				d.add(++beginVar, secondIndex, '工单汇总',"http://www.baidu.com",'工单汇总', 'right');				
		}	
		
			
		</script>
	</head>

<body>
	<div id="dtreeId" class="dtree">
		<p>
			<a href="javascript: d.openAll();">打开全部结点</a> | <a href="javascript: d.closeAll();">关闭全部结点</a>
		</p>
	</div>
</body>
</html>

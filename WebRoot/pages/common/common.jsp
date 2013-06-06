<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">    

<!-- 日期 -->	
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/scripts/My97DatePicker/skin/WdatePicker.css' />" />
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/scripts/dtree/css/dtree.css' />" />
<!-- jquery ui css -->
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/scripts/jquery-ui/css/ui-lightness/jquery-ui-1.10.0.custom.min.css' />" />

<!--jquery的声明必须在jquery ui的声明之前，不然会造成界面显示错误，导致tab无法展开、默认隐藏的信息无法隐藏，以及无法搜索等等-->
<!-- jquery -->
<script type="text/javascript" src="<c:url value='/resources/scripts/jquery/jquery-1.9.0.min.js' />"></script>
<!-- jquery ui -->
<script type="text/javascript" src="<c:url value='/resources/scripts/jquery-ui/js/jquery-ui-1.10.0.custom.min.js' />"></script>

<!-- 日期 -->
<script type="text/javascript" src="<c:url value='/resources/scripts/My97DatePicker/WdatePicker.js' />"></script>
<!-- 目录树 -->
<script type="text/javascript" src="<c:url value='/resources/scripts/dtree/js/dtree.js' />"></script>
<!-- 项目常用 -->
<script type="text/javascript" src="<c:url value='/resources/scripts/project/common.js' />"></script>


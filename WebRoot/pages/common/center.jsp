<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="taglib.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>center</title>
	<%@ include file="common.jsp"%>
	
	<style type="text/css">
	<!--
	body {
		margin-left: 0px;
		margin-top: 0px;
		margin-right: 0px;
		margin-bottom: 0px;
		overflow: hidden;
	}
	-->
	</style>
</head>

<body>
	<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td width="8" bgcolor="#353c44">&nbsp;</td>
			<td width="220px" valign="top">
				<iframe height="100%" width="100%" frameborder="0" src="left.jsp" name="left"></iframe>
			</td>
			<td width="10" bgcolor="#add2da">&nbsp;</td>
			<td valign="top">
				<iframe height="100%" width="100%" frameborder="0" src="right.jsp" name="right"></iframe>
			</td>
			<td width="8" bgcolor="#353c44">&nbsp;</td>
		</tr>
	</table>
</body>

</html>

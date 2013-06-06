<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  	<form action="addEvent.action" method="post">
  		EventType:<input type="text" name="event.FEventtype"/>
  		EventSource:<input type="text" name="event.FEventsource"/>
        <input type="submit" name = "addEvent" value="addEvent" />
    </form>
    <form action="findSameTypeEvent.action" method="post">
  		EventType:<input type="text" name="event.FEventtype"/>
        <input type="submit" name = "findSameTypeEvent" value="findSameTypeEvent" />
    </form>
    <form action="addStaff.action" method="post">
  		StaffName:<input type="text" name="staff.FStaffname"/>
  		StaffSex:<input type="text" name="staff.FStaffsex"/>
        <input type="submit" name = "addStaff" value="addStaff" />
    </form>
    <form action="addWorkorder.action" method="post">
  		EventID:<input type="text" name="EventID"/>
  		StaffID:<input type="text" name="StaffID"/>
  		<hr>
  		Workorderlevel:<input type="text" name="workorder.FWorkorderlevel">
        <input type="submit" name = "addWorkorder" value="addWorkorder" />
    </form>
  </body>
</html>

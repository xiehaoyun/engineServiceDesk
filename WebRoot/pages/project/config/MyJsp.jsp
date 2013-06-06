<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/pages/common/taglib.jsp"%>
<html>
  <head>
  <title>My JSP 'MyJsp.jsp' starting page</title>
    <%@ include file="/pages/common/common.jsp"%>
	
	<script type="text/javascript">
   		$(function() {
			
			//查询机构信息
			$("#go").button().click(function() { go(); });
		
			
		});
   		
		function go(){
			$.ajax({
				url : "<c:url value="/config/demo.action" />",
				type : "POST",
				data : {},
				dataType : "json",
				success : function(dataMap) {
					alert("hello");
					
  				}
			});
		}
    </script>

  </head>
  
  <body>
   <input type="button" id="go" value="submit"></input>
  </body>
</html>

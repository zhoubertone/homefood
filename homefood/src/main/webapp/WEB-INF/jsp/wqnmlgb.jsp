<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<title>测试</title>
  </head>
  
 
  <body>
  <form method="get">
   action="<%=request.getContextPath()%>/user.do?method=add">
  </form>
    ${user.username}
  </body>
</html>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>05_config</title>
</head>
<body>

	<%
	ServletConfig sc1 = config;
	ServletConfig sc2 = pageContext.getServletConfig();
	Enumeration en = config.getInitParameterNames();
	%>
	<h1>05_config</h1>
	config:<%=config %><br /> sc1:<%=sc1 %><br /> sc2:<%=sc2 %><br/>
	<%
	while (en.hasMoreElements()) {
		out.println(en.nextElement() + "<br/>");
	}
	%>
</body>
</html>
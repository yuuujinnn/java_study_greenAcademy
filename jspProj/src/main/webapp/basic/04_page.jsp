<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
HttpJspPage page2 = (HttpJspPage) page;
Enumeration en = this.getInitParameterNames();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>04_page</title>
</head>
<body>
	<h1>04_page</h1>

	this :
	<%=this%><br /> page :
	<%=page%><br /> page2 :
	<%=page2%><br /> servletInfo :
	<%=page2.getServletInfo()%><br /> servletName:
	<%=this.getServletName()%><br />

	<%
	while (en.hasMoreElements()) {
		out.println(en.nextElement() + "<br/>");
	}
	%>


</body>
</html>
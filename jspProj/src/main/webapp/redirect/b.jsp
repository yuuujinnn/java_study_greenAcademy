<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>redirect > b</title>
</head>
<body>
	<h1>redirect > b</h1>
	pname:<%=request.getAttribute("aaa") %>
	age:<%=request.getParameter("age") %>
	nick:<%=request.getParameter("nick") %>
</body>
</html>
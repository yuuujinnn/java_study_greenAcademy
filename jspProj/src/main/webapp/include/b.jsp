<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>include > b</title>
</head>
<body>
	<h1>include > b</h1>
	pname:<%=request.getAttribute("pname") %><br/>
	age:<%=request.getParameter("age") %><br/>
	nick:<%=request.getParameter("nick") %><br/>
</body>
</html>
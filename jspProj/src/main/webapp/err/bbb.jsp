<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="/excep/ex02.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bbb</title>
</head>
<body>
	<h1>bbb 입니다.</h1>
	<%
		int a = 10/0;
	
		out.println("정상 실행 1 " + a + "<br/>");
	%>
</body>
</html>
<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>numReg</title>
</head>
<body>
<%
	String [] noArr = request.getParameterValues("no");

	
	int sum = 0;
	for (String str : noArr) {
		try {
			int num = Integer.parseInt(str);
			if (num % 2 == 0) {
				sum += num;
			}
		} catch (Exception e) {
			System.out.println("에러 글자 : " + str);
		}
	}

%>
	<h1>numReg</h1>
	no: <%=request.getParameter("no") %><br/>
	noArr:<%=Arrays.toString(noArr) %><br/>
	nohap:<%=sum %><br/>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward > a</title>
</head>
<body>
	<h1>forward > a</h1>
	<script type="text/javascript">
		alert("돌아왔구나 육태식이")
	</script>
	<%
		request.setAttribute("pname", "ddd");
	%>
	<jsp:forward page="b.jsp?age=17" />
</body>
</html>
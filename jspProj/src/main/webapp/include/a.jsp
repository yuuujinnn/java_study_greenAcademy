<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>include > a</title>
</head>
<body>
	<h1>include > a</h1>
	<script type="text/javascript">
		alert("돌아왔구나 칠태식이")
	</script>
	<%
		request.setAttribute("pname", "fff");
	%>
	<jsp:include page="b.jsp?age=34" />
</body>
</html>
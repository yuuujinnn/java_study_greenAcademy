<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일반 회원가입</title>
</head>
<body>
	<script type="text/javascript">
		String [] number = request.getParameter("number");
		if (number[6] == 2) {
			alert("gg");
		}
	</script>
	<h1>일반 회원가입</h1>
	name:<%=request.getParameter("name") %>
	number:<%=request.getParameter("number") %>
</body>
</html>
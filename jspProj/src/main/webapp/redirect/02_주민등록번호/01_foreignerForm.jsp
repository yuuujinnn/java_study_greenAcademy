<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>외국인 회원가입</title>
</head>
<body>
	<script type="text/javascript">
		
		if (number[6].equals(2)) {
			location.href="adminForm.jsp";
		}
	</script>
	<h1>외국인 회원가입</h1>
	name:<%=request.getParameter("name") %>
	number:<%=request.getParameter("number") %>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>joinForm</title>
</head>
<body>
<h1>joinForm</h1>
<form action="joinReg.jsp">
	<table border="">
		<tr>
			<td>주민번호</td>
			<td><input type="text" name="jumin"  value="040802-1234567" /></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" name="pname" value="정우성" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
			<input type="submit" value="가입" /></td>
		</tr>
	</table>
</form>
</body>
</html>
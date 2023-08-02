<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>외쿡인</title>
</head>
<body>
<h1>외쿡인</h1>
<form action="?">
	<table border="">
		<tr>
			<td>생년월일</td>
			<td>
			<input type="text" name="year"  value="" />-
			<input type="text" name="month"  value="" />-
			<input type="text" name="day"  value="" /></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" name="pname" value="" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
			<input type="submit" value="가입" /></td>
		</tr>
	</table>
</form>
</body>
</html>
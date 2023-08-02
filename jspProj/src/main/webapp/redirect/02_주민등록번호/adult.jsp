<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성인의 세계</title>
</head>
<body>
<h1>후끈 달아오르는 성인의 세계</h1>
<h2>성인 1 : 공자</h2>
<h2>성인 2 : 석가</h2>
<h2>성인 3 : 맹자</h2>
<form action="?">
	<table border="">
		<tr>
			<td>생년월일</td>
			<td>
			<input type="text" name="year"  value="<%=request.getParameter("year") %>" />-
			<input type="text" name="month"  value="" />-
			<input type="text" name="day"  value="" /></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" name="pname" value="<%=request.getParameter("ppname") %>" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
			<input type="submit" value="가입" /></td>
		</tr>
	</table>
</form>
</body>
</html>
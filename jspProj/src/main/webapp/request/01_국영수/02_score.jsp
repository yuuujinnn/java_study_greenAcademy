<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>score</title>
<style type="text/css">
	table, td, th {
		border : 1px solid #ccc; 
		border-collapse: collapse;
		padding : 10px 20px;
		text-align : center;
		}
</style>
</head>
<body>
	<!-- 5명의 이름, 국어, 영어, 수학 입력받아서 점수, 총합, 평균 구하기 -->
	<h1>score</h1>
	<form action="totalScore.jsp" name="qwer">
		<table>
			<tr>
				<th>no</th>
				<th>이름</th>
				<th>국어</th>
				<th>영어</th>
				<th>수학</th>
			</tr>
			<% for(int i=0; i<5; i++){ %>
			<tr>
				<td><%=i %></td>
				<td><input type="text" name="name" /></td>
				<td><input type="text" name="kor" value="<%=(int)(Math.random()*100)+1 %>" /></td>
				<td><input type="text" name="eng" value="<%=(int)(Math.random()*100)+1 %>" /></td>
				<td><input type="text" name="math" value="<%=(int)(Math.random()*100)+1 %>" /></td>
				
			</tr>
			<% } %>
			<tr>
				<td colspan="5" align="right" >
					<input type="submit" value="계산" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
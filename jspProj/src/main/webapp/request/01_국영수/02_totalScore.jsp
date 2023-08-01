<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>total Score</title>
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
<% 
	String [] nameArr = request.getParameterValues("name"); 
	String [] korArr = request.getParameterValues("kor"); 
	String [] engArr = request.getParameterValues("eng"); 
	String [] mathArr = request.getParameterValues("math"); 

%>
	<h1>total Score</h1>
	<table>
		<tr>
			<th>no</th>
			<th>이름</th>
			<th>국어</th>
			<th>영어</th>
			<th>수학</th>
			<th>총점</th>
			<th>평균</th>
		</tr>
		<% for(int i=0; i<5; i++){ 
				String name = nameArr[i];
				String kor = korArr[i];
				String eng = engArr[i];
				String math = mathArr[i];
				
				int kornum = Integer.parseInt(kor);
				int engnum = Integer.parseInt(eng);
				int mathnum = Integer.parseInt(math);
				
				int hap = kornum + engnum + mathnum;
				float avg = (float) hap / 3;
				
		%>
		<tr>
			<td><%=i %></td>
			<td><%=name %>
			<td><%=kor %></td>
			<td><%=eng %></td>
			<td><%=math %></td>
			<td><%=hap %></td>
			<td><%=String.format("%.2f", avg) %></td>
		</tr>
		<% } %>
		
	</table>
</body>
</html>
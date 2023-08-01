<%@page import="java.util.Arrays"%>
<%@page import="oops_p.Exam"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>점수 결과</title>
<style type="text/css">
    table, td, th {
        border: 1px solid #ccc;
        border-collapse: collapse;
        padding: 10px 20px;
        text-align: center;
    }
</style>
</head>
<body>
	<h1>점수 결과 리스트</h1>
    <table>
        <tr>
			<th>no</th>
			<th>이름</th>
			<th>국어</th>
			<th>영어</th>
			<th>수학</th>
			<th>총점</th>
			<th>평균</th>
			<th>등급</th>
			<th>등수</th>
        </tr>
<% 
	// 문자열 배열로 만듬
	String [] nameArr = request.getParameterValues("name");
 	String [] korArr = request.getParameterValues("kor"); 
	String [] engArr = request.getParameterValues("eng"); 
	String [] mathArr = request.getParameterValues("math");  
	String [] title = "kor,eng,math".split(",");
	
	
	// 입력
	Exam [] arr = new Exam[nameArr.length];
	Exam [] temp = new Exam[nameArr.length];
	for (int i = 0; i < arr.length; i++) {
		arr[i] = new Exam(nameArr[i], korArr[i], engArr[i], mathArr[i]);
	}
	
	// 랭크 계산
	for (int i = 0; i < arr.length; i++) {
		arr[i].rankCalc(arr);

	}
	// 랭크 정렬
	for(int i = 0; i < nameArr.length; i++) {
		for(int j = i+1; j < nameArr.length; j++) {
			if(arr[i].getRank() > arr[j].getRank()) {
				temp[i] = arr[i];
				arr[i] = arr[j];
				arr[j] = temp[i];
			}
		}
	}
	
	
	
	// 출력
	for (int i = 0; i < nameArr.length; i++) {
		
	%>

		<tr>
			<td><%=i+1 %></td>
			<td><%=arr[i].getName() %></td>
			<td><%=arr[i].getJum()[0] %></td>
			<td><%=arr[i].getJum()[1] %></td>
			<td><%=arr[i].getJum()[2] %></td>
			<td><%=arr[i].getTot() %></td>
			<td><%=arr[i].getAvg() %></td>
			<td><%=arr[i].getGrade() %></td>
			<td><%=arr[i].getRank() %></td>
		</tr>
		
	<% } %>
	
	

    </table> 
</body>
</html>
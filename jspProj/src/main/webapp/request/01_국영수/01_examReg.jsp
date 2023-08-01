<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>examReg</title>
</head>
<body>
<h1>examReg</h1>
<%

	//초기화
	String [] pname = request.getParameterValues("pname");
	String [] title = "kor,eng,mat".split(",");
	// title = [kor, eng, mat]
			    //0   1    2
	int [][] arr = new int[title.length][pname.length];
	
	//   ? 각 사람
	//res[?][0] - 총점
	//res[?][1] - 평균
	//res[?][2] - 등수
	int [][] res = new int[pname.length][title.length];
	
	
	// 입력부
	for(int i = 0; i<title.length; i++){
		String [] jj = request.getParameterValues(title[i]);
		for(int j = 0; j<jj .length; j++){
			arr[i][j] = Integer.parseInt(jj[j]);
		}
	}
	
	
	//연산부
	// p : 사람
	for(int p = 0; p<res.length; p++){
		
		//총점
		res[p][0] = 0;
		
		//점수 : j 과목
		for(int j = 0; j<arr.length; j++){
			res[p][0] += arr[j][p];
		}
		
		//평균
		res[p][1] = res[p][0]/arr.length;
	} 
	
	//분석
	for(int me = 0; me<res.length; me++){
		res[me][2] = 1;	
		
		for(int you = 0; you<res.length; you++){
			
			if(res[me][1] < res[you][1] ){
				res[me][2]++;	
			}
		}
	}
	
	
%>


<!-- 출력부 -->
<table border="">
		<tr>
			<td>이름</td>
			<td>국어</td>
			<td>영어</td>
			<td>수학</td>
			<td>총점</td>
			<td>평균</td>
			<td>등수</td>
		</tr>
<% 
for(int r = 1; r<=pname.length; r++){
	
	for(int i = 0; i<pname.length; i++){ 
		if(r == res[i][2]) {%>	
		<tr>
			<td><%=pname[i] %> <%=r %></td>
			<% for(int j = 0; j<arr.length; j++){ %>				
				<td><%=arr[j][i] %></td>
			<%} 
			 for(int j = 0; j<res[i].length; j++){ %>				
				<td><%=res[i][j] %></td>
			<%} %>		
		</tr>
<%}}}%>		

</table>
</body>
</html>
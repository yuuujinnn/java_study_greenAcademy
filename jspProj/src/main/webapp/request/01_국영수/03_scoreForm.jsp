<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int cnt = 5;

	if(request.getParameter("cnt") != null) {
		cnt = Integer.parseInt(request.getParameter("cnt"));
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>점수 리스트</title>
<style type="text/css">
	table, td, th {
		border : 1px solid #ccc; 
		border-collapse: collapse;
		padding : 10px 20px;
		text-align : center;
		}
</style>
<script type="text/javascript">
	function cntChange() {
		qwer.action="?"
		qwer.submit()
	}
</script>
</head>
<body>
	<h1>점수 리스트</h1>
	<form action="scoreReg.jsp" name="qwer">
		<table border="">
			<tr>
				<!-- 학생 수 선택해서 변경가능 -->
				<td colspan="5">
					학생수:
					<select name="cnt" id="" onchange="cntChange()">
					<% for(int i=5; i<=30; i+=5) { 
						String sel = "";
						
						if(i == cnt) {
							sel = "selected";
						}
					%>

						<option <%=sel %>><%=i %></option>
					<% } %>
					</select>
				</td>
			</tr>
			<tr>
				<th>no</th>
				<th>이름</th>
				<th>국어</th>
				<th>영어</th>
				<th>수학</th>

			</tr>
		
			<!-- no, 이름 : 순차적 입력 -->
			<!-- 과목별 점수 : 1~100점 랜덤 입력 -->
			<% for(int i=1; i<cnt+1; i++){ %>
			<tr>
				<td><%=i %></td>
				<td><input type="text" name="name" value=<%="학생"+i %> /></td>
				<td><input type="text" name="kor" value="<%=(int)(Math.random()*60)+41 %>" /></td>
				<td><input type="text" name="eng" value="<%=(int)(Math.random()*60)+41 %>" /></td>
				<td><input type="text" name="math" value="<%=(int)(Math.random()*60)+41 %>" /></td>
				
			</tr>
			<% } %>
			<tr>
				<td colspan="5" align="center" >
					<input type="submit" value="계산" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
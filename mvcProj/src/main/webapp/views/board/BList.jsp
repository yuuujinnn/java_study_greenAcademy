<%@page import="java.util.ArrayList"%>
<%@page import="model_p.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<table border="">
	<tr align="center">
		<td width="50px">번호</td>
		<td width="500px">제목</td>
		<td width="100px">작성자</td>
		<td width="200px">작성일</td>
		<td width="50px">조회수</td>
	</tr>
<%
int i = 0;
for(BoardDTO dto : (ArrayList<BoardDTO>) request.getAttribute("mainData")) {
i++;
%>	
	<tr align="center">
		<td><%=i %></td>
		<td>
			<a href="BDetail?id=<%=dto.getId()%>"><%=dto.getTitle() %></a>
		</td>
		<td><%=dto.getPname() %></td>
		<td><%=dto.getReg_date() %></td>
		<td><%=dto.getCnt() %></td>
	</tr>
	<%} %>
	<tr>
		<td colspan="5"  align="center"></td>
	</tr>
	<tr>
		<td colspan="5"  align="right">
			<a href="BWriteForm">글쓰기</a>
		</td>
	</tr>
</table>
<%@page import="model_p.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	BoardDTO dto = (BoardDTO)request.getAttribute("mainData");
%>    
<table border="">
	<tr>
		<td width="200px">id</td><td width="700px"><%=dto.getId() %></td>
	</tr><tr>	
		<td >제목</td><td><%=dto.getTitle() %></td>
	</tr><tr>
		<td >작성자</td><td><%=dto.getPname() %></td>
	</tr><tr>
		<td >작성일</td><td><%=dto.getReg_dateStr() %></td>
	</tr><tr>
		<td >조회수</td><td><%=dto.getCnt() %></td>
	<% if(!dto.getUpfile().equals("")) {%>	
	</tr><tr>
		<td >파일</td><td>
		<% if(dto.isImg()) {%>
		 	<img width="500px" src="/mvcProj/up/<%=dto.getUpfile() %>" alt="" /> 
		<%} else { %>
		 	<a href="/mvcProj/noneJsp/FileDown?fName=<%=dto.getUpfile() %>"><%=dto.getUpfile() %></a> 
		<%} %>
		</td>
	<%} %>
	</tr><tr>
		<td >내용</td><td><%=dto.getContentBr() %></td>
	</tr>
	<tr>
		<td colspan="2"  align="right">
			<a href="BList">목록으로</a>
			<a href="BDeleteForm?id=<%=dto.getId()%>">삭제</a>
			<a href="BModifyForm?id=<%=dto.getId()%>">수정</a>
			<a href="BReplyForm?id=<%=dto.getId()%>">답변</a>
		</td>
	</tr>
</table>
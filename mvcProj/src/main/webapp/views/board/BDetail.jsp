<%@page import="model_p.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	BoardDTO dto = (BoardDTO) request.getAttribute("mainData");
%>
<table border="">
	<tr>
		<td width="200px">id</td><td width="700px"><%=dto.getId() %></td>
	</tr>
	<tr>
		<td>제목</td><td><%=dto.getTitle() %></td>
	</tr>
	<tr>
		<td>작성자</td><td><%=dto.getPname() %></td>
	</tr>
	<tr>
		<td>작성일</td><td><%=dto.getReg_dateStr() %></td>
	</tr>
	<tr>
		<td>조회수</td><td><%=dto.getCnt() %></td>
	</tr>
	<tr>
		<td>파일</td><td><%=dto.getUpfile() %></td>
	</tr>
	<tr>
		<td>내용</td><td><%=dto.getContentBr() %></td>
	</tr>
	<tr>
		<td colspan="5" align="right">
			<a href="BList">목록으로</a>
		</td>
	</tr>
</table>
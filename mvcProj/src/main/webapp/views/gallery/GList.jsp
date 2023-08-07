<%@page import="model_p.GalleryDTO"%>
<%@page import="model_p.PageData"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<table border="">
<%
int i = 0;
for(GalleryDTO dto : (ArrayList<GalleryDTO>) request.getAttribute("mainData")) {
i++;
%>	
	<tr>
		<td>번호 : <%=i %></td>
		<td colspan="2">제목 : <a href="GDetail?id=<%=dto.getId()%>"><%=dto.getTitle() %></a></td>
	<tr>
		<td colspan="3">
			<% if(dto.isImg()) {%>
		 		<a href="GDetail?id=<%=dto.getId()%>">
		 			<img width="500px" src="/mvcProj/galleryup/<%=dto.getUpfile() %>" alt="" />
		 		</a>
		 	<%} %>
		</td>
	</tr>
	<tr>
		<td width="150px">작성자 : <%=dto.getPname() %></td>
		<td width="650px">작성일 : <%=dto.getReg_date() %></td>
		<td width="100px">조회수 : <%=dto.getCnt() %></td>
	</tr>
	<%} %>
	<tr>
		<td colspan="3"  align="right">
			<a href="GWriteForm">글쓰기</a>
		</td>
	</tr>
</table>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<table>
	<tr>
		<td colspan="4" width="900px">
			<h1><%=request.getAttribute("mainTitle") %></h1>
		</td>
	</tr>
	<tr>
		<td><a href="/mvcProj/info">회사소개</a></td>
		<td><a href="/mvcProj/product">제품</a></td>
		<td><a href="/mvcProj/gallery">갤러리</a></td>
		<td><a href="/mvcProj/board/BList">게시판</a></td>
	</tr>
</table>
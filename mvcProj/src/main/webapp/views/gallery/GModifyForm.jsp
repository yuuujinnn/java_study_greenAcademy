<%@page import="model_p.GPageData"%>
<%@page import="model_p.GalleryDTO"%>
<%@page import="model_p.PageData"%>
<%@page import="model_p.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	GalleryDTO dto = (GalleryDTO)request.getAttribute("mainData");
%>  
<script>
	function fileDel() {
		
		myFrm.action="GFileDelete"
		myFrm.submit()
	}
</script>
<form name="myFrm" action="GModifyReg"  method="post" enctype="multipart/form-data">
	<table  border="">
		<tr>
			<td width="200px">id</td><td width="700px">
				<input type="text" name="id" readonly="readonly" value="<%=dto.getId() %>"/>
			</td>
		</tr>
		<tr>
			<td>제목</td>
			<td><input type="text" name="title" value="<%=dto.getTitle() %>"/></td>
		</tr>
		<tr>
			<td>작성자</td>
			<td><input type="text" name="pname" value="<%=dto.getPname() %>" /></td>
		</tr>
		<tr>
			<td >작성일</td><td><%=dto.getReg_dateStr() %></td>
		</tr>
		<tr>
			<td >조회수</td><td><%=dto.getCnt() %></td>
		<tr>
			<td>암호</td>
			<td><input type="text" name="pw" /></td>
		</tr>
		<tr>
			<td>내용</td>
			<td><textarea name="content" id="" cols="30" rows="10"><%=dto.getContent() %></textarea></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
			
				<input type="submit" value="수정" />
				<input type="reset" value="초기화" />
				<a href="BDetail?id=<%=dto.getId() %>">뒤로</a>
			</td>
		</tr>
	</table>
</form>
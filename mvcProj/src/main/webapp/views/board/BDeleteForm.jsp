<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
%>    
<form action="BDeleteReg" method="post">
<input type="hidden" name="id" value="<%=id%>" />
	<table border="">
		<tr>
			<td width="200px">암호</td>
			<td width="700px"><input type="text" name="pw" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
			   <input type="submit" value="삭제" />
			   <a href="BDetail?id=<%=id%>">뒤로</a>
			</td>
		</tr>
	</table>
</form>
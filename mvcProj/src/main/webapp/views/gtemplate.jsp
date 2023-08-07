<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String galleryUrl = "gallery/" + request.getAttribute("mainPage") + ".jsp";
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="">
		<tr>
			<td ><jsp:include page="inc/header.jsp" /></td>
		</tr>
		<tr>
			<td ><jsp:include page="<%=galleryUrl %>" /></td>
		</tr>
		<tr>
			<td ><jsp:include page="inc/footer.jsp" /></td>
		</tr>
	</table>
</body>
</html>
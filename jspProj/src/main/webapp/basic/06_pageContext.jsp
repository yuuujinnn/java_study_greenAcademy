<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>06_pageContext</title>
</head>
<body>
<%
	Object page2 = (HttpJspPage)pageContext.getPage();
	ServletRequest request2 = pageContext.getRequest();	
	ServletResponse response2 = pageContext.getResponse();	
	HttpSession session2 = pageContext.getSession();	
	ServletContext application2 = pageContext.getServletContext();	
	
	JspWriter out2 = pageContext.getOut();
	ServletConfig config2 = pageContext.getServletConfig();
	Exception exception2 = pageContext.getException();	
%>
	<h1>06_pageContext</h1>
	page:<%=page %><br/>
	page2:<%=page2 %><br/>
	request:<%=request %><br/>
	request2:<%=request2 %><br/>
	response:<%=response %><br/>
	response2:<%=response2 %><br/>
	session:<%=session %><br/>
	session2:<%=session2 %><br/>
	application:<%=application %><br/>
	application2:<%=application2 %><br/>
	out:<%=out %><br/>
	out2:<%=out2 %><br/>
	config:<%=config %><br/>
	config2:<%=config2 %><br/>
	exception:<%=exception %><br/>
	exception2:<%=exception2 %><br/>
</body>
</html>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>joinReg.jsp</title>
</head>
<body>
<h1>joinReg.jsp</h1>
<%
	String jumin = request.getParameter("jumin");
	String pname = request.getParameter("pname");
	
	int sv = jumin.charAt(7)-'0'-1;
	
	
	
	
	
	
	/*
			-1	/2
	19	1	0	0
	19	2	1	0
	20	3	2	1
	20	4	3	1
	19	5	4	2
	19	6	5	2
	20	7	6	3
	20	8	7	3
	
	
			-1	%4	/2	+19
	19	1	0	0	0	19
	19	2	1	1	0	19
	20	3	2	2	1	20
	20	4	3	3	1	20
	----------------------------------------
	19	5	4	0
	19	6	5	1
	20	7	6	2
	20	8	7	3
	
	
	*/
	
	int pre = sv %4	/2	+19;
	String [] birth = new String[3];
	for(int i = 0; i<birth.length;i++){
		birth[i] = jumin.substring(i*2,i*2+2);
	}
	
	out.println(sv*4+"<br/>");
	out.println(pre+"<br/>");
	birth[0]=pre+birth[0];
	
	Date today = new Date();
	today.setYear(today.getYear()-19);
	
	String birthStr = String.join("-", birth);

	if( today.before(new SimpleDateFormat("yyyy-MM-dd").parse(birthStr))){
		sv = 2;
	
	}
	out.println(today+"<br/>");
	
	out.println(birthStr);
	out.println(pname+"<br/>");
	
	
	String [] arr = "adult,child,foreign,foreign".split(",");
	String goUrl = arr[sv/2];
	out.println(goUrl);
	String ppname = URLEncoder.encode(pname,"UTF-8");
	//response.sendRedirect(goUrl+".jsp?ppname="+ppname+"&year="+1111);
%>
</body>
</html>
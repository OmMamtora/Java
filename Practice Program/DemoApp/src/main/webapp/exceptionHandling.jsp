<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!-- If anything goes wrong and any error occure this will handle by other page so here are are adding that.. -->

<%@ page errorPage="errorHandle.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	out.println("<h2>Exception Handling<h2>");

	//int i=9/0;
/*	
//	try{
		int i=9/0;
	}
	catch(Exception e){
		out.println("Error occure! "+e.getMessage());
	}
*/

	int i = 9/0;
%>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="blue">

<%
	
	int number1 = Integer.parseInt(request.getParameter("num1"));
	int number2 = Integer.parseInt(request.getParameter("num2"));
	
	int sum = number1 + number2;
	
	out.println("<h2>Result is "+ sum+"<h2>");
	
%>
</body>
</html>
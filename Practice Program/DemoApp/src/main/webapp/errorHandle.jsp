<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!-- So in this page we are going to handle error so this is error page so for that we have 
declare that because without that declaration we are unable to use EXCEPTION expression.. -->

<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Error:
	<%= exception.getMessage()%>
</body>
</html>
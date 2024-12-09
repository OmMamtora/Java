<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Hello! I am Here..

<br>
	<%
		//String name = request.getAttribute("student").toString();
		//out.println(name);
			
		String name = request.getAttribute("student").toString();
		
	%>
	
	<!-- ${student.name} -->
	${students}
	
	${student.name}
    

</body>
</html>
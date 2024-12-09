<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student List</title>
</head>
<body>

<h2>Hello! I am Here..</h2>

<!-- Loop through the list of students -->
	<br>
	<%
		//String name = request.getAttribute("student").toString();
		//out.println(name);
			
		//String name = request.getAttribute("student").toString();
		
	%>
	
	<!-- ${student.name} -->
	${students} <br /> <br />
	
	<c:forEach items="${students}" var="s">
		${s} <br />
	</c:forEach>
	
	<br /> <br />
	<!-- Display only name -->
	<c:forEach items="${students}" var="s">
		${s.name} <br />
	</c:forEach>	
	
	
    

</body>
</html>

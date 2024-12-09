<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:set var="str" value="Om Mamtora" />
	Length : ${fn:length(str)} <!-- This display length of string.. -->
	<br />
	
	<!-- Where we found space at that time we are split string.. -->
	Split : 
	<c:forEach items="${fn:split(str,' ')}" var="S">	
		<br />
		${S}
	</c:forEach>  
	<br />
	
	<!-- Here we are going to find index number of particular character -->
	Index : ${fn:indexOf(str,'t')}
	
	
	<br />
	<!-- Here we are checking that string contains letter o or not and it gives answer in true or false-->
	
	is there : ${fn:contains(str,'o') }
	<br />
	
	<!-- Here string will be converted into uppercase.. -->
	UpperCase: ${fn:toUpperCase(str)}

</body>
</html>
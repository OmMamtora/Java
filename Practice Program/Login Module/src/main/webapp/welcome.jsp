<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	
	<%
	
	/* Here we are adding logic that, after logout we can't see that earlier page by going back side so
		so for that we have inbuild function SETHEADER.
	*/
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	
		if(session.getAttribute("username")==null){
			response.sendRedirect("login.jsp");
		}
	
	%>
	
	Hello user <b><u>${username}</u></b> welcome to our website..
	<br />
	
	<a href="videos.jsp">Here you can enjoy some videos..</a>
	
	<form action="Logout">
		<input type="submit" value="Logout">
	</form>
</body>
</html>
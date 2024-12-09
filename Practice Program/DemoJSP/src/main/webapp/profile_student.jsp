<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	1<br>
	Om<br>	
	88<br>
	
	<%
		String url = "jdbc:mysql://localhost:3306/student";
		String username = "root";
		String password = "";
		
		String sql="select * from details where eno=1";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,username,password);
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(sql);
		rs.next();
		
		
	%>
	
	Roll no:<%= rs.getString(1) %><br />
	Name:<%= rs.getString(2) %><br />
	Marks:<%= rs.getString(3) %><br />
</body>
</html>
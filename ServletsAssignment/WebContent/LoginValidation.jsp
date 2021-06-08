
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
	String username = request.getParameter("username");
	String password= request.getParameter("password");
	if(username.equals("onebill") && password.equals("1111")){
		out.print("<h1>Login Success</h1>");
	}else{		
		out.print("<h1>Username/Password is wrong</h1>");
		out.print("<a href='/ServletsAssignment/Login.jsp'><input type='button' value='Go Back']></a>");
	}
	%>
</body>
</html>
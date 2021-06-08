<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- JSP Comment --%>
	<h1>Hello</h1>
	<%
	Date d = new Date();
	String date=d.toString();
	//out.println(date);
	%>
	Current date time is
	<%=date  %>
</body>
</html>
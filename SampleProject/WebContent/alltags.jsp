<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%--JSP Comment --%>
	<!-- HTML Comment -->
	<%
	out.println("JSP File");
	%>
	<%!int n1 = 100, n2 = 20;%>
	<%=n1 * n2%>
	<%
	Date d = new Date();
	%>
	Today's Date
	<%=d.toString()%>
</body>
</html>
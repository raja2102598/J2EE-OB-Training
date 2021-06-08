<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
String bcolor = request.getParameter("bgcolor");
if (bcolor == null || bcolor == "")
	bcolor = "white";
%>
<body bgcolor="<%=bcolor%>">
	<h2>Testing Background Color</h2>
	<br>
	<form>
		<input type="text" name="bgcolor" /> <br> <input type="submit"
			value="change">
	</form>
</body>
</html>
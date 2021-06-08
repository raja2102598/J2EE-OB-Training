<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form>
		<h1>Multiplication Table</h1>
		<br> <label>Enter a Number</label> <input type="number"
			name="num"> <input type="submit" value="Submit">
	</form>
	<%
	String value =request.getParameter("num");
	if(value!=null){		
	out.print("<br><br>Multiplication Table for Number "+value+"<br>");
	for (int i = 1; i <= 10; i++)
		out.println("<br> "+i +" * "+ value + " = "+ Integer.parseInt(value) * i);
	}
	%>
</body>
</html>
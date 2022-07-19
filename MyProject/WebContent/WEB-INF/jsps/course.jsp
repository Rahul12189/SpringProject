<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
 <%@page import="java.util.List" %>
 <%@page import="com.spring.main.model.Course" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Courses</h1>
	<%
		List<Course> list = (List<Course>)request.getAttribute("list");
		for (Course c : list) {

			out.println(c + " ");
		}
	%>
</body>
</html>
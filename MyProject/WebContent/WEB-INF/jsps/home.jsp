<%@page import="java.time.LocalTime"%>
<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%String name1 = (String) request.getAttribute("name");%>
<h1>Hello <%=name1%>!!! How are You?</h1>
<hr>
<h3>1.Scriplet</h3>
<%
	int x=5;
	int y=9;
	out.println(x+y);
%>
<h3>2.Expression</h3>
x=<%=x %>
y=<%=y %>
x+y=<%=x+y %>

<h3>3.Declaration</h3>
<%
	String sname="Kadam Raj";
%>
<h4>Name is : <%=sname %></h4>

<%--This is a JSP Comment  --%>

Todays Date is : <%=LocalDate.now() %>
<br>
Time Now is : <%=LocalTime.now() %>
<br>
<br>
<a href="<%=request.getContextPath()%>/products">Go To Products</a>
<br>
<a href="<%=request.getContextPath() %>/courses">Courses</a>
</body>
</html>
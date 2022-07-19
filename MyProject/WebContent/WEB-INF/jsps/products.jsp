<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="java.util.List" %>
 <%@page import="com.spring.main.model.Product" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Products</h1>
<%
	List<Product> list = (List<Product>)request.getAttribute("list");
	for(Product p:list){
		
		out.println(p+"<br>");
	}

%>
<br></br>
<a href="<%=request.getContextPath() %>/sort-price?sort=ASC">Price(Low-High)</a>
<br></br>
<a href="<%=request.getContextPath() %>/sort-price?sort=DESC">Price(High-Low)</a>
</body>
</html>
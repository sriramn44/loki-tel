 <%@page import="com.java.jspdemo.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% Student str6 = new Student(205,"ramu"); %>
 
<jsp:useBean id="str7" class="com.java.jspdemo.Student" scope="request"/>

<%= str7.getId() %>

<h1> hi ram</h1>
</body> 
</html>
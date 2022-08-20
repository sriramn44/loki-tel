<%@page import="java.io.PrintWriter"%>
 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String country = request.getAttribute("country").toString(); %>
<%= country %>
<br>

<%
PrintWriter out1 = response.getWriter();

out1.write("Welcome to Out Object");
out.print("<br>");
out.print("****************Congratulations******************");
%>

</body>
</html>
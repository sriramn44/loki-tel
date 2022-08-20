<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%String name = request.getParameter("userName");
String pw = request.getParameter("password");

System.out.println(name);
System.out.println(pw);
%>
<% if(name.equals(pw)) { %>

<h1>login success </h1>


<%}else{ %>

<h1> login is failure : <%= name%> , password : "<%= pw %> </h1>

<%} %>
</body>
</html>
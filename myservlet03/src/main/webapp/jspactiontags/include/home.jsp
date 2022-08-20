<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<strong><%@include file="header.html" %></strong> <br>

<i><jsp:include page="header.html"></jsp:include></i><br>

<marquee> <% pageContext.include("header.html"); %></marquee><br>

<ul> <% RequestDispatcher rd = request.getRequestDispatcher("header.html"); 
  rd.include(request, response);
%></ul><br>

<strike><h3>welcome to footer tag</h3></strike><br>


 <jsp:include page="footer.html"/>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> 

<i><jsp:forward page="forwardchild.jsp"></jsp:forward></i><br>

<h6><% pageContext.forward("forwardchild.jsp"); %></h6><br>

<u><% RequestDispatcher rd = request.getRequestDispatcher("forwardchild.jsp");
rd.forward(request, response);
%></u><br> 

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

String uname = request.getParameter("uname");
String pw = request.getParameter("pw");

%>

<h1>Entered User Name is : <%= uname %> </h1>
<br>
<h1>Entered Password  is : <%= pw %> </h1>
<br>
<h1>Entered User Name is : <%= request.getParameter("uname") %> </h1>
<br>
<h1>Entered Password  is : <%= request.getParameter("pw") %> </h1>
<br>
<%=  request.getAuthType() %>
<br>
<%=  request.getMethod() %>
<br>
<%=  request.getContentType() %>
</body>
</html>
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
String uname = session.getAttribute("uname").toString();
String pw = session.getAttribute("pw").toString();
String phno = session.getAttribute("phno").toString();
String email = session.getAttribute("email").toString();
%>

<h1> you name is <%=uname %> </h1>
<h1> you password is <%=pw %> </h1>
<h1> you mobile number is <%=phno %> </h1>
<h1> you email is <%=email %> </h1>

</body>
</html>
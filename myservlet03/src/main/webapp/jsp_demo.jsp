
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Failure page</title>
</head>
<body>
<h1> login is failed</h1>
<% String iname = (String) request.getAttribute("uname");
String ipswd = (String) request.getAttribute("pswd"); %>

<h3>login is a failure, username is : <%= iname %> , password is : <%= ipswd %> </h3>

</body>
</html>
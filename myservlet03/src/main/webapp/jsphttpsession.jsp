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
String uname= (String) session.getAttribute("uname");
String pw = session.getAttribute("pw").toString();
 
String phno = request.getParameter("phno");
String email = request.getParameter("email");

session.setAttribute("phno", phno);
session.setAttribute("email", email );


%>

<h1> username is: <%=uname %> </h1> <br>
<h1> password is: <%=pw %> </h1> <br>


<a href="jsphttpsession02.jsp"> Go to session jsp2</a>
</body>
</html>
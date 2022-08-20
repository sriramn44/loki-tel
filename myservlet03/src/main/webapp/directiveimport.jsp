<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import= "java.io.*,java.util.Date" %>
    <%@ page import= "com.java.jspdemo.Student" %>
    
    <%@page session="true" %>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
Student str = new Student(101,"SRIRAM");
System.out.print(str.getId());

%>

<%= new Date() %>
<%= new Date().getDate() %>
  
  
  <%-- pagedirective session --%>

Session ID is : <%= session.getId() %>
	
	<br>
	UserName is : ${ param.userName }
	
<menu>  
    <li>Home</li>  
    <li>Registration</li>  
    <li>Contact-us</li>  
    <li>About-us</li>  
 </menu> 
 
 <%= new java.util.Date() %>

<br>

</body>
</html>	
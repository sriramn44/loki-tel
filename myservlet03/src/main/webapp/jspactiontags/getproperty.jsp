<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%--<% Student str = new Student(1996,"sriram"); --%>

<jsp:useBean id="str3" class="com.java.jspdemo.Student"></jsp:useBean>

<jsp:setProperty property="id" name="str3" />
<jsp:getProperty property="id" name="str3"/>
 
</body>
</html>
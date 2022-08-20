<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="s1" class="com.java.jspdemo.Student"></jsp:useBean>


<jsp:getProperty property="id" name="s1"/> <br>
<jsp:getProperty property="name" name="s1"/><br>

<jsp:setProperty name="s1" property="id" value="789"/>
<jsp:setProperty name="s1" property="name" value="ramu"/>

<jsp:getProperty property="id" name="s1"/> <br>
<jsp:getProperty property="name" name="s1"/><br>



</body>
</html>
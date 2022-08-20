<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%--<jsp:include page="jspparam.jsp">
   
   <jsp:param value="94" name="maths"/>
   <jsp:param value="68" name="physics"/>
   
</jsp:include>--%>

<jsp:forward page="jspparam.jsp">
   
   <jsp:param value="55" name="maths"/>
   <jsp:param value="88" name="physics"/>
   
</jsp:forward>

</body>
</html>
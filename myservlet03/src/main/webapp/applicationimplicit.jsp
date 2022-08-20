<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% String dbName = application.getInitParameter("dbName") != null ? application.getInitParameter("dbName") : application.getAttribute("dbName").toString();
String serverName = application.getInitParameter("serveranme");

if(serverName == null){
	serverName = application.getAttribute("serverName").toString();
}
String skills = application.getInitParameter("skills") != null ? application.getInitParameter("skills") : application.getAttribute("skills").toString();
String name = application.getInitParameter("name") != null ? application.getInitParameter("name") : "";
String languages = application.getInitParameter("languages");
if(languages!=null){
	languages = application.getAttribute("languages").toString();
}
%>
<h1> the dbName is <%= dbName %></h1>
<h1> the servername is <%= serverName %></h1>
<h1> the skills is <%= skills %></h1>
<h1>the name is <%= application.getInitParameter("name") != null ? application.getInitParameter("name") : ""%> </h1>
<h1> the languages is <%=application.getAttribute("languages")%> </h1>


</body>
</html>
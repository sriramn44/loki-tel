<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%!
String instanceVariable = "i am in instance variable, we can call other methods and instance variables in jsp by(<%!=)";

int add(int x,int y){
return x+y;
}

void m1(){ 
System.out.println(" im in declaration tag method"); }

com.java.jspdemo.Student std = new com.java.jspdemo.Student(101,"ram");

public void jspInit(){
	System.out.println("I am in jspInit");
}


public void jspDestroy(){
	System.out.println("I am in jspDestroy");
	
	
}
%>

<%
	String name = "Good evening";//Local Variable
	System.out.println(name);
	m1();
	
	out.print("<h1>hi ram</h1>");
%>

<%= instanceVariable %>

<br>
<%= add(10, 20) %>
<br>

<%= std.getId() +" = "+ std.getName() %>

<br>

<%= new com.java.jspdemo.Student(102, "Tech").getId() %>



</body>
</html>
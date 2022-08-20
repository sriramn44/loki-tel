<%@ page import="java.util.ArrayList"%>
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
String[] names = {"ram","shyam","sathi"};
pageContext.setAttribute("names", names);

  ArrayList<String> al = new ArrayList<String>();
al.add("ramu");
al.add("shyamu");
al.add("sathiya");

pageContext.setAttribute("al",al);


%>

${param.uname} <br>
${param.pw}<br>
${initParam.name}<br>
${applicationScope.stuaddress}<br>
${ param.student}<br>
${initParam["phone"] }<br>
${names[0]}<br>
${al[2] }<br>

<!-- 
> or gt
< or lt
== or eq
>= or ge
<= or le
!= or ne -->

${10 gt 5 }
${5 lt 2 }
${3 == 8 }
${3 eq 3 }
${3 ge 1}
${3 ne 3}
${3 lt 6 }

<br>
${empty names }
<br>
${empty al["1"] }
<br>


${empty "tech" }
<br>
${empty null }
<br>








</body>
</html>
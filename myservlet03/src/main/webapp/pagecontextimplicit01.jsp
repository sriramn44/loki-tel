<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <% String uname = request.getParameter("uname");
    
     
     ServletRequest req = pageContext.getRequest();
     String pw = req.getParameter("pw");
     
     ServletResponse res = pageContext.getResponse();
     ServletConfig con = pageContext.getServletConfig();
     ServletContext ctx = pageContext.getServletContext();
     HttpSession sess = pageContext.getSession();
     JspWriter ou = pageContext.getOut();
     Object o1 = pageContext.getPage();
     Exception ex = pageContext.getException();
     
     
     
  %>
  
  the user name is <%= uname %> <br>
  the password is <%= pw %>
  
  <% request.setAttribute("country", "india");
  pageContext.include("rdpagecontextimplicit.jsp");
   %> <br>
   
   
</body>
</html>
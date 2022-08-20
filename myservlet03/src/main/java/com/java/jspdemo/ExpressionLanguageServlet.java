package com.java.jspdemo;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/expressionlanguageEL/expressionLanguageServlet")
public class ExpressionLanguageServlet extends HttpServlet{
	
	
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
		this.doGet(req, resp);
	}
public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
	
	String email = req.getParameter("email");
	String pw = req.getParameter("password");
	
	System.out.println(email);
	
	System.out.println(pw);
	
	Student str1 = new Student();
	
	str1.setId(258);
	str1.setName("nbl");
	
	PrintWriter out =  resp.getWriter();
	
	HttpSession session = req.getSession();
	
	if(email.equals(pw)) {
	
		out.print("<h1>login success </h1>");
		req.setAttribute("massage","sriram love cows");
		req.setAttribute("email",email);
		req.setAttribute("pw", pw);
		req.setAttribute("student", str1);
		
		session.setAttribute("session1","this is session object");
		session.setAttribute("sess",session);
		session.setAttribute("pw",pw);
		session.setAttribute("session2","this is session 2 object");
		
		Student str = new Student();
		 
		str.setId(147);
		str.setName("ramu.shaymu");
		
		ServletContext ctx = getServletContext();
		
	String ph =	ctx.getInitParameter("phone");
	
		ctx.setAttribute("email",email);
		ctx.setAttribute("stuaddress",str);
		ctx.setAttribute("phone1", ph);
		
		
		
		
		RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
		rd.include(req, resp);
	} else {
		 
		out.println("<h1> login is failure </h1>" +" email : "+ email);
		
		
	    out.println(" password : "+pw);
		req.setAttribute("email", email);
		req.setAttribute("password",pw);
		RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
		rd.include(req, resp);
	}
	

}
}

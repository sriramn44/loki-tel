package com.java.jspdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServletJsp extends HttpServlet{
	
	
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
		this.doGet(req, resp);
	}
public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
	
	String name = req.getParameter("userName");
	String pw = req.getParameter("password");
	
	System.out.println(name);
	System.out.println(pw);
	
	
	PrintWriter out =  resp.getWriter();
	
	
	if(name.equals(pw)) {
	
		//out.print("<h1>login success </h1>");
//		
		RequestDispatcher rd = req.getRequestDispatcher("jsp_demo.html");
		rd.forward(req, resp);
	} else {
		
		//out.print("<h1> login is failure </h1>" +" username : "+ name +" password : "+pw);
		req.setAttribute("uname", name);
		req.setAttribute("pswd",pw);
		RequestDispatcher rd = req.getRequestDispatcher("jsp_demo.jsp");
		rd.forward(req, resp);
	}
	

}
}

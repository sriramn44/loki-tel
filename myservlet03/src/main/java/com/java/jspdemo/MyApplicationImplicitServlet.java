package com.java.jspdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myApplicationImplicitServlet")
public class MyApplicationImplicitServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("I am in MyApplicationImlicitServlet's doGet method");
		
		

		ServletContext con = request.getServletContext();
		
		String dbName = con.getInitParameter("dbName");
		String serverName = con.getInitParameter("serverName");
		
		con.setAttribute("dbName", dbName);
		con.setAttribute("serverName", serverName);
		con.setAttribute("skills", "java");
		con.setAttribute("languages", "telugu,tamil,hindi,english");
		
	PrintWriter out  = response.getWriter();
	
	out.print(dbName);
	
	
		
		RequestDispatcher rd = request.getRequestDispatcher("applicationimplicit.jsp");
		rd.forward(request, response);
		
	}

}

package com.java.sriram.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleServlet extends HttpServlet {
	
	
	public LifeCycleServlet() {
		System.out.println("i am in LifeCycleServlet");
	}
			
	public void init(ServletConfig config) throws ServletException {
		System.out.println("I am in LifeCycleServlet init method.");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("I am in LifeCycleServlet doGet Method");
		
		PrintWriter out = resp.getWriter();
		out.print("<h1>Congratulations for LifeCycleServlet servlet Implementations.....</h1>");
	}
	
	@Override
	public void destroy() {
		System.out.println("I am in LifeCycleServlet destroy method.");
	}
	
	
	

}

package com.java.servlet_context;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servletContext01")
public class ServletContext01 extends HttpServlet{

public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
	
	PrintWriter out = res.getWriter();
	
	ServletContext ctx = getServletContext();
	
	String str = ctx.getInitParameter("name");

	String str1 = ctx.getInitParameter("phone");
	
	out.print(" hi  "+ str +" your phone name is  "+str1);
	
}

}

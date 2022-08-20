package com.java.sendredirect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SendRedirect2 extends HttpServlet { 
	
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	
	}
	
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    	
    	
    	String email = (String) req.getParameter("email");
    	String password = (String) req.getParameter("password");
    	
    	System.out.println(email);
    	System.out.println(password);

    	PrintWriter out = resp.getWriter();
    	
    	out.println("email : "+ email);
    	out.println("password"+password);
    	
    	
    }
}

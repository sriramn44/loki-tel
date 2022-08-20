package com.java.sendredirect;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SendRedirect1 extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		
		
	
    	String email = req.getParameter("email");
    	String password = req.getParameter("password");
    	
    	 req.setAttribute("email", "email");
    	req.setAttribute("password", "password");
    	
    resp.sendRedirect("sendRedirect2?email="+ email);  
    		
    	
    }
}

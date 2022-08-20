package com.java.requestdispatcher;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RequestDispatcher1 extends HttpServlet {
	
	protected void doGet (HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	
	protected void doPost (HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		String uname = req.getParameter("username");
		String pword = req.getParameter("password");
		
		req.setAttribute("un",uname);
		req.setAttribute("pw",pword);
		
		RequestDispatcher rd = req.getRequestDispatcher("requestDispatcher2");
		//rd.forward(req, resp);
		rd.include(req, resp);
		
		
	}
	

}

package com.java.requestdispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestDispatcher2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		this.doPost(req, resp);
	}
	
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		 String ci = (String) req.getAttribute("un");
		String co = (String) req.getAttribute("pw");
		
		PrintWriter out = resp.getWriter();
		out.println("username"+ ci);
		out.println("password"+ co);
	}

}

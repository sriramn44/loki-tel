package com.java.session.cookie;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookieOne")
public class CokkieOne extends HttpServlet {

	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		String uname = req.getParameter("username");
		String pw = req.getParameter("password");
		
		Cookie co = new Cookie("uname", uname);
		Cookie co1 = new Cookie("pw", pw);
		 resp.addCookie(co); 
	     resp.addCookie(co1);
	     
	     resp.sendRedirect("cookieTwo");
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		this.doGet(req, resp);
	}
}

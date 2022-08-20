package com.java.sessionmanagment.http;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/httpSession01")
public class HttpSession01 extends HttpServlet {

	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		String uname = req.getParameter("username");
		String pword = req.getParameter("password");
		
		HttpSession session = req.getSession();
		
		session.setAttribute("uname",uname);
		session.setAttribute("pword", pword);
		
		resp.sendRedirect("httpSession02");

		
	}
}

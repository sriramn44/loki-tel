package com.java.sessionmanagment.http;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/httpSession02")
public class HttpSession02 extends HttpServlet {

	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		
		
		HttpSession session = req.getSession();
		
		String uname = (String) session.getAttribute("uname");
		String pword = (String) session.getAttribute("pword");
		
		PrintWriter out = resp.getWriter();
		out.println(uname + "    ");
		out.println(pword);
		
		resp.sendRedirect("logoutServlet");
		
		
		
      }
}
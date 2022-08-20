package com.java.jspdemo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/myHttpSessionservelt")
public class MyHttpSessionservelt extends HttpServlet {
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		
		String uname = request.getParameter("uname");
		String pw = request.getParameter("pw");
		
		HttpSession session = request.getSession();
		
		session.setAttribute("uname",uname);
		session.setAttribute("pw", pw);
		
		RequestDispatcher rd = request.getRequestDispatcher("jsphttpsession.jsp");
		rd.forward(request, response);
	}

}

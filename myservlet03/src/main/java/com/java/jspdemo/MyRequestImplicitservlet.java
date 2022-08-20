package com.java.jspdemo;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyRequestImlicitServlet
 */
@WebServlet("/myRequestImplicitservlet")
public class MyRequestImplicitservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		System.out.println("I am in MyRequestImlicitServlet's doGet method");
		
		String uname = req.getParameter("uname");
		String pw = req.getParameter("pw");
		
		req.setAttribute("uname", uname);
		req.setAttribute("Skills", "Java/J2ee");
		
		RequestDispatcher rd = req.getRequestDispatcher("jsprequestimplicit.jsp");
		rd.forward(req, res);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

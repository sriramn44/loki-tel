package com.java.jspdemo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/eloperators/elOperator")
public class ElOperator extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		
		String uname = request.getParameter("uname");
		String pw    = request.getParameter("pw");
		
		request.setAttribute("uname",uname);
		request.setAttribute("pw", pw);
		
		Student str = new Student();
		
		str.setId(369);
		str.setName("john");
		
		request.setAttribute("student",str);
		
		request.getRequestDispatcher("eloperator.jsp").forward(request, response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
}

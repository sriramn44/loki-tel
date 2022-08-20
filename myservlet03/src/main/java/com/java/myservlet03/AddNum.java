package com.java.myservlet03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddNum extends HttpServlet {

	
	public void doGet (HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		// TODO Auto-generated method stub
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i + j;
		
	 req.setAttribute("add",k);
		
		RequestDispatcher rd = req.getRequestDispatcher("sqRootNum");
		rd.forward(req, res);
//		
		
		System.out.println("result is"+ k);
		
		PrintWriter out = res.getWriter();
		
		out.println("the result is"+ k +"thank you");
		
		PrintWriter ram = res.getWriter();
		ram.println("thank you");
		
		
		
		
	}
	
	
}

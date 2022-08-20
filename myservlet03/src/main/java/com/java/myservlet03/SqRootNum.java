package com.java.myservlet03;

	import java.io.IOException;
	import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	public class SqRootNum extends HttpServlet {
		
		
@Override
		public void doGet (HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
	
			
			
       int k = (int) req.getAttribute("add");
	       	k =k*k;
			PrintWriter out = res.getWriter();
			
		out.println("the result is:" + k );
		
			
		}
		

	}


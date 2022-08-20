package com.java.servletconfig;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/servletConfig01",

initParams = {@WebInitParam(name = "name", value = "loki")})

public class ServletConfig01 extends HttpServlet {
	
	
		
		public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
			
			PrintWriter out = res.getWriter();
			
			ServletConfig con = getServletConfig();
			ServletContext ctx = getServletContext();
			
			String str = con.getInitParameter("name");

			String str1 = ctx.getInitParameter("name");
			
			out.print(" hi  "+ str1 +" your new name is  "+str);
			
	}

}

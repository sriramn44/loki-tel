package com.java.session.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookieTwo")
public class CookieTwo extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		
		String uname ="";
		String pw ="";
		
		Cookie cookies[] = req.getCookies();
		
		for(Cookie c : cookies) {
			
			if(c.getName().equals("uname")) {
				 uname = c.getValue();
		}
		if(c.getName().equals("pw")){
		 pw = c.getValue();
		 }
		
			PrintWriter out = resp.getWriter();
			
		out.print(uname);
		
		out.print(pw);
		}
	}
	

}

package com.amrita;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SqServlet extends HttpServlet {
		
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		int k=0;
		Cookie cookies[] = req.getCookies();
		
		for(Cookie co : cookies) {
			if(co.getName().equals("k")) {
				k =  Integer.parseInt(co.getValue());
			}
		}
		
		k=k*k;
		PrintWriter out = res.getWriter();
		out.println("result is: "+k);
	}
}

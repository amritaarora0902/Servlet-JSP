package com.amrita;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//ServletContext & ServletConfig
public class MyServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		PrintWriter out = res.getWriter();
		out.print("Hi ");
		
		ServletConfig ctx = getServletConfig();
		String str = ctx.getInitParameter("name");
		out.print(str);
	}
}

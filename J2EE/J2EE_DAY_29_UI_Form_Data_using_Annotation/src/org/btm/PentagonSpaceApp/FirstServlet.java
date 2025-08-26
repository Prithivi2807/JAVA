package org.btm.PentagonSpaceApp;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;

import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/btm")//Annotation
public class FirstServlet extends GenericServlet 
{
	@Override
	public void service(ServletRequest req, ServletResponse resp) 
			throws ServletException, IOException 
	{
		String name=req.getParameter("nm");
		String place=req.getParameter("pl");
		PrintWriter out=resp.getWriter();
		out.println("<html><body bgcolor='orange'> "
				+ "<h1>StudentDetails: "+name+" from "+place+"</h1></body></html>");
	}
}

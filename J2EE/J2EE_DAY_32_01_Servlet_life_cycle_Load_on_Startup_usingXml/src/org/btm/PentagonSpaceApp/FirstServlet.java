package org.btm.PentagonSpaceApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet extends GenericServlet
{
	public FirstServlet()
	{
		System.out.println("Servlet Object is created by JEE container");
	}
	@Override
	public void init(ServletConfig config) throws ServletException
	{
		System.out.println("Servlet config object is initialized by init() ");
	}
	@Override
	public void service(ServletRequest req, ServletResponse resp) 
			throws ServletException, IOException 
	{
		String name=req.getParameter("nm");
		String place=req.getParameter("pl");
		PrintWriter out=resp.getWriter();
		out.println("<html><body bgcolor='yellow'><h1>the Student "
				+name+" from "+place+"</h1></body></html>");
		System.out.println("service () called by JEE container");
		out.flush();
	}
	@Override
	public void destroy() 
	{
		System.out.println("closing all the costly resources destroy() is used");
	}
}

package org.btm.pentagonspaceApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;


public class FirstServlet extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse resp) 
			throws ServletException, IOException 
	{
		String name=req.getParameter("nm");
		String place=req.getParameter("pl");
		String gender=req.getParameter("ge");
		PrintWriter out=resp.getWriter();
		out.println("<html><body bgcolor='yellow'> "
				+ "<h1>DABBA FELLOW "+name+" from "+place+" "+gender+"<h1> "
				+"</body></html>");
	}
}
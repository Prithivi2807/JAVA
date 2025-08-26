package org.btm.PentagonSpaceApp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class First_Servlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException 
	{
		String pName=req.getParameter("pn");
		String pQty=req.getParameter("pq");
		/* adding and object into scope*/
		req.setAttribute("prdNm",pName);
		req.setAttribute("prdQty",pQty);
		RequestDispatcher rd=req.getRequestDispatcher("ss");
		rd.forward(req, resp);
	}
}

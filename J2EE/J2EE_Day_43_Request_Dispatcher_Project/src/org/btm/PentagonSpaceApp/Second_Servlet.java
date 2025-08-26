package org.btm.PentagonSpaceApp;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.parser.ParserBasicInformation;

public class Second_Servlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException 
	{
		/* fetching object backfrom the scope*/
		String prdName=(String) req.getAttribute("prdNm");
		String prdQty=(String) req.getAttribute("prdQty");
		int qty=Integer.parseInt(prdQty);
		double price=20000;
		 //business logic
		double totalsum=price*qty; 
		/*Presentation logic*/
		PrintWriter pw=resp.getWriter();
		pw.println("<html><body bgcolor='cyan'><h1>ProductName= "
				+ prdName+" Total sum= "+totalsum+"</ht></body></html>");
		pw.flush();
		pw.close();
		
		/*Persistance Logic*/
		Connection con=null;
		PreparedStatement pstmt=null;
		String iQuery="insert into btm.product values(?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			pstmt=con.prepareStatement(iQuery);
			pstmt.setString(1,prdName);
			pstmt.setInt(2, qty);
			pstmt.setDouble(3, totalsum);
			/*execute query*/
			pstmt.executeUpdate();
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			if(pstmt!=null)
			{
				try {
					pstmt.close();
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
			if(con!=null)
			{
				try {
					con.close();
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
}


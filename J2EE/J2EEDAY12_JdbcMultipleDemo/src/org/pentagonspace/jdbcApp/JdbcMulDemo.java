package org.pentagonspace.jdbcApp;

import java.sql.*;


public class JdbcMulDemo
{
	public static void main(String[] args) 
	{
		Connection con=null;
		Statement stmt=null;
		String inQuery1="insert into pentagonspace.student values (6,'arun','cse',65.56)";
		String inQuery2="insert into pentagonspace.student values (7,'gopinath','cse',85.55)";
		String inQuery3="insert into pentagonspace.student values (8,'gopi','cse',81.55)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			stmt=con.createStatement();
			stmt.executeUpdate(inQuery1);
			stmt.executeUpdate(inQuery2);
			stmt.executeUpdate(inQuery3);
		} 	
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			if (stmt != null)
			{
				try {
					stmt.close();
				} catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
			if (con !=null)
			{
				try {
					con.close();
				} catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
			System.out.println("closed all the costly resources");
		}
		
	}
	
}

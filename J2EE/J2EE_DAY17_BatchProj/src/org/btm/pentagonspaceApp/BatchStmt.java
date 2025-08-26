package org.btm.pentagonspaceApp;

import java.sql.*;

public class BatchStmt 
{
	public static void main(String[] args)
	{
		Connection con=null;
		Statement stmt=null;
		String iQry="insert into pentagonspace.student2 values(5,'anu',75.56)";
		String uQry="update pentagonspace.student2 set perc=86.56 where id=4";
		String dQry="delete from pentagonspace.student2 where perc=68.29";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			stmt=con.createStatement();
			//add all the DML queries into batch//
			stmt.addBatch(iQry);
			stmt.addBatch(uQry);
			stmt.addBatch(dQry);
			System.out.println("queries added to batch");
			//execute batch once wrt statement//
			int arr[]=stmt.executeBatch();
			System.out.println("queries executed from batch");
			for (int i : arr) 
			{
				System.out.println(i);
			}
		} 	
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			if(stmt!=null)
			{
				try {
					stmt.close();
				}
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
			if (con!=null)
			{
				try {
					con.close();
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
			System.out.println("all the costly resources are closed");
		}
	}
}

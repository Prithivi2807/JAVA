package org.btm.pentagonspaceApp;

import java.sql.*;
import java.util.Scanner;

public class LoginDemo_RemoveExtraPrintStatements
{
	public static void main(String[] args) 
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sQry = "select * from pentagonspace.student1 where id=? and name=? ";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		sc.close();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			pstmt=con.prepareStatement(sQry);
			//System.out.println("query pre-compiled");
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			//System.out.println("setted data for placeholder before execution");
			rs=pstmt.executeQuery();
			//System.out.println("query executed");
			if(rs.next())
			{
				String uname=rs.getString(3);
				System.out.println("the user_name="+ uname);
			}
			else
			{
				System.out.println("invalid id/name");
			}
			
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			if(rs!=null)
			{
				try {
					rs.close();
				}
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
			if(pstmt!=null)
			{
				try {
					rs.close();
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
			if(con!=null)
			{
				try {
					rs.close();
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
			System.out.println("costly resource closed");
		}
	}
}

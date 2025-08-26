package org.pentagonspace.jdbcApp;

import java.sql.*;
import java.util.Scanner;
import java.util.Scanner;
public class JdbcDemo
{
	public static void main(String[] args) 
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sQry="SELECT * FROM pentagonspace.student WHERE ID = ? ";
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the id");
		int uid=sc.nextInt();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			//SET VALUES FOR THE PLACEHOLDERS BEFORE EXECUTION //
			pstmt.setInt(1, uid);
			pstmt=con.prepareStatement(sQry);			
			rs=pstmt.executeQuery();
			if(rs.next())
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String branch = rs.getString(3);
				double perc = rs.getDouble(4);
				System.out.println(id + " "+name+" "+branch+" "+perc);
			}
			else
			{
				System.out.println("No such record found");
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
					pstmt.close();
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
			if(con != null)
			{
				try {
					con.close();
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
			if(sc !=null)
			{
				sc.close();
			}
		}
	}
}

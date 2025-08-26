package org.btm.pentagonspaceApp;

import java.sql.*;
import java.util.Scanner;

public class JdbcTransacDemo 
{
	public static void main(String[] args) 
	{
		Connection con=null;
		PreparedStatement pstmt1=null;
		PreparedStatement pstmt2=null;
		String iQry1="insert into pentagonspace.studentedu values(?,?,?)";
		String iQry2="insert into pentagonspace.studentper values(?,?,?,?)";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id for student");
		int id=sc.nextInt();
		System.out.println("enter student name");
		String name=sc.next();
		System.out.println("enter percentage");
		double perc=sc.nextDouble();
		System.out.println("enter place name");
		String place=sc.next();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			//Disable auto commit mode before begin transaction but after establishing the connection//
			con.setAutoCommit(false);
			//create the platform 
			pstmt1=con.prepareStatement(iQry1);
			//set data for place holder before execution//
			pstmt1.setInt(1,id);
			pstmt1.setString(2, name);
			pstmt1.setDouble(3, perc);
			pstmt1.executeUpdate();
			System.out.println("data inserted to Student education");
			pstmt2=con.prepareStatement(iQry2);
			pstmt2.setInt(1, id);
			pstmt2.setString(2, name);
			pstmt2.setDouble(3, perc);
			pstmt2.setString(4, place);
			pstmt2.executeUpdate();
			System.out.println("data inserted to student personal");
			//Save Transaction explicitly
			con.commit();
		} 	
		catch (ClassNotFoundException | SQLException e)
		{
			try {
				con.rollback();
			}
			catch (SQLException e1) 
			{
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		finally
		{
			if(pstmt2 !=null)
			{
				try {
					pstmt2.close();
				}
				catch (SQLException e)
				{
					e.printStackTrace();
				}
			}
			if(pstmt1 !=null)
			{
				try {
					pstmt1.close();
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
		System.out.println("closed all the costly resources");
	}
}

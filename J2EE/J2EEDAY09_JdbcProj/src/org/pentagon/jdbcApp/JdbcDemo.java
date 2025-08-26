package org.pentagon.jdbcApp;

public class JdbcDemo 
{
	public static void main(String [] args)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver class loaded and registered");
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}

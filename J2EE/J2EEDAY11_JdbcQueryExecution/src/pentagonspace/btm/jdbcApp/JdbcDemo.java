//code t insert single record into database server by using statement interface//
package pentagonspace.btm.jdbcApp;

import java.sql.*;

public class JdbcDemo 
{
	public static void main(String[] args) 
	{	
		Connection con = null;
		Statement stmt = null;
		String inQuery="insert into PentagonSpace.student values(3,'Vigneshkumar','eee',42.00)";
		int status=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver class loaded and registered");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			System.out.println("connection established with database server");
			stmt=con.createStatement();
			System.out.println("platform created");
			status=stmt.executeUpdate(inQuery);
			System.out.println(status);
		}
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		finally 
		{
			if(stmt != null)
			{
				try {
					stmt.close();
				} catch (SQLException e) 
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
			System.out.println("closed all the costly resourses");
		}
	}

}

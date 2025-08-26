package org.btm.pentagonspaceApp;

import java.sql.*;


public class Batch_Pstmt
{
	 public static void main(String[] args) 
	 {
		 Connection con=null;
		 PreparedStatement pstmt=null;
		 PreparedStatement pstmt1=null;
		 String iQry="insert into pentagonspace.student2 values(8,'manu', 55.56)";
		 String uQry="update pentagonspace.student2 set perc=96.56 where id=2";
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			System.out.println("connection established");
			pstmt=con.prepareStatement(iQry);		 
			//platform created//
			pstmt.addBatch();
			//DML queries added to batch//
			int arr[]=pstmt.executeBatch();
			for (int i : arr) 
			{
				System.out.println(i);
			}
			//batch executed once//
			pstmt1=con.prepareStatement(uQry);
			//platform created//
			pstmt1.addBatch();
			//DML queries are added to a batch//
			int arr1[]=pstmt1.executeBatch();
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
			 if(pstmt1 != null)
			 {
				 try 
				 {
					pstmt1.close();
				} 
				 catch (SQLException e) 
				 {
					e.printStackTrace();
				}
			 }
			 if(pstmt !=null)
			 {
				 try 
				 {
					pstmt.close();
				} 
				 catch (SQLException e)
				 {
					e.printStackTrace();
				}
			 }
			 if (con!=null)
			 {
				 try 
				 {
					con.close();
				}
				 catch (SQLException e) 
				 {
					e.printStackTrace();
				}
			 }
			 System.out.println("closed costly resourses");
		 }
	 }
}

package org.Pentagon.LoadApp;

public class Test 
{
	public static void main(String[] args) 
	{
		try {
			Class.forName("org.Pentagon.LoadApp.Student");
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}

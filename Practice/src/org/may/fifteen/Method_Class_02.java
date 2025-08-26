package org.may.fifteen;

public class Method_Class_02 
{
	static void Mystatic()
	{		//it is directly accessed without creating object it uses main method
		System.out.println("Static Method");
	}
	public void Mypublic()
	{		//public method is called by creating objects
		System.out.println("This is Public Method accessed by only creating by Object");
	}
	public static void main(String[] args) 
	{
		Mystatic();
		//Mypublic(); it throws an error it only accessed by object creation 
		Method_Class_02 MyObj = new Method_Class_02();
		MyObj.Mypublic();
	}

}

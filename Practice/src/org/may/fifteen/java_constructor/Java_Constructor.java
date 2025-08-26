package org.may.fifteen.java_constructor;

public class Java_Constructor /*Constructor name must match the class name & it cannot have return type 
 								constructor is called only after the object is created*/
{
	int b;
	
	public Java_Constructor()
	{
		b=99;
	}
	public static void main(String[] args) 
	{
		Java_Constructor myObj = new Java_Constructor ();
		System.out.println(myObj.b);
	}

}

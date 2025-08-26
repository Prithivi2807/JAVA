package org.may.fifteen.java_constructor;

public class Constructor_Parameter
{
	int x;
	
	public Constructor_Parameter(int y)
	{
		x=y;
	}
	public static void main(String[] args) 
	{
		Constructor_Parameter myobj= new Constructor_Parameter(6);
		System.out.println(myobj.x);
	}

}

package org.may.fifteen;

public class MultipleObjects

{
	final int price =1500;
	String color;
	String brand;
	public static void main (String [] args)
	   {
		MultipleObjects b1=new MultipleObjects();
			b1.color="red";
			b1.brand="fasttrack";
		MultipleObjects b2=new MultipleObjects();
			b2.color="blue";
			b2.brand="americantouristor";
			System.out.println(b1.brand+" "+b1.color+" "+b1.price);
			System.out.println(b2.brand+" "+b2.color+" "+b2.price);
			//modify objects
			b2.color="yellow";
			System.out.println(b2.color);
			
	   }
}
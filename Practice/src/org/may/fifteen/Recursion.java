package org.may.fifteen;

public class Recursion //a function call it self it is called as Recursion
 {
	public static void main(String[] args) 
	{
		int result = sum(5);
		System.out.println("Enter the final number "+result);
	}
	public static int sum(int k)
	{
		if (k > 0)
		{
			System.out.println(k);
			return k + sum (k-1);
		}
		else
		{
			return 0;
		}
	}
}

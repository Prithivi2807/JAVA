package org.may.fifteen;

public class Recursion_02 
{
	public static int sum (int start, int end)
	{
		if(end > start)
		{
			return end+sum(start, end-1);
		}
		else 
		{
			return 0;
		}
	}
	public static void main(String[] args) 
	{
		int result = sum(1,5);
		System.out.println(result);
	}

}

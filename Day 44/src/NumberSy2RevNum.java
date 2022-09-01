import java.util.Scanner;

public class NumberSy2RevNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter te number");
		int n=sc.nextInt();
		for(int i=n; i>=1; i--)
		{
			System.out.print(i+" ");
		}
	}
}

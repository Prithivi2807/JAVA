import java.util.Scanner;

public class PatternProgram6or1 
{
	public static void main(String [] args)
	{
	Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int n=sc.nextInt();
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(i==0||i==n-1||j==0||j==n-1||j==i||j+i==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
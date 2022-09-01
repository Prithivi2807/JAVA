import java.util.Scanner;

public class Assighment2Day39 
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the value");
		int n=scr.nextInt();
		int sp=2*n-3;
		for(int i=1; i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*\t");
			}
			for(int j=1;j<=sp;j++) 
			{
				System.out.print("\t");
			}
			for(int j=i;j>=1;j--)
			{
				if(j==n)
			{
				j--;
			}
				System.out.print("*"+"\t");
			}
			sp-=2;
			System.out.println();
		}
	}
}
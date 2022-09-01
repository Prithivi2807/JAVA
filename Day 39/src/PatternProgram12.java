import java.util.Scanner;

//inversepyramid
public class PatternProgram12 
{
	public static void main (String [] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++)
		{
			for(int j=1; j<i; j++)
			{
				System.out.print(" ");
			}
			for(int k=i; k<=rows; k++)//k=j you can replace that into k=j also k for understanding purposes
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

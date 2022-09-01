import java.util.Scanner;

public class PatternProgram10
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int rows=sc.nextInt();
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=rows; j++)
			{
				if(j<i)
				{
					System.out.print(" ");
				} 
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}

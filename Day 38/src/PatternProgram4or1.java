import java.util.Scanner;
public class PatternProgram4or1 
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int n=sc.nextInt();
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

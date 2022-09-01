import java.util.Scanner;
public class PatternProgram13or1main 
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the odd value");
		int rows=sc.nextInt();
		int space=rows/2;
		int star=1;
		for(int i = 1; i <=rows; i++)
		{
			for (int j = 1; j<=space; j++)
			{
				System.out.print(" ");
			}
			for (int k=1; k<=star; k++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<=rows/2)
			{
				space --;
				star=star+2;
			}
			else
			{
				space++;
				star=star-2;
			}
		}
	}
}

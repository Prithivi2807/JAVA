import java.util.Scanner;

public class SwapWithout3rd 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of x and y");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("before swapping numbers: "+x+" "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("after swapping numbers: "+x+" "+y);
	}
}

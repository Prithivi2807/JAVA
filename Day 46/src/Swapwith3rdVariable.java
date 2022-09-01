import java.util.Scanner;

public class Swapwith3rdVariable 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of x and y");
	int x,y,t;
	x=sc.nextInt();
	y=sc.nextInt();
	System.out.println("before swapping number: "+x+" "+y);
	t=x;
	x=y;
	y=t;
	System.out.println("After swapping number: "+x+" "+y);
	System.out.println();
	}
}

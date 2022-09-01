import java.util.Scanner;

public class NumberSy3digitoOddorEven 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	if(n%2 == 0)
			System.out.println("the given digit is even");
	else
		System.out.println("the given digit is odd");
	}
}

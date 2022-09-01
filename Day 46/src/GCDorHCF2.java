import java.util.Scanner;

public class GCDorHCF2
{
	static int findgcd(int num1, int num2)
	{
		int gcd=0;
		int i=1;
		while(i<=num1 && i<=num2)
		{
			if(num1%i==0 && num2%i==0) 
			{
				gcd=i;
			}
			i++;
		}
		return gcd;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number 1");
		int num1=sc.nextInt();
		System.out.println("enter the number 2");
		int num2=sc.nextInt();
		int gcd=findgcd(num1, num2);
		System.out.println("gcd of given two number is "+ gcd);
	}
}


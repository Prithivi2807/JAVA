import java.util.Scanner;

public class GCDorHCF1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number 1");
		int num1=sc.nextInt();
		System.out.println("enter the number 2");
		int num2=sc.nextInt();
		int i=1;
		int gcd=0;
		while(i<=num1 && i<=num2)
		{
			if(num1%i==0 && num2%i==0)
			{
				gcd=i;
			}
			i++;
		}
		System.out.println("gcd of two given number is "+gcd);
	}
}

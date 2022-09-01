import java.util.Scanner;

public class NumberSy10StrongNumber 
{
	static int fact(int n)
	{
		int fact=1;
		while(n>0)
		{
			fact=fact*n;
			n--;
		}
		return fact;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int r,temp,sum=0;
		temp=n;
		while(n!=0)
		{
			r=n%10;
			sum=sum+fact(r);
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("it is Strong number");
		}else
			System.out.println("it is not a Strong number");
	}
}

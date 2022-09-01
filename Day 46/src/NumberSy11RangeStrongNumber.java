import java.util.Scanner;

public class NumberSy11RangeStrongNumber 
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
		for(int i=0; i<=n; i++)
		{
			int num=i;
			int r,temp,sum=0;
			temp=i;
			while(num!=0)
			{
					r=num%10;
					sum=sum+fact(r);
					num=num/10;
				}
			
			if(temp==sum)
			{
				System.out.println(sum);
			}
		}
	}
}
import java.util.Scanner;

public class NumberSy12Amstrong 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		boolean res=isAmstrong(n);//no method create a amstrong method//
		if(res)
			System.out.println(n+" is a amstrong number");
		else
			System.out.println(n+" is not a amstrong number");
	}

	static boolean isAmstrong(int x) 
	{
	int nd=countDigit(x); //there is no count digit declare a method//
	int t=x;
	int r,sum=0;
	while(x!=0)
	{
		r=x%10;
		sum=sum+pow(r,nd);//reminder no of digits//
		x=x/10;
	}
	if(t==sum)
	{
		return true;
	}
	else
		return false;
	}

	static int pow(int r, int p) 
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*r;
			p--;
		}
		return pw;
	}
	
	static int countDigit(int n)
	{
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		return count;
	}
}

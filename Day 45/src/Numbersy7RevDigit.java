import java.util.Scanner;
public class Numbersy7RevDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int r,sum=0;
		int temp=n;
		while(n!=0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		System.out.println(temp+" reverse= "+sum);
	}
}

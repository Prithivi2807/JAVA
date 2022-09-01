import java.util.Scanner;

public class NumberSy6TocheckPrimeNumber 
{
	public static void main(String[] args) 
	{
	int i,n,counter, j;
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the value to check Prime numbers: ");
	n=sc.nextInt();
	System.out.println("till the prime number between 1 to "+n+" are");
	for(j=2; j<=n; j++)
	{
		counter=0;
		for(i=1;i<=j;i++)
		{
		if(j%i==0)
		{
			counter++;
		}
	}
	if (counter==2)
	System.out.print(j+" ");
		}
	}
}

import java.util.Scanner;
public class Assighment3Day39 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value:");
		int n=sc.nextInt();
		System.out.print("Enter Symbor:");
		char c=sc.next().charAt(0);
		int k=n * 2-1;
		for(int i=1;i<=k;i++)
		{
			for(int j=1;j<=k;j++)
			{
				if(j==i||j==k-i+1)
					System.out.print(c);
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}

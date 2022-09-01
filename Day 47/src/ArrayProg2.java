import java.util.Scanner;

public class ArrayProg2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter "+n+" elements");
		for(int i = 0 ; i < arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("After inserting the elements to array");
		for(int i = 0; i < arr.length; i++)
		{ 
			System.out.print(arr[i] + " ");
		}
	}
}

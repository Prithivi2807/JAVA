import java.util.Scanner;

public class ArrayProg2ReverseCharacterElements 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		char arr[] = new char[n];
		System.out.println("enter "+n+" elements");
		for(int i = 0; i<arr.length; i++)
		{
			arr[i]=sc.next().charAt(0);
		}
		System.out.println("After inserting the elements to array ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int i=0; i<arr.length/2; i++)
		{
			char temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		System.out.println("\n array after reversing the elements ");
		{
			for(int i=0; i<arr.length; i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}

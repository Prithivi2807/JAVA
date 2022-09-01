import java.util.Scanner;

public class ArrayProg4DeletingArray 
	{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("enter"+n+"elements");
	for(int i = 0; i < arr.length; i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("After inserting the elements to array");
	for (int i = 0; i < arr.length; i++)
	{
		System.out.println(i+"----->"+arr[i]+" ");
			}
	System.out.println("enter the index");
	int index=sc.nextInt();
	int narr[]=delete(arr,index);
	for (int i = 0; i < narr.length; i++) 
	{
	System.out.println(i+"----->"+narr[i]);	
	}
}
	static int[] delete(int[] arr, int index)
	{
		if(index < 0 || index > arr.length)
		{
			System.out.println("invalid index");
			return arr;
		}
		int narr[] = new int[arr.length-1];
		for(int i = 0; i< index; i++)
		{
			narr[i]=arr[i];
		}
		for(int i = index; i < arr.length-1; i++)
		{
			narr[i]=arr[i+1];
		}
		return narr;
		}
	}

import java.util.Scanner;

public class ArrayProg5SearchanElement 
	{
		static void display(int[] arr)
		{
			System.out.println("After inserting the elements to array");
			for(int i=0; i<arr.length; i++)
			{
				System.out.println(i+"--->"+arr[i]+" ");
			}
		}
		static int search(int[] arr, int ele)
		{
			for(int i=0; i< arr.length; i++)
			{
				if(arr[i]==ele)
					return i;
			}
			return -1;
		}
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of the array");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("enter "+n+" elements");
	for (int i = 0; i < arr.length; i++) 
	{
		arr[i]=sc.nextInt();
	}
	display(arr);
	System.out.println("enter the element to search");
	int ele=sc.nextInt();
	int res=search(arr,ele);
	if(res>=0) 
	{
		System.out.println("the given "+ele+" is present in index--->"+res);
	}else
		System.out.println("given element is not found in array");
	}
}

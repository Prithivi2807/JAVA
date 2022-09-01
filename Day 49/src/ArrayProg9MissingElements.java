import java.util.Scanner;

public class ArrayProg9MissingElements 
{
	static void display(int[] arr)
	{
		System.out.println("after inserting elements to array");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(i+"----->"+arr[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("enter "+n+" elements");
	for(int i=0; i<arr.length; i++)
	{
		arr[i]=sc.nextInt();
	}
	display(arr);
	arr=sort(arr);
	System.out.println("array after sorting in ascending order");
	display(arr);
	System.out.println("the missing elements are");
	for(int i=0; i<arr.length-1;i++)
		{
		for(int j=arr[i]+1; j<arr[i+1]; j++)
				{
			System.out.print(j+" ");
				}
		}
	}
	static int[] sort(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
}
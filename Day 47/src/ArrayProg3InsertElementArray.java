import java.util.Scanner;

public class ArrayProg3InsertElementArray 
{
	public static void main(String[] args) 
	{
		int arr[]= {10,20,30,40,50};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the index to insert ele");
		int in=sc.nextInt();
		System.out.println("enter the ele");
		int ele=sc.nextInt();
		int[] narr=insert(arr, in, ele);
		for(int i=0; i < narr.length; i++)
		{
			System.out.print(narr[i]+" ");
		}
	}
	static int[] insert(int[] arr, int in, int ele)
	{
		if(in>arr.length||in<0)
		{
			System.out.println("invalid index");
			return arr;
		}
			int narr[]=new int[arr.length+1];
			for(int i=0; i< in; i++)
			{
				narr[i]=arr[i];
			}
			narr[in]=ele;
			for(int i=in; i<arr.length; i++)
			{
				narr[i+1]=arr[i];
			}
			
		return narr;
	}
}

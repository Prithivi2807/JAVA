
public class ArrayProg11PalindromeIngivenElements 
{
	static void display(int[]arr)
	{
		System.out.println("After inserting the elements to array");
		for(int i=0; i< arr.length; i++)
		{
			System.out.println(i+"----->"+arr[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		int arr[]= {232,12,78,898,45,34543};
		display(arr);
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==rev(arr[i]))
			{
				System.out.println(arr[i]+" ");
				count++;
			}
		}
		System.out.println("\nthe count of elements  in given array="+count);
	}
	public static int rev(int n)
	{
		int rev=0;
		while(n>0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		return rev;
	}
}

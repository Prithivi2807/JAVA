import java.util.Scanner;

public class ArrayProg8_Occurance 
	{
		static void display(int[] arr)
		{
			System.out.println("After inserting the elements to array");
			for (int i = 0; i < arr.length; i++)
			{
				System.out.println(i+"----->"+arr[i]+" ");
			}
		}
		public static void main(String [] args)
		{
			int arr[]= {11,20,30,16,28,11,46,20,11};
			display(arr);
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the element to check occurance");
			int ele=sc.nextInt();
			System.out.println("enter the number of occurance to check");
			int oc=sc.nextInt();
			int index=occurance(arr,ele,oc);
			if(index>=0)
			{
				System.out.println("the element occured for "+oc+" times in index "+index);
			}
			else
				System.out.println("the element is not occured for "+oc+" times");
		}
		static int occurance(int[] arr,int ele,int oc)
		{
			int count=0;
			for(int i = 0; i<arr.length; i++)
			{
				if(ele==arr[i])
				{
					count++;
				}
				if(count==oc)
				{
					return i;
				}
			}
			return-1;
		}
		
	}

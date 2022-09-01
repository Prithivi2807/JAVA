import java.util.Scanner;

public class MatrixProg2BiggestEl2dArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the order");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int ar[][]=new int [m][n];
		System.out.println("enter "+m*n+" elements");
		for(int i=0; i<ar.length; i++)
		{
			for(int j=0; j<ar[i].length; j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		System.out.println("entered matrix");
		
		for(int i=0; i<ar.length; i++)
		{
			for(int j=0; j<ar[i].length; j++)
			{
				System.out.println(ar[i][j]+"("+i+","+j+")");
			}
			System.out.println();
		}
		System.out.println();
		maxelementInRow(ar.length,ar);
	}
	static void display(int[] arr)
	{
		for(int i=0;i<arr.length; i++)
			{
				System.out.println(i+1+"row biggest element"+arr[i]+" ");
			}
	}
		public static void maxelementInRow(int rows,int[][] arr)
		{
			int i=0;
			int max=0;
			int[] result= new int[rows];
			while(i<rows)
			{
				for(int j=0; j<arr[i].length;j++)
				{
					if(arr[i][j]>max)
					{
						max=arr[i][j];
					}
				}
				result[i]=max;
				max=0;
				i++;
			}
			System.out.println("biggest elements in each row");
			display(result);
		}
	}
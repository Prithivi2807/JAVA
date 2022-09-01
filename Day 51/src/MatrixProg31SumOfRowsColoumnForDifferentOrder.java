import java.util.Scanner;

public class MatrixProg31SumOfRowsColoumnForDifferentOrder 
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
				System.out.print(ar[i][j]+"("+i+","+j+")");
			}
			System.out.println();
		}
		System.out.println();
		sumelementInRow(ar.length,ar);
		sumelementInCol(ar[0].length,ar);
	}
	static void display(int[] arr)
	{
		for(int i=0;i<arr.length; i++)
			{
				System.out.println(i+1+"row biggest element"+arr[i]+" ");
			}
	}
		public static void sumelementInRow(int rows,int[][] arr)
		{
			int i=0;
			int sum=0;
			while(i < rows)
			{
				for(int j=0; j<arr[i].length;j++)
					{
						sum = sum+arr[i][j];
				}
				System.out.println(i+1 +" Row sum "+sum);
				sum = 0;
				i++;
			}
		}
		public static void sumelementInCol(int col, int[][] arr)
		{
			for(int j=0; j<col; j++)
			{
				int sum=0;
				for(int i=0; i<arr.length; i++)
				{
					sum=sum+arr[i][j];	
				}
				System.out.println(j+1 +" column biggest element "+sum);
			}
		}
	}
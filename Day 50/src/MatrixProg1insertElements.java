import java.util.Scanner;

public class MatrixProg1insertElements
{
	public static void main(String[] args) 
	{	
		int arr[][]=readMat();
		display(arr);
	}
	private static void display(int[][] arr) 
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	private static int[][] readMat() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the order of matrix");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int arr[][]=new int[m][n];
		System.out.println("enter "+m*n+" elements");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		return arr;
	}
}

import java.util.Scanner;

public class MatrixProg3SumOfRowsNdColoumnsForSameOrder
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
		
		
		/* this logic works for same m*n order matrix it means 2*2 or 3*3 if order is not same it will not works*/
		System.out.println("Sum of each row and coloumn");
		for(int i=0; i<ar.length; i++)
		{
			int rsum=0;
			int csum=0;
			for(int j=0; j<ar[0].length; j++)
			{
				rsum=rsum+ar[i][j];
				csum=csum+ar[j][i];
			}
			System.out.println(i+1+" row sum "+rsum);
			System.out.println(i+1+" coloumn sum "+csum);
		}
	}
	
	
	static void display(int[] arr)
	{
		for(int i=0;i<arr.length; i++)
			{
				System.out.println(i+1+"row biggest element"+arr[i]+" ");
			}
	}		
}
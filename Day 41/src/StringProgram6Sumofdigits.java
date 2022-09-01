import java.util.Scanner;

public class StringProgram6Sumofdigits 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		int sum=0; //sum of digits //
		int count=0;	//count the digits occured//
		String nstr=""; //after removing the digits to print the string//
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]>=48 && ch[i]<=57)
			{
				sum=sum+ch[i]-48;
				count++;  //whenever the digits is found count==1//
			}
			else
				nstr=nstr+ch[i]; // if it is not matched the char arrays should be added//
		}
		System.out.println("sum of Digits="+sum);
		System.out.println("no of Digits="+count);
		System.out.println("after removing digits="+nstr);
	}
}

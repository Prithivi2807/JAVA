import java.util.Scanner;

public class StringProgram4ReverseString1 
{
	static String revString(String input)
	{
		String nstr="";
		char[] ch=input.toCharArray();
		for (int i = ch.length-1; i >=0 ; i--)
		{
			nstr=nstr+ch[i];
		}
		return nstr;
	}
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		String rev=revString(str);
		System.out.println(rev);
	}
}

import java.util.Scanner;

public class StringProgram5Palindrome 
{
	static String revString(String input)
	{
		String nstr="";
		char[] ch=input.toCharArray();
		for(int i=ch.length-1; i>=0; i--)
		{
			nstr=nstr+ch[i];
		}
		return nstr;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		String nstr=revString(str);
		if(nstr.equalsIgnoreCase(str))/*nstr.equalsIgnoreCase(str) if lower and upper case is not
		 						matched then try or normal nstr.equals(str)*/
		{
			System.out.println(str+ " the given string is palindrome");
		}
			else
				System.out.println(str+"the given string is not palindrome");
	}
}

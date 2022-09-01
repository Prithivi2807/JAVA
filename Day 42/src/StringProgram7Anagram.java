import java.util.Scanner;

public class StringProgram7Anagram
{
	static String removeSpace(String s)
	{
		char[] ch=s.toCharArray();
		//converted into array//
		String nstr="";
		//create a new empty string//
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]!=' ')
			{
				nstr=nstr+ch[i];
			}
		}
		return nstr;//
	}
	static String lowercase(String s)
	{
		char[] ch=s.toCharArray();
		String nstr=" ";
		for(int i=0; i<ch.length;i++)
		{
			if(ch[i]>=65&&ch[i]<=90)
			{
				nstr=nstr+((char)(ch[i]+32));
			}
			else
				nstr=nstr+ch[i];
		}
		return nstr;
	}
	static boolean compare(String s1, String s2)
	{
		if(s1.length()!=s2.length())
		{
			return false;
		}else
			 s1=lowercase(s1);
			 s2=lowercase(s2);
			 s1=sort(s1);
			 s2=sort(s2);
			 char[] ch1=s1.toCharArray();
			 char[] ch2=s2.toCharArray();
			 for (int i = 0; i < ch1.length; i++) 
			 {
				 if(ch1[i]!=ch2[i])
				 {
					 return false;
				 }
			}
			return true; 
		}
	static String sort (String s2)
	{
		char[] ch=s2.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			for (int j = i+1; j < ch.length; j++)
			{
				if(ch[i]>ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		String s=new String(ch);
		return s;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String1");
		String str1=sc.nextLine();
		System.out.println("enter the String2");
		String str2=sc.nextLine();
		String s1=removeSpace(str1);
		String s2=removeSpace(str2);
		boolean b=compare(s1,s2);
		if(b)//if true=b//
		{
			System.out.println("given string is anagram");
		}
		else
			System.out.println("given string is not anagram");
	}
}
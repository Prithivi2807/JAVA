import java.util.Scanner;

public class StringProgram8Panagram 
{
	static String removeSpace(String s)
	{
		char[] ch=s.toCharArray();
		//converted into array//
		String nstr="";
		for(int i=0; i<ch.length;i++)
		{
			if(ch[i]>=' ')
			{
				nstr=nstr+ch[i];
			}
		}
		return nstr;
	}
	static int check(String st)
	{
		int n=26;
		if(st.length()<n)
		{
			return -1;
		}
		for(char i='A'; i<'Z';i++)
		{
			if((st.indexOf(i)<0) && (st.indexOf((char)(i+32))<0))
			{
				return -1;
			}
		}
		return 1;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string1");
		String str=sc.nextLine();
		String st=removeSpace(str);
		int res=check(st);
		if (res==-1)
		{
			System.out.println("given string is not panagram");
		}else
			System.out.println("given string is a panagram");
	}
}

import java.util.Scanner;
public class StringProgram1 
{								/*converting into lower case*/
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string value");
		String s=sc.nextLine();
		String nstr="";
		char[] ch=s.toCharArray();/*converting into array*/
		for (int i = 0; i < ch.length; i++)
		{
			if(ch[i]>=65 && ch[i]<=90)
			{
				nstr=nstr+(char)(ch[i]+32);
			}
			else
				nstr=nstr+ch[i];
		}
		System.out.println(nstr);
	}
}

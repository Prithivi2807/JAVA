import java.util.Scanner;
public class StringProgram2 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string value");
		String s=sc.nextLine();
		String nstr="";
			/*create a new empty string*/
		char[] ch=s.toCharArray();
			/*convert the string into array*/
		for(int i=0; i<ch.length;i++)
		{
			if(ch[i]!=' ')
			nstr=nstr+ch[i];
			/* if the character at ith index is not equal to
			 space then add that character to new empty string*/
		}
		System.out.println(nstr);
	}
}

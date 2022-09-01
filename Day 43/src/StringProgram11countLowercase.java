import java.util.Scanner;

public class StringProgram11countLowercase 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		int uc=0,lc=0,sp=0,dc=0,spc=0;
		char[] ch=str.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>=65 && ch[i]<=90)
			{
				uc++;
			}
			else if(ch[i]>=97 && ch[i]<=122)
			{
				lc++;
			}
			else if(ch[i]>=48 && ch[i]<=57)
			{
				dc++;
			}
			else if(ch[i]==' ')
			{
				sp++;
			}
			else 
				spc++;
		}
		System.out.println("the count of uppercase "+ uc);
		System.out.println("the count of lowercase "+ lc);
		System.out.println("the count of digits "+ dc);
		System.out.println("the count of space "+ sp);
		System.out.println("the count of special character "+spc);
		}
	}



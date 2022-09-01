import java.util.Scanner;

public class StringProgram3Sortascending 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		/*sort string in alphabetical order*/
		for(int i=0; i<ch.length-1; i++)
		{
			for(int j=i+1; j<ch.length; j++)
			{
				if(ch[i]>ch[j])
				{
					char temp=ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		String st=new String(ch);
		System.out.println(st);
	}
}

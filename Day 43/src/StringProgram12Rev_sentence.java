import java.util.Scanner;

public class StringProgram12Rev_sentence 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		String rev="";
		for (int i = 0; i < ch.length; i++)
		{
			int k=i;
			while(i<ch.length && ch[i]!=' ')
			{
				i++;
			}
			int j=i-1;	//to move back to one position and ignore space
			while(k<=j)
			{
				rev=rev+ch[j];
				j--;
			}
			rev=rev+" ";
		}
		System.out.println(rev);
	}
}

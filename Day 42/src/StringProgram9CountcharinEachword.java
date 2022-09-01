import java.util.Scanner;

public class StringProgram9CountcharinEachword
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string ");
	String str=sc.nextLine();
	int count=0;
	String nstr=" ";
	for (int i = 0; i < str.length(); i++) 
	{
		if(str.charAt(i)==' ')
		{
			nstr=nstr+"="+count+" ";
			count=0;
		}
		else
		{
			count++;
			nstr=nstr+str.charAt(i);
		}
	  }
		nstr=nstr+"="+count+" ";
		System.out.println("count of characters "+nstr);
	}
}

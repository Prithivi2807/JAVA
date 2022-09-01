import java.util.Scanner;

public class StringProgram10CountnoofTimes 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		int n=str.length();
		char[] ch=str.toCharArray();
		for(int i=0; i<n; i++)
		{
			int count=1;
			for (int j = i+1; j <n; j++) 
			{
				if(ch[i]==ch[j])
				{
					count++;
					int k=j;
					while(k<n-1)
					{
						ch[k]=ch[k+1];	//sharath//
						k++;
					}
					n--;	//if the character duplicate occurs it removed that length will be removed//
					j--;
				}
			}
			System.out.println("character "+ch[i]+" Occured for "+count+" times");
		}
		String nstr="";
		for(int i=0;i<n;i++)
		{
			nstr=nstr+ch[i];
		}
		System.out.println(nstr);
	}
}

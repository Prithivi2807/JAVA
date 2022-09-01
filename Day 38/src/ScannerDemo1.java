import java.util.Scanner;

public class ScannerDemo1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the username");
		String user=sc.nextLine();
		System.out.println("enter contact");
		long cn=sc.nextLong();
		System.out.println("username="+user);
		System.out.println("contact="+cn);
	}
}

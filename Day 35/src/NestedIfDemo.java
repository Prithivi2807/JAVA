
public class NestedIfDemo 
{
	public static void main(String[] args) 
		{
		int age=14;
		double weight=55.5;
		if(age>=18)
		{
			if(weight>=50)
			{
				System.out.println("you are eligible to donate blood");
			}
			else
				System.out.println("your weight is less than 50");
		}
		else
			System.out.print("your age is less than 18");
	}
}


public class SwitchDemo1
{
	public static void main(String [] args) 
	{
		String day="monday";
		switch (day)
		{
		case "monday":
			System.out.println("goto college");
			break;
		case "tuesday":
			System.out.println("goto temple");
			break;
		case "wednesday":
			System.out.println("goto library");
			break;
		default:
			System.out.println("enjoy the day");
			break;
		}
	}
}

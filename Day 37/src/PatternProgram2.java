public class PatternProgram2 
{
	public static void main(String [] args)
	{
		int n=5;
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print((char)(j+65));
			}
			System.out.println();
		}
	}
}

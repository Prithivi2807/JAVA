
public class PatternProgram3 
{
	public static void main(String [] args)
	{
		int n=5;
		int k=65;
		for (int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print((char)(j+k));
			}
			k=k+n;
			System.out.println();
		}
	}
}

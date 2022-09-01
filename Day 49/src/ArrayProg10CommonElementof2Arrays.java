
public class ArrayProg10CommonElementof2Arrays 
{
	public static void main(String[] args) 
	{
		int arr1[]={10,23,46,75,85,90};
		int arr2[]={28,18,10,90,30,46};
		{
			for(int i=0; i<arr1.length; i++)
			{
				for(int j=0; j<arr2.length; j++)
				if(arr1[i]==arr2[j])
				{
					System.out.print(arr1[i]+" ");
					break;
				}
			}
		}
	}
}


public class ArrayProg71stBiggest2ndBiggest 
	{
	public static void main(String[] args) 
	{
	int arr[]= {10,12,28,15};
	int fbig=arr[0];
	int sbig=arr[1];
	for (int i = 0; i < arr.length; i++) 
	{
		if(fbig<arr[i])
		{
			fbig=arr[i];
			sbig=fbig;
		}
		else if(sbig>arr[i])
		{
			sbig=arr[i];
			}
		}
	System.out.println("First Biggest Element "+fbig);
	System.out.println("Second Biggest Element "+sbig);
	}
}

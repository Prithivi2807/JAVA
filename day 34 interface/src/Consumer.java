
public class Consumer 
{
	public static void main(String [] args)
	{
		ICombo co=new UshaFan(); //up-casting
		co.sOn();
		co.increaseSpeed();
		co.decreaseSpeed();
		co.sOff();
	}
}

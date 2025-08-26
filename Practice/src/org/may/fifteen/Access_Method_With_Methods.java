package org.may.fifteen;

public class Access_Method_With_Methods 
{
	public void Throttle()
	{
		System.out.println("The car is going to fast as it can !");
	}
	public void speed(int maxspeed)
	{
		System.out.println("Maximum speed is : "+maxspeed);
	}
	public static void main(String[] args) 
	{
		Access_Method_With_Methods car = new Access_Method_With_Methods();
		car.Throttle();
		car.speed(160);
	}
}

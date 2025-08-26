package org.ps.lightApp;

public class LightFactory 
{
	/*object creation logic*/
	public static ISwitch getLight(String type)
	{
		if(type.equalsIgnoreCase("Ledlight"))
		{
			return new LedLightImpl();
		}
		else if(type.equalsIgnoreCase("TubeLight"))
		{
			return new TubeLightImpl();
		}
		else
			System.out.println("There is no such light");
			return null;
	}
}

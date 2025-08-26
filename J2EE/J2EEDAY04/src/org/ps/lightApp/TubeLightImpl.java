package org.ps.lightApp;

public class TubeLightImpl implements ISwitch
{
	/*implementation logic*/
	@Override
	public void sOn()
	{
		System.out.println("Tubelight switch is on");
	}
	
	@Override
	public void sOff()
	{
		System.out.println("Tubelight switch is off");
	}

}

package org.ps.lightApp;

public class LedLightImpl implements ISwitch
{
	/*implementation logic*/
	@Override
	public void sOn()
	{
		System.out.println("Led light switch is On");
	}
	@Override
	public void sOff()
	{
		System.out.println("led light switch is Off");
	}
}

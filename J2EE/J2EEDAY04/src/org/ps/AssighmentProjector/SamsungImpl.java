package org.ps.AssighmentProjector;
/*Implements logic*/
public class SamsungImpl implements IRemote
{
	@Override
	public void Freeze()
	{
		System.out.println("Samsung Projector is freezed");
	}
	@Override
	public void On()
	{
		System.out.println("Samsung projector is On");
	}
	@Override
	public void Off()
	{
		System.out.println("Samsung projector is Off");
	}
}

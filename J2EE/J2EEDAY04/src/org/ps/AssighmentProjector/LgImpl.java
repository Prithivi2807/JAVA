package org.ps.AssighmentProjector;
/*Implements logic*/
public class LgImpl implements IRemote
{

	@Override
	public void Freeze() 
	{
		System.out.println("Lg Projector is freezed");
	}

	@Override
	public void On() 
	{
		System.out.println("Lg projector is On");
	}

	@Override
	public void Off() 
	{
		System.out.println("Lg projector is Off");
	}

}

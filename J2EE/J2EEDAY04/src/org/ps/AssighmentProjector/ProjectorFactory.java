package org.ps.AssighmentProjector;
/*Object Creation logic*/
public class ProjectorFactory 
{
	public static IRemote getProjector (String type)
	{
		if(type.equalsIgnoreCase("Lg"))
		{
			return new LgImpl();
		}
		else if(type.equalsIgnoreCase("Samsung"))
		{
			return new SamsungImpl();
		}
		else
		{
			System.out.println("There is no such Projector type");
			return null;
		}
	}
}

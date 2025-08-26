package org.ps.AssighmentProjector;

import java.util.Scanner;

/* Consumer/Utilization logic */
public class ProjectorTest 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the type of Projector");
	String type=sc.nextLine();
	IRemote Projector=ProjectorFactory.getProjector(type);
	if(Projector!=null)
	{
	Projector.Freeze();
	Projector.On();
	Projector.Off();
	}
  }
}

package org.may.fifteen.java_constructor;

public class Car_Example_01
{
	int modelYear;
	String BrandName;
	String BrandModel;
	public Car_Example_01(int year,String name,String model)
	{
		modelYear=year;
		BrandName=name;
		BrandModel=model;
	}
	public static void main(String[] args) 
	{
		Car_Example_01 myobj = new Car_Example_01(1999,"BMW","X5");
		System.out.println(myobj.modelYear+" "+myobj.BrandName+" "+myobj.BrandModel);
	}

}

package it.unibo.oop.robot.base.arms;

public class BasicArm 
{
	private static final double CONSUPTION_FOR_PICK_UP = 10.0;
	private static final double CONSUPTION_FOR_DROP_DOWN = 10.0;
	private boolean isGrabbing;
	private String name;
	
	public BasicArm(String name)
	{
		this.name = name;
		this.isGrabbing = false;
		
	}
	
	public boolean isGrabbing()
	{
		return this.isGrabbing;
	}
	
	public void pickUp()
	{
		this.isGrabbing = true;
	}
	
	public void dropDown()
	{
		this.isGrabbing = false;
	}
	
	public double getConsuptionForPickUp()
	{
		return CONSUPTION_FOR_PICK_UP;
	}
	
	public double getConsuptionForDropDown()
	{
		return CONSUPTION_FOR_DROP_DOWN;
	}
	
	@Override
	public String toString()
	{
		return name;
	}
	
	
}

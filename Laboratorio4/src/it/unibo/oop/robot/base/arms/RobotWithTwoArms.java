package it.unibo.oop.robot.base.arms;
import it.unibo.oop.robot.base.BaseRobot;

public class RobotWithTwoArms extends BaseRobot implements RobotWithArms
{ 
	
	public RobotWithTwoArms(String robotName) 
	{
		super(robotName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean pickUp() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean dropDown() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getCarriedItemsCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}

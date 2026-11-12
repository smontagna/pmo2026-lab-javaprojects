package it.unibo.oop.robot.base.arms;

import it.unibo.oop.robot.base.Robot;


public interface RobotWithArms extends Robot
{
	boolean pickUp();			//picks an object, returns true if the action is successful
	boolean dropDown();			//drops an object, returns true if the action is successful
	int getCarriedItemsCount();
}

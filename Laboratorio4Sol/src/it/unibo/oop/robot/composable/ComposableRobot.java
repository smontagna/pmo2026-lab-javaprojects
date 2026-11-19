package it.unibo.oop.robot.composable;

import it.unibo.oop.robot.base.Robot;
import it.unibo.oop.robot.components.RobotPart;

public interface ComposableRobot extends Robot {

    void attachComponent(RobotPart rp);

    void detachComponent(RobotPart rp);

    void doCycle();

}

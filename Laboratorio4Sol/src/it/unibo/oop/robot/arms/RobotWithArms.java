package it.unibo.oop.robot.arms;

import it.unibo.oop.robot.base.Robot;

/**
 * Models a generic robot with two
 * {@link it.unibo.oop.lab04.robot.arms.BasicArm}
 *
 */
public interface RobotWithArms extends Robot {

    boolean pickUp();

    boolean dropDown();

    int getCarriedItemsCount();

}

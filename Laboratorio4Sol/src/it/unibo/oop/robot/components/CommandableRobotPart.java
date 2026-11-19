package it.unibo.oop.robot.components;

public interface CommandableRobotPart extends RobotPart {

    void sendCommand(String c);

    String[] availableCommands();

}

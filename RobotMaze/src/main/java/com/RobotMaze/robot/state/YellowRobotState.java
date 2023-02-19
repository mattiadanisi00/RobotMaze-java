package com.RobotMaze.robot.state;

import com.RobotMaze.robot.Robot;
import com.RobotMaze.robot.strategy.FleeStrategy;

public class YellowRobotState implements RobotState {
    private final Robot robot;
    public YellowRobotState(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void changeState() {
        robot.setMovementStrategy(new FleeStrategy(robot.getMaze().getMaze()));
    }
}

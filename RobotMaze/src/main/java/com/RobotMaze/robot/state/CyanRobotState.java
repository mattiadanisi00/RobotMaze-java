package com.RobotMaze.robot.state;

import com.RobotMaze.robot.strategy.EvadeStrategy;
import com.RobotMaze.robot.Robot;

public class CyanRobotState implements RobotState {
    private final Robot robot;
    public CyanRobotState(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void changeState() {
        robot.setMovementStrategy(new EvadeStrategy(robot.getMaze().getMaze()));
    }
}

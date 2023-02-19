package com.RobotMaze.robot.state;

import com.RobotMaze.robot.strategy.PursuitAndSeekStrategy;
import com.RobotMaze.robot.Robot;

public class RedRobotState implements RobotState {
    private final Robot robot;
    public RedRobotState(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void changeState() {
        robot.setMovementStrategy(new PursuitAndSeekStrategy(robot.getMaze().getMaze()));
    }
}

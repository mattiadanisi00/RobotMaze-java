package com.RobotMaze.robot.strategy;


import com.RobotMaze.robot.Robot;
import com.RobotMaze.robot.utility.Point;

//Strategy pattern
//Used to implements different robot strategies
public interface RobotMovementStrategy {
    void move(Point start, Point end, Robot robot);
}

package com.RobotMaze.robot.strategy;

import com.RobotMaze.robot.solver.MazeSolverEvade;
import com.RobotMaze.robot.utility.Point;
import com.RobotMaze.robot.Robot;

import java.util.Deque;


public class EvadeStrategy implements RobotMovementStrategy {

    private boolean[][] maze;

    public EvadeStrategy(boolean[][] maze) {
        this.maze = maze;
    }

    //Evade let the robot moves in a random position
    @Override
    public void move(Point start, Point end, Robot robot) {
        //call Evade strategy. It will return a queue of steps
        MazeSolverEvade solver = new MazeSolverEvade(maze, start);
        Deque<Point> stepsQueue = solver.solve(start,end);

        //store the next step in a variable
        Point nextStep = stepsQueue.pop();

        //disable Dijkstra path.
        //If PursuitAndSeek or Flee are called, the robot need to calculate the shortest path
        robot.setPathValid(false);

        //move the robot using the random next position
        robot.moveFromCurrentPosition(nextStep);
    }
}

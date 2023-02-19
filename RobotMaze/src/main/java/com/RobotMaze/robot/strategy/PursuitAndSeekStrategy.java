package com.RobotMaze.robot.strategy;

import com.RobotMaze.robot.solver.MazeSolverDijkstra;
import com.RobotMaze.robot.utility.Point;
import com.RobotMaze.robot.Robot;

public class PursuitAndSeekStrategy implements RobotMovementStrategy {

    private boolean[][] maze;

    public PursuitAndSeekStrategy(boolean[][] maze) {
        this.maze = maze;
    }

    @Override
    public void move(Point start, Point end, Robot robot) {

        //Since there are as many as 3 strategies using Dijkstra, the robot will
        //save the path locally once calculated and set a boolean variable to true
        //that will be checked whenever the PursuitAndSeek and Flee strategies are called.
        //In this way Dijkstra will be called only when necessary
        if(!robot.isPathValid()){
            MazeSolverDijkstra solver = new MazeSolverDijkstra(maze, start, end);
            robot.setPath(solver.solve());
            robot.setPathValid(true);
        }

        robot.moveFromCurrentPosition(robot.getPath().pop());

    }
}


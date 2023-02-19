package com.RobotMaze.robot.strategy;

import com.RobotMaze.robot.solver.MazeSolverDijkstra;
import com.RobotMaze.robot.utility.Point;
import com.RobotMaze.robot.Robot;

public class FleeStrategy implements RobotMovementStrategy {

    private boolean[][] maze;

    public FleeStrategy(boolean[][] maze) {
        this.maze = maze;
    }

    @Override
    public void move(Point start, Point end, Robot robot) {

        if(!robot.isPathValid()){
            MazeSolverDijkstra solver = new MazeSolverDijkstra(maze, start, end);
            robot.setPath(solver.solve());
            robot.setPathValid(true);
        }


        //Error handling for NullPointerException
        if(robot.getPath() == null) {
            throw new NullPointerException("robot.getPath() is null");
        }

        //since flee moves two cells at a time, we want to verify that
        //the middle cell is not the ending point
        if(robot.getPath().peek().equals(end)) {
            robot.moveFromCurrentPosition(robot.getPath().pop());
        } else {
            if(!robot.getPath().isEmpty())
                robot.getPath().pop();
            if(!robot.getPath().isEmpty())
                robot.moveFromCurrentPosition(robot.getPath().pop());
        }
    }
}

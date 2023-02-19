package com.RobotMaze.robot.solver;

import com.RobotMaze.robot.utility.Direction;
import com.RobotMaze.robot.utility.Point;

import java.util.*;

public class MazeSolverEvade {
    private boolean[][] maze;
    private Point start;

    public MazeSolverEvade(boolean[][] maze, Point start) {
        this.maze = maze;
        this.start = start;
    }

    //method solve() used to get a random direction
    public Deque<Point> solve(Point start, Point end){
        Deque<Point> queue = new ArrayDeque<>();
        Random rand = new Random();
        Point nextPoint = new Point();

        //generates a random direction and checks whether the new position is free
        //If it is not, it continues by generating other random positions
        do {
            Direction randomDir = Direction.values()[rand.nextInt(Direction.values().length)];
            nextPoint.setX(start.getX() + randomDir.dx);
            nextPoint.setY(start.getY() + randomDir.dy);
        } while (maze[nextPoint.getX()][nextPoint.getY()]);

        queue.add(nextPoint);
        return queue;
    }
}

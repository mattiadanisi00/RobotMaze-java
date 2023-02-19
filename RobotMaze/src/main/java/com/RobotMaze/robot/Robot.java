package com.RobotMaze.robot;

import com.RobotMaze.maze.Color;
import com.RobotMaze.maze.Maze;
import com.RobotMaze.robot.state.*;
import com.RobotMaze.robot.strategy.PursuitAndSeekStrategy;
import com.RobotMaze.robot.strategy.RobotMovementStrategy;
import com.RobotMaze.robot.utility.Point;

import java.util.*;

//main class of this application
public class Robot {

    private Maze maze;
    private RobotState state;
    private RobotMovementStrategy movementStrategy;
    private Point currentPosition;
    private List<Point> steps;
    private Deque<Point> path;
    private boolean isPathValid;

    public Robot(Maze maze) {
        this.movementStrategy = new PursuitAndSeekStrategy(maze.getMaze());
        this.state = new GreenRobotState(this);
        this.maze = maze;
        this.currentPosition = new Point(1, 1, null);
        this.steps = new ArrayList<>();
        this.steps.add(this.currentPosition);
        this.isPathValid = false;
    }

    public Deque<Point> getPath() {
        return path;
    }

    public void setPath(Deque<Point> path) {
        this.path = path;
    }

    public boolean isPathValid() {
        return isPathValid;
    }

    public void setPathValid(boolean pathValid) {
        isPathValid = pathValid;
    }

    //method used to move the robot from its current position to the next point
    //It also stores the step in the list that will be returned as JSON file to the client
    public void moveFromCurrentPosition(Point nextPosition) {
        this.currentPosition = nextPosition;
        this.steps.add(nextPosition);
    }

    public Point getCurrentPosition() {
        return currentPosition;
    }

    //method used to move by using the current movementStrategy
    public void move(Point end) {
        this.movementStrategy.move(currentPosition, end, this);
    }

    public List<Point> getSteps() {
        return steps;
    }

    public void setMovementStrategy(RobotMovementStrategy movementStrategy) {
        this.movementStrategy = movementStrategy;
    }

    public Maze getMaze() {
        return maze;
    }

    public void setState(Color color) {


        if (color == Color.GREEN) {
            this.state = new GreenRobotState(this);
            this.state.changeState();
        }

        else if (color == Color.RED) {
            this.state = new RedRobotState(this);
            this.state.changeState();
        }

        else if (color == Color.YELLOW) {
            this.state = new YellowRobotState(this);
            this.state.changeState();
        }

        else {
            this.state = new CyanRobotState(this);
            this.state.changeState();
        }
    }

    public Map<Point, Color> spawnColors() {
        return this.maze.spawnColors();
    }

    public Point getEnd() {
        return this.maze.getEnd();
    }
}


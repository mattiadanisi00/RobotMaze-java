package com.RobotMaze.game;

import com.RobotMaze.maze.Color;
import com.RobotMaze.robot.Robot;
import com.RobotMaze.robot.strategy.EvadeStrategy;
import com.RobotMaze.robot.strategy.PursuitAndSeekStrategy;
import com.RobotMaze.robot.strategy.RobotMovementStrategy;
import com.RobotMaze.robot.utility.Point;

import java.util.Map;

//Class Game with static method Play() used to run a RobotMaze game
public class Game {
    public static GameStats play(Robot robot) {

        //initialize ending point
        Point end = robot.getEnd();

        //Spawn color
        Map<Point, Color> colorMap = robot.spawnColors();

        //Run this loop until the robot gets to the end
        while (!robot.getCurrentPosition().equals(end)) {

            //Check if Robot is on a color object
            //Use a map by passing the robot current position
            if(colorMap.containsKey(robot.getCurrentPosition())){

                //If yes, retrieve the color to change the strategy
                Color color = colorMap.get(robot.getCurrentPosition());

                //change strategy
                robot.setState(color);
            }

            //Move the robot according to the current strategy
            robot.move(end);

            //Re-Spawn the color object
            colorMap = robot.spawnColors();
        }

        return new GameStats(robot.getSteps(), robot.getMaze().getColorList(), robot.getMaze().getMaze());
    }
}

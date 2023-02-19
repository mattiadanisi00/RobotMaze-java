package com.RobotMaze.game;

import com.RobotMaze.maze.Color;
import com.RobotMaze.robot.utility.Point;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.List;
import java.util.Map;

//A class used to export all game stats a JSON File. It will be managed in the front end layer to show the game to the user
public class GameStats {

    //The steps made in the game
    @JsonSerialize
    private final List<Point> steps;

    //The color map for every robot step
    @JsonSerialize
    private final List<Map<Point, Color>> colorList;

    @JsonSerialize
    private final boolean[][] mazeLayout;

    public GameStats(List<Point> steps, List<Map<Point, Color>> colorList, boolean[][] mazeLayout) {
        this.steps = steps;
        this.colorList = colorList;
        this.mazeLayout = mazeLayout;
    }

    public List<Point> getSteps() {
        return steps;
    }
}

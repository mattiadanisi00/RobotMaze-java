package com.RobotMaze.maze;

import com.RobotMaze.robot.utility.Point;

import java.util.*;

public class Maze {

    private final double SPAWN_PROBABILITY = 0.4;
    private List<Map<Point, Color>> colorList;
    private final Point end;

    //boolean 2D array used to represent our maze.
    //True means 'Wall' and False means 'Free passage'
    private final boolean[][] maze;

    public Maze(boolean[][] maze) {
        this.colorList = new ArrayList<>();
        this.end = new Point(14,14,null);
        this.maze = maze;
    }

    public boolean[][] getMaze() {
        return maze;
    }

    public List<Map<Point, Color>> getColorList() {
        return colorList;
    }

    public Point getEnd() {
        return end;
    }

    //It iterates the entire 2D array and, on each empty cell, there is a 40% chance that a color will be spawned
    //If yes, the color object is mapped
    public Map<Point, Color> spawnColors () {

        Map<Point, Color> colorMap = new HashMap<>();
        Random rand = new Random();
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (!maze[i][j]) {
                    if (rand.nextDouble() < SPAWN_PROBABILITY) {
                        Color randomColor = Color.getRandomColor();
                        Point newPoint = new Point(i,j,null);
                        colorMap.put(newPoint, randomColor);
                    }
                }
            }
        }

        //At the end of every spawnColor() call, we save the map in the list
        colorList.add(colorMap);
        return colorMap;
    }

}

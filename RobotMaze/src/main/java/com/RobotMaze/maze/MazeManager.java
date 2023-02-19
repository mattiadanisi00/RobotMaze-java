package com.RobotMaze.maze;

//Simple class with a static method that takes in input a string, sent by the user via browser, and returns the chosen 2D boolean layout
public class MazeManager {
    public static Maze selectMaze(String difficulty) {
        if(difficulty.equalsIgnoreCase("NOOB")) {
            return new Noob().createMaze();
        }

        else if (difficulty.equalsIgnoreCase("MEDIUM")){
            return new Medium().createMaze();
        }

        else if (difficulty.equalsIgnoreCase("MAZEMASTER")) {
            return new MazeMaster().createMaze();
        }

        else throw new IllegalArgumentException("Invalid maze difficulty");
    }
}

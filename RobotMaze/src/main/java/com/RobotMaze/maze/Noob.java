package com.RobotMaze.maze;

//Implementation of factory method to create 'Noob' layout (Difficulty: Easy)
public class Noob implements MazeFactory {

    @Override
    public Maze createMaze() {
        return new Maze(new boolean[][] {
                {true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true},
                {true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true},
                {true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, true},
                {true, false, false, true, false, false, false, true, true, true, true, true, true, true, true, true},
                {true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, true},
                {true, true, true, true, false, false, false, false, false, false, false, false, false, false, false, true},
                {true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, true},
                {true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, true},
                {true, false, false, true, false, false, false, true, false, false, false, false, false, false, false, true},
                {true, false, false, true, false, false, false, true, false, false, false, false, false, false, false, true},
                {true, false, false, false, false, false, false, true, false, false, false, true, true, true, true, true},
                {true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, true},
                {true, false, false, false, false, false, false, true, false, false, true, true, true, true, true, true},
                {true, false, false, false, true, true, false, true, false, false, false, false, false, false, false, true},
                {true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, true},
                {true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true}});
    }
}

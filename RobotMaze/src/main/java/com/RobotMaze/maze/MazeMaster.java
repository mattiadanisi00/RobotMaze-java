package com.RobotMaze.maze;

//Implementation of factory method to create 'MazeMaster' layout (Difficulty: Hard)
public class MazeMaster implements MazeFactory {

    @Override
    public Maze createMaze() {
        return new Maze(new boolean[][] {
                {true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true},
                {true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true},
                {true, false, true, true, true, false, true, true, true, true, true, true, true, true, true, true},
                {true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, true},
                {true, false, false, false, true, true, true, true, true, false, true, true, true, true, true, true},
                {true, false, false, false, false, false, false, false, true, false, false, false, false, false, false, true},
                {true, false, true, true, true, true, true, false, true, true, true, true, false, true, true, true},
                {true, false, false, false, false, false, true, false, false, false, false, true , false , false, false, true},
                {true, true, true, false, true, false, true, true, true, true, true, true, true, true, true, true},
                {true, false, false, false, true, false, false, false, false, false, true, false, false, false, false, true},
                {true, false, false, false, true, false, false, false, false, false, true, false, false, false, false, true},
                {true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true},
                {true, false, false, false, true, false, false, true, false, false, false, true, false, false, false, true},
                {true, false, false, false, true, false, false, true, false, true, false, true, false, true, false, true},
                {true, false, false, false, false, false, false, false, false, true, false, false, false, true, false, false},
                {true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true}
        });
    }
}


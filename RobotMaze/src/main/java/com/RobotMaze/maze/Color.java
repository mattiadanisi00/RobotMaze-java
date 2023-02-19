package com.RobotMaze.maze;

import java.util.Random;

//A simple enum class used to manage colors
public enum Color {
    RED, GREEN, YELLOW, CYAN;

    //A static method used to get a random color
    public static Color getRandomColor() {
        Random rand = new Random();
        return values()[rand.nextInt(values().length)];
    }

}

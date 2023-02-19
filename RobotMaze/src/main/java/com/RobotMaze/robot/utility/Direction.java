package com.RobotMaze.robot.utility;

import java.util.Random;

public enum Direction {

    UP(0, -1), DOWN(0, 1), LEFT(-1, 0), RIGHT(1, 0),
    UP_RIGHT(1, -1), DOWN_RIGHT(1, 1), UP_LEFT(-1, -1), DOWN_LEFT(-1, 1);

    public final int dx;
    public final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }


    public Direction getRandomDirection() {
        Random random = new Random();
        return Direction.values()[random.nextInt(Direction.values().length)];
    }
}


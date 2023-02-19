package com.RobotMaze.robot.solver;

import com.RobotMaze.robot.utility.Direction;
import com.RobotMaze.robot.utility.Point;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;


    public class MazeSolverDijkstra {

        // 2D array to represent the maze, where true means there is a wall, and false means there is a path
        private boolean[][] maze;
        // 2D array to store the distance of each cell from the starting point
        private int[][] distances;
        // 2D array to mark the cells that have been visited
        private boolean[][] visited;
        // Starting point of the maze
        private Point start;
        // Exit point of the maze
        private Point end;

        public MazeSolverDijkstra(boolean[][] maze, Point start, Point end) {
            this.maze = maze;
            this.start = start;
            this.end = end;
            this.distances = new int[maze.length][maze[0].length];
            this.visited = new boolean[maze.length][maze[0].length];

            // Initialize all cells distance to max value and visited to false
            for (int i = 0; i < maze.length; i++) {
                for (int j = 0; j < maze[i].length; j++) {
                    distances[i][j] = Integer.MAX_VALUE;
                    visited[i][j] = false;
                }
            }
            // set the starting point distance to 0
            distances[start.getX()][start.getY()] = 0;
        }

        public Deque<Point> solve() {
            // Create a priority queue to store the cells that need to be visited
            // The cells are compared based on their distance from the starting point
            //We are using a lambda expression. It returns:
            //      NEGATIVE:  if the distance of p1 is less than the distance of p2
            //      ZERO: if they are equal
            //      POSITIVE: if the distance of p1 is greater than the distance of p2
            PriorityQueue<Point> queue = new PriorityQueue<>((p1, p2) -> distances[p1.getX()][p1.getY()] - distances[p2.getX()][p2.getY()]);
            // Add the starting point to the queue
            queue.offer(start);
            // Continue while the queue is not empty
            while (!queue.isEmpty()) {
                // Get the cell with the smallest distance from the starting point
                Point current = queue.poll();
                // If the current cell is the exit, return the path to it
                if (current.equals(end)) {
                    return getPath(current);
                }
                // Mark the current cell as visited
                visited[current.getX()][current.getY()] = true;
                // Visit all unvisited neighbors
                for (Direction direction : Direction.values()) {
                    int newX = current.getX() + direction.dx;
                    int newY = current.getY() + direction.dy;

                    //the code will check if the new coordinates are within the bounds of the maze and if the cell is unvisited and not a wall:
                    if (newX >= 0 && newX < maze.length && newY >= 0 && newY < maze[newX].length && !visited[newX][newY] && !maze[newX][newY]) {
                        int newDistance = distances[current.getX()][current.getY()] + 1;
                        if (newDistance < distances[newX][newY]) {
                            distances[newX][newY] = newDistance;
                            Point newPoint = new Point(newX, newY, current);
                            queue.offer(newPoint);
                        }
                    }
                }
            }
            return null;
        }

        // This method will retrace the path from the end point to the starting point
        private Deque<Point> getPath(Point current) {
            Deque<Point> path = new ArrayDeque<>();
            while (current != null) {
                path.push(current);
                current = current.getPrev();
            }

            //removing starting point because it is already stored
            path.pop();

            return path;
        }
    }




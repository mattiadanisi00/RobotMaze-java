package com.RobotMaze.session;

import com.RobotMaze.maze.Maze;
import com.RobotMaze.maze.MazeManager;
import com.RobotMaze.player.Player;
import com.RobotMaze.player.PlayerService;
import com.RobotMaze.game.Game;
import com.RobotMaze.game.GameStats;
import com.RobotMaze.robot.Robot;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpSession;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

//Class used to manage the game session
@Controller
@Component
public class SessionController {


    public SessionController(PlayerService playerService) {
        this.playerService = playerService;
    }

    private final PlayerService playerService;


    //This routes takes firstName, lastName and difficulty, sent by the player, as input
    //It returns the game stats
    @GetMapping("/game/play")
    public @ResponseBody GameStats startGame(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String difficulty) {

        Maze maze = MazeManager.selectMaze(difficulty);
        Robot robot = new Robot(maze);

        GameStats gameStats = Game.play(robot);

        //Db connection handling
        try {
            playerService.savePlayer(new Player(firstName,lastName, gameStats.getSteps().size(), new Date(), difficulty));
        } catch (DataAccessException e) {
            System.out.println("ERROR: " + e);
        }

        //@ResponseBody annotation causes gameStats to be returned as JSON
        return gameStats;
    }
}




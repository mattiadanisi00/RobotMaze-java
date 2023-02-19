package com.RobotMaze.player;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Class used to control the player routes
@RestController
@RequestMapping(path = "player")
public class PlayerController {

    private final PlayerService playerService;
    private final ObjectMapper objectMapper; //Jackson ObjectMapper

    //Dependency injection
    @Autowired
    public PlayerController(PlayerService playerService, ObjectMapper objectMapper) {
        this.playerService = playerService;
        this.objectMapper = objectMapper;
    }

    //GetMapping is used to manage the specific route
    //In this case, the server will return the whole mongoDB collection (all the game played by every user) as JSON file
    @GetMapping(value = "/ranking", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAllPlayers(@PageableDefault(page = 0, size = Integer.MAX_VALUE, sort = "points", direction = Sort.Direction.ASC) Pageable pageable) throws JsonProcessingException {
        return objectMapper.writeValueAsString(playerService.getAllPlayersSortedByPoints(pageable));
    }

}

package com.RobotMaze.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


//Class used to implement the player service operation
@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    //Method used to save the player to the collection
    public void savePlayer(Player player) {
        playerRepository.save(player);
    }

    //Method used to query the whole player collection
    public Page<Player> getAllPlayersSortedByPoints(Pageable pageable) {
        return playerRepository.findAll(PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), Sort.by("points").ascending()));
    }
}

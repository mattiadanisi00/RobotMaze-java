package com.RobotMaze.player;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//Interface used to work with mongodb
@Repository
public interface PlayerRepository extends MongoRepository<Player, String> {
}

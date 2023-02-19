package com.RobotMaze.player;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//Player class used to store every game in our MongoDb database

//@Document tells spring boot that this is a MongoDB document that should be stored in the 'player' collection
@Document(collection = "player")
public class Player {
    @Id
    private String id;
    private final String firstName;
    private final String lastName;
    private final int points;
    private final Date date;
    private final String difficulty;


    public Player(String firstName, String lastName, int points, Date date, String difficulty) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.points = points;
        this.date = date;
        this.difficulty = difficulty;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPoints() {
        return points;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", points=" + points +
                ", date=" + date +
                '}';
    }
}


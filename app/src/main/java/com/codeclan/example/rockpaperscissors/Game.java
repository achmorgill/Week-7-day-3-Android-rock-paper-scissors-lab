package com.codeclan.example.rockpaperscissors;

import java.util.HashMap;
import java.util.Random;

/**
 * Created by user on 24/05/2017.
 */

public class Game {

    private String player1;
    private String player2;
    private String results;
    private HashMap<String, String> resultHash;
    private int score;

    public Game() {
        this.score = 0;
        this.resultHash = new HashMap<>();

        this.resultHash.put("rock", "scissors");
        this.resultHash.put("scissors", "paper");
        this.resultHash.put("paper", "rock");
    }

    public String getResults() {
        if (this.player1 == this.player2) {
            return "It's a draw!";
        } else {
            if (this.player2 == this.resultHash.get(this.player1)) {
                this.score++;
                return "Yay! You won!";
            } else {
                return "You lost! Computer won with  " + this.player2;

            }
        }
    }

    public String getRandomResultForPlayer2() {
        String[] player2Answers = {"rock","scissors","paper"};
        Random random = new Random();
        int index = random.nextInt(player2Answers.length);
        return player2Answers[index];
    }

    public void setChoice(String choice){
        this.player1 = choice;
    }

    public void setComputer(String choice){
        this.player2 = choice;
    }

    public Integer getScore() {
        return this.score;
    }
}

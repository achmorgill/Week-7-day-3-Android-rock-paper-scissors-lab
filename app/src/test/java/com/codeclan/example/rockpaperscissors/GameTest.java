package com.codeclan.example.rockpaperscissors;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 24/05/2017.
 */
public class GameTest {
    @Test
    public void canGiveResults(){
      Game game1 = new Game();
        game1.setChoice("rock");
        game1.setComputer("scissors");

      String results = game1.getResults();
        assertEquals("Yay! You won!", results);
    }

    @Test
    public void canGiveCorrectResults() {
        Game game1 = new Game();
        game1.setChoice("rock");
        game1.setComputer("rock");

        String results = game1.getResults();
        assertNotNull("It's a draw!", results);

    }


    @Test
    public void canGetRandomResultforPlayer2() {
        Game game1 = new Game();
        game1.setChoice("rock");
        game1.setComputer(game1.getRandomResultForPlayer2());
        assertNotNull(game1.getResults());
    }

    @Test
    public void canGetScore(){
        Game game1 = new Game();
        game1.setChoice("rock");
        game1.setComputer(game1.getRandomResultForPlayer2());
        Integer i = new Integer(0);
        assertEquals(i, game1.getScore());
    }

    @Test
    public void canInrementScore(){
        Game game1 = new Game();
        game1.setChoice("rock");
        game1.setComputer("scissors");
        game1.getResults();
        Integer i = new Integer(1);
        assertEquals(i, game1.getScore());
    }

}


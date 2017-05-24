package com.codeclan.example.rockpaperscissors;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 24/05/2017.
 */
public class GameTest {
    @Test
    public void canGiveResults(){
      Game game1 = new Game("rock");

      String results = game1.getResults();
        assertNotNull(results);
    }

    @Test
    public void canGiveCorrectResults() {
        Game game1 = new Game("rock");

        String results = game1.getResults();
        assertNotNull(results);

    }

    @Test
    public void canGiveDrawResult() {
        Game game1 = new Game("rock");
        String results = game1.getResults();
        assertNotNull(results);
    }

    @Test
    public void canGetRandomResultforPlayer2() {
        Game game1 = new Game("rock");
        String results = game1.getRandomResultForPlayer2();
        assertNotNull(results);
    }

}


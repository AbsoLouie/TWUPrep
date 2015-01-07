package main.Chapter6;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.*;
import static org.junit.Assert.assertEquals;

public class GuessingGameTest {
    @Test
    public void testCorrectGuess() {
        GuessingGame game = new GuessingGame(10);
        assertEquals("correct", game.guess(10));
    }

    @Test
    public void testLowGuess() {
        GuessingGame game = new GuessingGame(10);
        assertEquals("too low", game.guess(1));
    }

    @Test
    public void testHighGuess() {
        GuessingGame game = new GuessingGame(10);
        assertEquals("too high", game.guess(11));
    }

    @Test
    public void testGuessArrayRetrieval() {
        GuessingGame game = new GuessingGame(10);
        game.guess(1);
        game.guess(2);
        ArrayList<Integer> guessList = new ArrayList<Integer>(asList(1, 2));
        assertEquals( guessList, game.getGuesses());
    }
}
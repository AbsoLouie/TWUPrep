package main.Chapter5;

import org.junit.Test;

import static org.junit.Assert.*;

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
}
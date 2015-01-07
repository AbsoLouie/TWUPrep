package main.Chapter6;

import java.util.ArrayList;

public class GuessingGame {
    private final int targetNumber;
    private ArrayList<Integer> guesses = new ArrayList<Integer>();

    public GuessingGame(int targetNumber) {
        this.targetNumber = targetNumber;
    }

    public String guess(int numberGuessed) {
        guesses.add(numberGuessed);
        return evaluateGuess(numberGuessed);
    }

    private String evaluateGuess(int numberGuessed) {
        String result = null;
        if (numberGuessed == targetNumber){
            result = "correct";
        } else if (numberGuessed < targetNumber) {
            result = "too low";
        } else if (numberGuessed > targetNumber) {
            result = "too high";
        }
        return result;
    }

    public ArrayList<Integer> getGuesses() {
        return guesses;
    }
}

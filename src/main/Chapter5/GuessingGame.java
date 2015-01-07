package main.Chapter5;

public class GuessingGame {
    private final int targetNumber;

    public GuessingGame(int targetNumber) {
        this.targetNumber = targetNumber;
    }

    public String guess(int numberGuessed) {
        String result = null;
        if (targetNumber == numberGuessed ){
            result = "correct";
        } else if (numberGuessed < targetNumber) {
            result = "too low";
        } else if (numberGuessed > targetNumber) {
            result = "too high";
        }
        return result;
    }
}

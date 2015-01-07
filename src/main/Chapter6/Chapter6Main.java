package main.Chapter6;

import java.util.Random;
import java.util.Scanner;

public class Chapter6Main {
    public static void main(String [] args) {
        int targetNumber = new Random().nextInt(100) + 1;
        GuessingGame game = new GuessingGame(targetNumber);
        System.out.println("Let's Play A Game!");
        System.out.print("Guess a number between 1 and 100: ");

        Scanner input = new Scanner(System.in);
        int numberGuessed;
        String result = "Wrong";

        while (!result.equals("correct")) {
            numberGuessed = input.nextInt();
            result = game.guess(numberGuessed);
            System.out.print("Your guess was " + result + ": ");
        }

        System.out.println("Congratulations!");
        System.out.println("Here are the guesses you made:");
        for (Integer guess : game.getGuesses()) System.out.println(guess);

    }
}

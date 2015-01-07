package main.Chapter5;

import java.util.Random;
import java.util.Scanner;

public class Chapter5Main {
    public static void main(String [] args) {
        int targetNumber = new Random().nextInt(100) + 1;
        GuessingGame game = new GuessingGame(targetNumber);
        System.out.println("Let's Play A Game!");
        System.out.print("Guess a number between 1 and 100: ");

        Scanner input = new Scanner(System.in);
        int numberGuessed = 0;

        while (!game.guess(numberGuessed).equals("correct")) {
            numberGuessed = input.nextInt();
            System.out.print("Your guess was " + game.guess(numberGuessed) + ": ");
        }

        System.out.println("Congratulations!");

    }
}

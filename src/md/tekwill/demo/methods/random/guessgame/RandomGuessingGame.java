package md.tekwill.demo.methods.random.guessgame;

import java.util.Random;
import java.util.Scanner;

class RandomGuessingGame {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int numberToGuess = r.nextInt(99);
        int numberFromUser = -1;
        int numberOfTries = 10;
        System.out.println("Computer made his choice! [?]");
        do {
            System.out.println("Enter your guess (0 - 99) > ");
            numberFromUser = s.nextInt();
            if (numberFromUser > numberToGuess)
                System.out.println("Too high!");
            else if (numberFromUser < numberToGuess)
                System.out.println("Too low!");
            numberOfTries--;
            if (numberOfTries <= 0)
                break;
        } while (numberToGuess != numberFromUser);
        if (numberToGuess == numberFromUser)
            System.out.println("Hooray, you got it! [" + numberToGuess + "]");
        else
            System.out.println("Ooops, you did not get it... Better luck next time :( [?]");

    }
}

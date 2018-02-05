
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int guesscount = 0;

        while (true) {
            // program your solution here. Do not touch the above lines!
            System.out.println("Guess a number: ");
            int input = Integer.parseInt(reader.nextLine());
            guesscount++;
            if (input < numberDrawn) {
                System.out.println("The number is greater, guesses made: "+ guesscount);
            } else if (input > numberDrawn) {
                System.out.println("The number is lesser, guesses made: "+ guesscount);
            } else {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}

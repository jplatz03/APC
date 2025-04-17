package Aufgab_1;
import java.util.Scanner;
public class Guessthenumber {
    public static void main(String[] args) {
        int numberToGuess = (int) (Math.random() * 20) + 1;
        int guess;
        boolean result = false;
        Scanner scanner = new Scanner(System.in);
        //Variables that manage the game`state

        for (int i = 0; i < 5; i++) {
            guess = scanner.nextInt();
            if (guess == numberToGuess) {
                i = 5;
                result = true;
            } else if (guess < numberToGuess) {
                System.out.println("too low");
            } else if (guess > numberToGuess) {
                System.out.println("too high");
            }
        }
        if (result) {
            System.out.println("right");
        } else {
            System.out.println(("false"));
        }
    }
}

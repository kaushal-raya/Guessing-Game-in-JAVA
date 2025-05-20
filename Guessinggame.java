import java.util.Random;
import java.util.Scanner;

public class Guessinggame {
    public static void main(String[] args) {
        Guessinggame gg = new Guessinggame();
        gg.play();
    }

    public void play() {
        Random random = new Random();
        int target = random.nextInt(100) + 1; // 1 to 100 inclusive
        Scanner scan = new Scanner(System.in);
        int guessCount = 0;

        while (true) {
            System.out.println("Guess the number between 1 to 100 ");
            int guess = scan.nextInt();
            guessCount++;

            if (guess == target) {
                System.out.println("Congrats you have guessed the number correctly");
                System.out.println("It took you " + guessCount + " guesses.");
                break;
            }
            if (guess > target) {
                System.out.println("Guessed number is greater");
            }
            if (guess < target) {
                System.out.println("Your guess is lower than our target");
            }
            System.out.println("Please try again");
        }
        System.out.println("Thank you for playing the game");
        scan.close();
    }
} 
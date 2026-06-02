import java.util.Random;
import java.util.Scanner;
public class Numguess {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = rand.nextInt(min, max + 1);

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d\n", min, max);

        do {
            System.out.print("Enter a number : ");
            guess = sc.nextInt();
            attempts++;
            if(guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if(guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }

        } while (guess != randomNumber);

        sc.close();
    }
}
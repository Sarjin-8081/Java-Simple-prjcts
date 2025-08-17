import java.util.Random;
import java.util.Scanner;
public class GuessGame {
    public static void main(String[] args) {
        
        // number guessing game 

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts=0;
        int min= 1;
        int max= 100;
        int randomNumber= random.nextInt(min,max +1);

        System.out.println("Number Guessing Gamne");
        System.out.printf("Guess a number between %d-%d\n", min, max );

        do { 
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess<randomNumber) {
                System.out.println("too low, try again");
            }
            else if(guess>randomNumber){
                System.out.println("too high, guess again");
            }
            else{
                System.out.println("correct! the number was "+randomNumber);
                System.out.println("number of attempts "+attempts);
            }

        } while (guess != randomNumber);
        scanner.close();
    }
}


import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {

        // JAVA QUIZZ GAME

         String[] questions = {  "What is the capital of France?",
                            "Which planet is known as the Red Planet?",
                            "What is the chemical symbol for water?",
                            "Who wrote Romeo and Juliet?",
                            "What is the largest mammal in the world?"  };

    
        String[][] options = {  {"1) Berlin", "2) Madrid", "3) Paris", "4) Rome"},
                                {"1) Earth", "2) Mars", "3) Venus", "4) Jupiter"},
                                {"1) O2", "2) H2O", "3) CO2", "4) HO"},
                                {"1) William Shakespeare", "2) Mark Twain", "3) Charles Dickens", "4) Jane Austen"},
                                {"1) Elephant", "2) Blue Whale", "3) Giraffe", "4) Hippopotamus"}};

        int[] answers = {3, 2, 2, 1, 2};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);    

        System.out.println("*************************");
        System.out.println("Welcome to the Quiz Game!");
        System.out.println("*************************");

        for(int i =0;i<questions.length;i++){
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
                
            }
            System.out.print("Enter your guess: ");    
            guess=scanner.nextInt();

            if(guess == answers[i]){
                System.out.println("********");
                System.out.println("CORRECT!");
                System.out.println("********");
                score++;
            }
            else{
                System.out.println("******");
                System.out.println("WRONG!");
                System.out.println("******");
                
            }
        }

        System.out.println("Youre final score is: " + score + " out of " + questions.length);
        scanner.close();

    }

   

}

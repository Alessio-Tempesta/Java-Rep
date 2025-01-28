package Array;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {" rock ", " paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        System.out.print("Enter your move (Rock, paper, scissors)");
        playerChoice = scanner.nextLine().toLowerCase();

        if(!playerChoice.equals("rock") &&
                  !playerChoice.equals("paper") &&
                  !playerChoice.equals("scissors")){
            System.out.println("Invalid choice");
        }

        scanner.close();
    }
}

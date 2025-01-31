package Array;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {

//        Java Slot Machine

        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        System.out.println("**************************");
        System.out.println("  Welcome to Java Slots   ");
        System.out.println("Symbols : 🍒 🍉 🍋 🔔 ⭐ ");
        System.out.println("**************************");

        while (balance > 0){
            System.out.println("Current Balance : €" +balance);
            System.out.println("Place your bet amount: ");
            bet = scanner.nextInt();

            if (bet > balance){
                System.out.println("Insufficent Funds ");
                continue;
            }
            else if (bet <= 0) {
                System.out.println("Bet Must be grater Than 0 ");
            }
            else {
                balance -= bet;
                System.out.println("€" + balance);
            }
        }


        // Declare Variables
        // Display Welcome Message
        // Paly if Balance > 0
        // Enter Bet Amount
    //  Verify If Bet > Balance
    //  Verify If Bet > 0
    //  Substarct Bet From Balance
    //  Spin Row
    //  Print Row
    //  get payOut
    //  Ask >To play Again
    //  Display Exit Message
    }
}

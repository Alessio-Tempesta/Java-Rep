package Array;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {

//        Java Slot Machine

        Scanner scanner = new Scanner(System.in);
        // Declare Variables
        int balance = 100;
        int bet;
        int payout;
        String[] row;

        // Display Welcome Message
        System.out.println("**************************");
        System.out.println("  Welcome to Java Slots   ");
        System.out.println("Symbols : 🍒 🍉 🍋 🔔 ⭐ ");
        System.out.println("**************************");

        // Pay if Balance > 0
        // Enter Bet Amount
        while (balance > 0){
            System.out.println("Current Balance : €" +balance);
            System.out.println("Place your bet amount: ");
            bet = scanner.nextInt();


            if (bet > balance){
                System.out.println("Insufficent Funds ");
                continue;
            }

            //Verify If Bet > Balance
            //  Verify If Bet > 0
            else if (bet <= 0) {
                System.out.println("Bet Must be grater Than 0 ");
                //  Substarct Bet From Balance
            }
            else {
                balance -= bet;
                System.out.println("€" + balance);
            }
        }

        //  Spin Row
        System.out.println("Spinning...");
        spinRow();




    //  Print Row
    //  get payOut
    //  Ask >To play Again
    //  Display Exit Message
    }
    static String[] spinRow(){

        String[] symbols = {"🍒" ,"🍉" ,"🍋", "🔔", "⭐ "};
        String[] row = new String[3];

        return new String[0];
    }
}

package Array;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {

//        Java Slot Machine

        Scanner scanner = new Scanner(System.in);
        // Declare Variables
        int balance = 100;
        int bet = 0;
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
        row =spinRow();
        printRow(row);
        payout = getPayout(row, bet);

        if(payout > 0){
            System.out.println("You Won $" + payout);
            balance += payout;
        }
        else {
            System.out.println("Sorry you lost this round");
        }




    //  Print Row
    //  get payOut
    //  Ask >To play Again
    //  Display Exit Message
        scanner.close();
    }
    static String[] spinRow(){

        String[] symbols = {"🍒" ,"🍉" ,"🍋", "🔔", "⭐ "};
        String[] row = new String[3];
        Random random = new Random();

        System.out.println(symbols[random.nextInt(symbols.length)]);

        for (int i = 0; i < 3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }
    static void printRow(String[] row){
        System.out.println("***************");
        System.out.println(" " + String.join("  |  " , row));
        System.out.println("***************");
    }
    static int getPayout(String[] row, int bet){

        if (row[0].equals(row[1]) && row[1].equals(row[2]) ){
            return switch (row[0]){
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;
            };
        }
        else if (row[0].equals(row[1])){
            return switch (row[0]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        else if (row[1].equals(row[2])){
            return switch (row[1]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }


        return 0;
    }
}

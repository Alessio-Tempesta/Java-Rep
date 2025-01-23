package Methods;

import java.util.Scanner;

public class BankingProgram {
    public static void main(String[] args) {
        // Banking program:

        Scanner scanner = new Scanner(System.in);
        double balance;
        boolean isRunning = true;
        int choice;

        while (isRunning){
            System.out.println("*****************");
            System.out.println("BANKING PROGRAM");
            System.out.println("*****************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. EXIT");
            System.out.println("*****************");

            System.out.println("Enter your Choice ( 1-4 ): ");
            choice = scanner.nextInt();

            switch (choice){
                case 1 -> System.out.println(" SHOW BALANCE ");
                case 2 -> System.out.println(" DEPOSIT ");
                case 3 -> System.out.println(" WITHDRAW ");
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }


//        Declare Varibales
//        Get and Process user choice
//        showBalance()
//        Deposit()
//        withdraw()
//        EXIT MESSAGE

        scanner.close();
    }

    static void showBalance(double balance){
        System.out.println();
    }
}

package JavaBasisc;
import java.util.Scanner;

// How to create a shoppping cart
public class ShoppingCart {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy ?");
        item = scanner.nextLine();

        System.out.print("What is the price for each?");
        price = scanner.nextDouble();

        System.out.print("What is quantity for each?");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nYou Have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);

        scanner.close();

    }
}

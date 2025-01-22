package JavaBasisc;
import java.util.Locale;
import java.util.Scanner;


public class WhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String response ="";

        while(!response.equals("Q")){
            System.out.println("You are a playing a game");
            System.out.print("Press Q to quit");
            response = scanner.next().toUpperCase();
        }
        System.out.println("You have quit the game ");

        scanner.close();

//        while (name.isEmpty()){
//            System.out.print(" Enter Your name ");
//            name = scanner.nextLine();
//    }
//        System.out.println(" Hello " + name);


    }
}

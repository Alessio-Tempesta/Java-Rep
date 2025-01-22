package JavaBasisc;
import java.util.Locale;
import java.util.Scanner;


public class WhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = 0;
        do {
            System.out.println("Your age can't be negative");
            System.out.print("enter your age: ");
            age = scanner.nextInt();
        }while (age < 0);
         System.out.println("You are " + age + "years old");

        scanner.close();

//        String response ="";
//
//        while(!response.equals("Q")){
//            System.out.println("You are a playing a game");
//            System.out.print("Press Q to quit");
//            response = scanner.next().toUpperCase();
//        }
//        System.out.println("You have quit the game ");


//        while (name.isEmpty()){
//            System.out.print(" Enter Your name ");
//            name = scanner.nextLine();
//    }
//        System.out.println(" Hello " + name);


    }
}

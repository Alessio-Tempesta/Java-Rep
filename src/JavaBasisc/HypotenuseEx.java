package JavaBasisc;
import java.util.Scanner;

public class HypotenuseEx {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("Enter the lenght of side a ");
        a = scanner.nextDouble();
        System.out.println("Enter the lenght of side b ");
        b = scanner.nextDouble();
        c = Math.sqrt(Math.pow(a, 2)+ Math.pow(b, 2));
        System.out.println("hypotenuse is (Side C ) : " + c);


        scanner.close();
    }
}

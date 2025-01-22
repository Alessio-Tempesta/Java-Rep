package JavaBasisc;
import java.awt.desktop.SystemEventListener;
import java.util.Scanner;


public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name ="";

        while (name.isEmpty()){
            System.out.print(" Enter Your name ");
            name = scanner.nextLine();
    }
        System.out.println(" Hello " + name);

        scanner.close();
    }
}

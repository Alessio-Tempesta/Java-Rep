package JavaBasisc;
import java.util.Scanner;

public class CalculateAreaOfTheCircle {
    public static void main(String[] args) {

//        circumference = 2 * Math.PI * radius;
//        area = Math.PI * Math.pow(radius, 2);
//        volume = (4.0 / 3.0 ) * Math.PI * Math.pow(radius, 3)

        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("The circunfernce is : " + circumference + "CM ");
        System.out.println("The Area is :" + area + "CM 2");
        System.out.println("The volume is :" + volume + "CM 3" );

        scanner.close();
    }

}

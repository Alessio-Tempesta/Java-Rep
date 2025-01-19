package JavaBasisc;
import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {

        Random random = new Random();

        int number1;
        int number2;
        int number3;

        number1 = random.nextInt(1 , 99);
        System.out.println(number1);
        number2 = random.nextInt(100 , 199);
        System.out.println(number2);
        number3 = random.nextInt(200 , 299);
        System.out.println(number3);

    }
}

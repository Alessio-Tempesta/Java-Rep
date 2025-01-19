package JavaBasisc;
import java.util.Scanner;

// How to create a IF Statment -> block of code if its conditions is true
public class IfStateExcercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean IsStudent;


        System.out.print("Enter your name : ");
        name = scanner.nextLine();

        System.out.print("Enter your age");
        age = scanner.nextInt();

        System.out.print("You are a student? (True or False) : ");
        IsStudent = scanner.nextBoolean();

//        condition enter your name
        if (name.isEmpty()) {
            System.out.println("You didn't enter your name");
        } else {
            System.out.println("Hello" + name + "!");
        }

//condition enter your age
        if (age >= 18) {
            System.out.println("You are an adult");
        } else if (age >= 65) {
            System.out.println("You are a senior!");
        } else if (age < 0) {
            System.out.println("You haven't been born yet");
        } else if (age == 0) {
            System.out.println("You are a baby");
        } else {
            System.out.println("You are a child ");
        }
//            condition IsStudent true or false

            if (IsStudent) {
                System.out.println("You are a Student");
            } else {
                System.out.println("You are Not a student");
            }
            scanner.close();
    }
}
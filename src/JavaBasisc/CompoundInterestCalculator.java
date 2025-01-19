package JavaBasisc;
import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {

//        Coumpound intererest calculator

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("enter the principal amount: " );
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %) : ");
        rate = scanner.nextDouble() /100;

        System.out.print("Enter the # of times compounded per year ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the # years :" );
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);
        System.out.println("The amount after -> :  " + years + " is: € "  + amount );


        scanner.close();
    }
}

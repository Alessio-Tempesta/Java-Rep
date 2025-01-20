package JavaBasisc;

import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {

// Convertitore di Peso -> Weight Program

        Scanner scanner = new Scanner(System.in);

        String nameUser;
        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program ");
        System.out.println("Option 1 : Convert lbs to kgs ");
        System.out.println("Option 2 : Convert kgs to lbs ");

        System.out.println("Choose on Option ->");
        choice = scanner.nextInt();

        if (choice == 1){
            System.out.print("Enter Your Weight in lbs ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is : %.2f ", +newWeight);
        }
        else if (choice == 2) {
            System.out.print("Enter the weight in Kgs");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is : %.2f ", +newWeight);
        }else {
            System.out.println("Choice is not Valid ");
        }

        scanner.close();


//        Declare variables
//        welcome message
//        prompt for user choice
//        option 1 convert lbs to kgs
//        option 2 convert kgs to lbs
//        else print not a valid choice


    }
}

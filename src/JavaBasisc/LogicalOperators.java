package JavaBasisc;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        //&& (AND):
        //Questo operatore verifica se entrambe le condizioni su entrambi i lati sono vere.
        // Se entrambe sono vere, l'intera condizione risulta vera.
        // Altrimenti, risulta falsa.

        // || (OR):
        // Questo operatore verifica se almeno una delle condizioni su entrambi i lati è vera.
        // Se una o entrambe sono vere, l'intera condizione risulta vera.
        // Risulta falsa solo se entrambe le condizioni sono false.

        // ! (NOT):
        // Questo operatore inverte il valore booleano della condizione che lo precede.
        // Se la condizione è vera, ! la rende falsa.
        // Se la condizione è falsa, ! la rende vera.

//
//        double temp = 0;
//        boolean isSunny = false;
//
//        if(temp <= 30 && temp >= 0 && isSunny){
//            System.out.println("The weather is GOOD");
//            System.out.println("It is SUNNY outside");
//        }
//        else if (temp >= 30 && temp >= 0 && !isSunny) {
//            System.out.println("The weather is GOOD");
//            System.out.println("It is CLOUDY outside");
//        } else if (temp > 30 || temp < 0 ) {
//            System.out.println("The weather is bad");
//        }


        Scanner scanner = new Scanner(System.in);

//        username must be between- characters
//        username must not contain spaces or underscores

        String username;

        System.out.print("Enter your new username");
        username = scanner.nextLine();

        if (username.length() < 4 || username.length() > 12){
            System.out.println("Username must be between 4-12 characters");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.print("Username must not contain spaces or _ underscore");
        }
        else {
            System.out.println("Welcome "+ username);
        }
        scanner.close();
    }
}

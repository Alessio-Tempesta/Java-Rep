package JavaBasisc;

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

        double temp = 0;
        boolean isSunny = false;

        if(temp <= 30 && temp >= 0 && isSunny){
            System.out.println("The weather is GOOD");
            System.out.println("It is SUNNY outside");
        }
        else if (temp >= 30 && temp >= 0 && !isSunny) {
            System.out.println("The weather is GOOD");
            System.out.println("It is CLOUDY outside");
        } else if (temp > 30 || temp < 0 ) {
            System.out.println("The weather is bad");
        }
    }
}

package JavaBasisc;
import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {

//        Cosa è lo switch enhanced?
//
//È un costrutto che permette di eseguire diverse azioni in base al valore di un'espressione,
// in modo simile al tradizionale switch, ma con una sintassi più moderna e flessibile.
//        Quali sono i miglioramenti principali?
//
//Tipo inferenza: Il tipo dell'espressione switch viene inferito automaticamente, eliminando la necessità di specificarlo manualmente.
//Nessun break necessario: Non è più obbligatorio utilizzare l'istruzione break alla fine di ogni caso, semplificando la lettura del codice.
//Arrow expressions: È possibile utilizzare le arrow expressions per assegnare direttamente il risultato di un'espressione a una variabile.
//Supporto per stringhe e pattern matching: Lo switch enhanced supporta direttamente le stringhe e il pattern matching,
// consentendo confronti più complessi e flessibili.
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter the day of the week ");
        String day = scanner.nextLine();

        switch (day){
            case "Monday", "Tuesday", "Wednesday","Thursday","Friday" ->
                    System.out.println("It is a weekday ");
            case "Saturday", "Sunday" ->
                    System.out.println("It is the weekend ");
            default -> System.out.println(day +  " is not a day ");
        }
    }
}

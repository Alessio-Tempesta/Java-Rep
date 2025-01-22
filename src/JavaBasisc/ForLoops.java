package JavaBasisc;

import java.util.Scanner;
import java.util.concurrent.ThreadPoolExecutor; // --> Thread.sleep(): Questo è un metodo statico della classe Thread in Java.
// "Statico" significa che puoi chiamarlo direttamente dalla classe senza dover creare un'istanza di un oggetto Thread.
//1000: Questo valore numerico rappresenta il tempo di pausa in millisecondi.

//       Puoi specificare qualsiasi valore intero positivo per definire la durata della pausa.

public class ForLoops {
    public static void main(String[] args) throws InterruptedException {
//        Il ciclo for è uno strumento fondamentale in Java che ci permette di eseguire ripetutamente
//        un blocco di codice un numero specificato di volte.
//        È particolarmente utile quando sappiamo in anticipo quante iterazioni vogliamo effettuare.
//

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many secodns to countDown from ?:  " );
        int start = scanner.nextInt();

        for (int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println(" HAPPY NEW YEAR ");

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter how many times you wnat to loop ");
//        int max = scanner.nextInt();
//
//        for (int i =0; i <= max; i-- ){
//            System.out.println(i);
//        }

    }
}

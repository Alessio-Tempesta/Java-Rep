package JavaBasisc;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
//        Il ciclo for è uno strumento fondamentale in Java che ci permette di eseguire ripetutamente
//        un blocco di codice un numero specificato di volte.
//        È particolarmente utile quando sappiamo in anticipo quante iterazioni vogliamo effettuare.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how many times you wnat to loop ");
        int max = scanner.nextInt();

        for (int i =0; i <= max; i++ ){
            System.out.println(i);
        }

    }
}

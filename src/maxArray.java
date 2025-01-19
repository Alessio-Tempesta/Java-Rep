//Scrivi un programma che trova il numero massimo in un array di interi fornito dall'utente.
//
//Requisiti:
//Usa un ciclo per iterare sugli elementi dell'array.
//Gestisci array di lunghezza variabile.
import java.util.Scanner;
public class maxArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("quanti numeri vuoi inserire");
        int n = scanner.nextInt();

        int[] numeri = new int[n];
        System.out.println("Inserisci i numeri");
        for (int i = 0; i < n; i++){
            numeri[i] = scanner.nextInt();
        }

        int massimo = numeri[0];
        for (int numero : numeri){
            if (numero > massimo){
                massimo = numero;
            }
        }
        System.out.println("il numero massimo è "+massimo);
    }

}

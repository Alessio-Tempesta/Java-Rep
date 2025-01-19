//1. Calcolatrice (Livello Base)
//Scrivi un programma Java che chiede all'utente due numeri e un'operazione matematica (+, -, *, /).
// Esegui l'operazione e stampa il risultato.
//Requisiti:
//Usa uno scanner per leggere input dall'utente.
//Gestisci la divisione per zero.

import java.util.Scanner;
public class calcolatriceClass {
    public static void main(String[] args) {
    Scanner scanner = (new Scanner(System.in));

        System.out.print("Inserisci il primo numero");
        double a = scanner.nextDouble();

        System.out.print("Inserisci il secondo numero:");
        double b = scanner.nextDouble();

        System.out.print("Inserisci l'operazione aritmetica (+, -, *, /) :");
        char operazione = scanner.next().charAt(0);
        double risultato;

        if (operazione == '+'){
            risultato = a + b;
            System.out.println("Risultato :" + risultato);
        } else if (operazione == '-') {
            risultato = a - b;
            System.out.println("Risultato :" + risultato);
        } else if (operazione == '*') {
            risultato = a * b;
            System.out.println("Risultato :" + risultato);
        } else if (operazione =='/') {
            risultato = a / b;
            System.out.println("risulato : "+ risultato);
        } else{
            System.out.println("Questi sono i risultati");
        }
        scanner.close();

        }
}

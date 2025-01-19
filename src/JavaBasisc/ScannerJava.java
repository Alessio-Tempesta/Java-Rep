package JavaBasisc;
import  java.util.Scanner;
//import java.util.Locale;

//La classe Scanner in Java è uno strumento molto utile per leggere dati in ingresso da diverse fonti,
// come la tastiera, file di testo, o altre stringhe. In pratica, permette al tuo programma di "ascoltare" l'utente o un altro input
// e di interpretare i dati inseriti in vari formati (numeri interi, numeri decimali, stringhe, ecc.).

//Lettura dei dati: Utilizzi i metodi dell'oggetto Scanner per leggere i dati:
//nextInt(): Leggi un numero intero
//nextDouble(): Leggi un numero decimale
//nextLine(): Leggi una riga di testo

public class ScannerJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        scanner.useLocale(Locale.US);

        System.out.print(">Enter your Name: ");
        String name = scanner.nextLine();

        System.out.print("Inserisci la tua eta: ");
        int age = scanner.nextInt();

        System.out.print("Quale il tuo gpa: ");
        double gpa = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Hello " + name );
        System.out.println("la tua età è  " + age );
        System.out.println("il tuo gpa is : " + gpa);

        scanner.close();
    }
}

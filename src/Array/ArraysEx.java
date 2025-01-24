package Array;
import java.util.Arrays;

public class ArraysEx {
    public static void main(String[] args) {

//  Cosa sono gli array in Java?
//  Un array in Java è come un contenitore ordinato che può ospitare una collezione di elementi dello stesso tipo.
//  Immagina un cassetto dove puoi riporre solo penne,
//  oppure un scaffale dove puoi sistemare solo libri: ogni posizione nel cassetto o sullo scaffale corrisponde a un elemento dell'array.
//  Caratteristiche principali degli array:
//  Tipo di dato: Tutti gli elementi di un array devono essere dello stesso tipo (es. int, double, String).
//  Indice: Ogni elemento è identificato da un indice numerico, che inizia da 0.
//  Dimensione fissa: La dimensione di un array viene definita al momento della creazione e non può essere modificata successivamente.

//                             Perché usare gli array?
//Organizzare dati: Gli array sono utili per raggruppare dati correlati,
//come ad esempio una lista di nomi, un insieme di numeri, o le coordinate di un punto nello spazio.
//Efficienza:
//L'accesso agli elementi di un array è molto efficiente,
//in quanto l'indice permette di individuare rapidamente l'elemento desiderato.
//Esempio di codice commentato in IntelliJ:


        String[] fruits = {"Apple" ,"orange", "banana", "coconut"};

//        Arrays.sort(fruits);
         Arrays.fill(fruits, "Pineapple");

        for(String fruit : fruits){
            System.out.println(fruit);
        }

    }
}

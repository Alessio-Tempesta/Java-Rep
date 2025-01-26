package Array;

public class VarArgs {
    public static void main(String[] args) {

//        Cosa sono i VarArgs?
//I VarArgs (abbreviazione di Variable-Length Arguments) sono una funzionalità di Java
// che ti permette di passare un numero variabile di argomenti a un metodo.
// In pratica, invece di dover definire un numero fisso di parametri, puoi passare zero, uno o più valori dello stesso tipo.
//Sintassi: Tipo... nomeVariabile
//
//Tipo: Il tipo degli argomenti (es. int, String, ecc.).
//
//...: Indica che il metodo accetta un numero variabile di argomenti.
//
//nomeVariabile: Il nome della variabile che rappresenta l'array di argomenti.

        System.out.println(average(1, 2 , 3, 4,5,6,7 ));
    }
    static double average(double... numbers){

        double sum = 0;

        for (double number : numbers){
            sum += number;
        }
        return sum / numbers.length;
    }
}
//        System.out.println(add(1,2,3,4,5,6));

//    static int add(int... numbers){
//
//        int sum = 0;
//
//        for(int number : numbers){
//            sum += number;
//        }
//
//        return sum;
//    }


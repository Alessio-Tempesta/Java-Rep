//I Metodi in Java:
//Cosa sono i metodi?
//Immagina i metodi come delle piccole funzioni all'interno del tuo programma Java.
// Ognuno di essi ha un compito specifico e può essere richiamato più volte nel codice.
// Pensali come delle "ricette" che ti dicono come eseguire una determinata operazione.
//Perché usare i metodi?
//Organizzazione del codice: Dividendo il codice in metodi più piccoli, lo rendi più leggibile e facile da mantenere.
//Riutilizzabilità: Un metodo può essere chiamato da diverse parti del tuo programma,
//evitando di riscrivere lo stesso codice più volte.
//Modularità: Ogni metodo si concentra su un singolo compito, rendendo il codice più modulare e facile da testare.

package Methods;

public class Methods {
    public static void main(String[] args) {

        System.out.println(square(3));
        System.out.println(cube(3));
        String fullName = getFullName("Alessio", "Tempesta");
        System.out.println(fullName);

        int age = 17;
        if(ageCheck(age)){
            System.out.println("You may sign up!");
        }
        else {
            System.out.println("You must be 18+ to sign up ");
        }


    }
    static void happyBirthday(String name, int age){

    }
    static double square(double number){
        return number * number;
    }
    static double cube(double num){
        return num * num * num;
    }
    static String getFullName(String first, String last){
        return first + " " + last;
    }
    static boolean ageCheck(int age){
        if (age >= 18){
            return true;
        }
        else {
            return false;
        }
    }

}
//        Method => sono dei blocchi di codice che possono essere eseguti e riutilizzati tramite delle chiamate => ()

//        String name = "Lexoooo";
//        int age = 25;
//        happyBirthday(name, age);

//    }
//    static void happyBirthday(String name, int age){
//System.out.println("Happy birthday to you!");
//        System.out.printf("Happy birthday dear %s!", name);
//        System.out.printf("You are %d years old!! \n", age);
//        System.out.println("Happy birthday to you!\n");
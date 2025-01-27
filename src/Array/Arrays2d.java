package Array;

public class Arrays2d {
    public static void main(String[] args) {

//        Cosa sono gli Array 2D?
//Un array bidimensionale (2D) è una struttura dati che rappresenta una "tabella" o una "matrice" con righe e colonne.
// In Java, un array 2D è essenzialmente un array di array.
//Sintassi: Tipo[][] nomeArray = new Tipo[righe][colonne];
//Tipo: Il tipo di dati degli elementi (es. int, String, ecc.).
//righe: Numero di righe.
//colonne: Numero di colonne.


        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"chicken","pork", "beef", "fish"};

        String[][] groceries = {{"apple", "orange", "banana"},
                                {"potato", "onion", "carrot"},
                                {"chicken","pork", "beef", "fish"}};

        for (String [] foods : groceries){
            for (String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}

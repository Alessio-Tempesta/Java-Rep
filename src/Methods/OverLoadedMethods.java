//Cosa sono i OverloadedMethods in Java?
//In Java, il sovraccarico dei metodi (o method overloading) è una caratteristica che consente di definire
// più metodi con lo stesso nome all'interno della stessa classe, a patto che abbiano firme diverse.
//La firma di un metodo è determinata dal suo nome e dalla lista dei parametri (tipo e ordine).

//Rende il codice più leggibile: Utilizzando lo stesso nome per operazioni simili ma con parametri diversi,
// si migliora la leggibilità del codice.
//Aumenta la flessibilità: Permette di creare metodi che possono essere chiamati con diversi tipi di argomenti,
//senza dover creare nomi di metodo diversi per ogni combinazione.
//Riduce la duplicazione del codice: Evita la ripetizione di codice simile con solo piccole variazioni nei parametri.

package Methods;


public class OverLoadedMethods {
    public static void main(String[] args) {

        String pizza = bakePizza("Flat bread", "Mozzarella", "peperoni");
        System.out.println(pizza);
    }
    static String bakePizza(String bread){
        return bread + " Pizza";
    }
    static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + " pizza";
    }
    static String bakePizza(String bread, String cheese, String topping){
        return topping + " " + cheese + " " + bread + " pizza";
    }
}

        // first Example :

//        System.out.println(add(1, 2));
//        System.out.println(add(1, 2, 3));
//        System.out.println(add(1, 2, 3, 4));



//    static double add(double a, double b) {
//        return a + b;
//    }
//
//    static double add(double a, double b, double c) {
//        return a + b + c;
//    }
//    static double add(double a, double b, double c, double d) {
//        return a + b + c + d;
//    }


package JavaBasisc;

public class TernaryOperator {
    public static void main(String[] args) {

        // operatore ternario ? = mi ritorna 1 su 2 valori nell' if se la condizione è true ->
        // È una sorta di "if-else" in una sola riga.
//       condizione ? -> espressione_se_vera : -> espressione_se_falsa
//      Come funziona: Condizione: Viene valutata come true o false.
//Espressione_se_vera: Se la condizione è true, viene eseguita questa espressione e il suo risultato diventa
// il valore dell'intera espressione ternaria.
//Espressione_se_falsa: Se la condizione è false, viene eseguita questa espressione e il suo risultato diventa
// il valore dell'intera espressione ternaria.

        int score = 50;

        String passOrFail = (score >= 60) ? "PASS" : "FAIL";

        System.out.println(passOrFail);

    }
}

package JavaBasisc;

public class StringMethods {
    public static void main(String[] args) {
        // Dichiariamo una stringa con degli spazi prima e dopo
        String name = " Password ";

        // ESEMPI DI METODI STRING COMMENTATI:

        // Ottiene la lunghezza della stringa (numero di caratteri)
        //int length = name.length();

        // Ottiene il carattere alla posizione specificata (0 = primo carattere)
        //char letter = name.charAt(0);

        // Trova la posizione della prima occorrenza dello spazio
        //int index = name.indexOf(" ");

        // Trova la posizione dell'ultima occorrenza della lettera "o"
        //int lastIndex = name.lastIndexOf("o");

        // Converte tutti i caratteri in maiuscolo
        //name = name.toUpperCase();

        // Converte tutti i caratteri in minuscolo
        //name = name.toLowerCase();

        // Rimuove gli spazi all'inizio e alla fine della stringa
        //name = name.trim();

        // Sostituisce tutte le occorrenze di "o" con "a"
        //name = name.replace("o", "a");

        // ESEMPI DI CONTROLLI SULLE STRINGHE:

        // Verifica se la stringa è vuota
        //if(name.isEmpty()){
        //    System.out.println("Your name is empty");
        //}
        //else {
        //    System.out.println("Hello" + name);
        //}

        // Verifica se la stringa contiene uno spazio
        //if (name.contains(" ")){
        //    System.out.println("Your name contains a space");
        //}
        //else {
        //    System.out.println("Your name doesen't contains any spaces");
        //}

        // Verifica se la stringa è uguale a "Password" ignorando maiuscole/minuscole
        if (name.equalsIgnoreCase("Password")){
            System.out.println("your name can't be password");
        }
        else{
            System.out.println("Hello " + name);
        }
    }
}
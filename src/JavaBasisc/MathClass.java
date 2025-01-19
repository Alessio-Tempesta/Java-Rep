package JavaBasisc;


public class MathClass {
    public static void main(String[] args) {

//        System.out.println(Math.PI);
//        System.out.println(Math.E);

        double result;
//        Il pow()metodo eleva un numero alla potenza di un altro numero.
        result = Math.pow(2, 3);
//        Il abs()metodo restituisce il valore assoluto (positivo) di un numero.
        result = Math.abs(-5);

//     Il sqrt()metodo restituisce la radice quadrata di un numero.
        result = Math.sqrt(9);

//        Il round()metodo arrotonda un numero all'intero più vicino.
        result = Math.round(3.14);

//        Il ceil()metodo arrotonda un numero per eccesso al numero intero più vicino.
        result = Math.ceil(3.14);

//        Il max()metodo restituisce il numero con il valore più alto tra una coppia di numeri.
        result = Math.max(10, 20);

//        Il min()metodo restituisce il numero con il valore più basso tra una coppia di numeri.
        result = Math.min(10, 20);


        System.out.println(result);
    }
}

package JavaBasisc;

public class BreakEContinue {
    public static void main(String[] args) {

//        Break => Serve a bloccare il loop (STOP)
//         Continue => Serve a Skippare l'iterazione quindi va a quella successvia (SKIP)

//        Esempio con Continue:

        for (int i = 0; i <= 10; i++){

            if (i == 5){
                continue;
            }
            System.out.println(i + " ");
        }


//        Esempio con break :
//        for (int i = 0; i <= 10; i++){
//
//            if(i == 5){
//                break;
//            }
//            System.out.println(i + " ");
//        }
    }
}

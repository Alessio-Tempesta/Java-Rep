package Methods;



public class VariableScope {

    static int x =3; //Class

    public static void main(String[] args) {
//        Scope Variable =>

        int x = 1;  //Local
        System.out.println(x);

        doSomething();
    }
    static void doSomething(){
        int x = 2; //Local

        System.out.println(x);
    }
}

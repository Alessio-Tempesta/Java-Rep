package JavaBasisc;

public class NestedLoop {
    public static void main(String[] args) {

//        nested Loop = loop all'interno di un' altro loop

        for(int i =1; i <= 3; i++){
            for (int j = 1; j <= 9; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

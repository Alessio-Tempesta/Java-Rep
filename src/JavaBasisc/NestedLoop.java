package JavaBasisc;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {

//        nested Loop = loop all'interno di un' altro loop

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.println("Enter the # of rows: ");
        rows = scanner.nextInt();

        System.out.println("Enter the # of columns");
        columns = scanner.nextInt();

        System.out.println("Enter the symbol to use ");
        symbol = scanner.next().charAt(0);

        for (int j = 0; j < rows; j++){
            for (int i = 0; i < columns; i++){
                System.out.print(symbol);
        }
            }



        scanner.close();


//        for(int i =1; i <= 3; i++){
//            for (int j = 1; j <= 9; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
    }
}

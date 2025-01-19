package JavaBasisc;

public class PrintF {
    public static void main(String[] args) {

        String name = "Superman";
        char firstLetter = 'S';
        int age = 25;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s \n" , name);
        System.out.printf("Your name starts with a %c \n" , firstLetter);
        System.out.printf("Your have %d years old \n" , age);
        System.out.printf("Your heights is %f \n" , height);
        System.out.printf("You employed? %b \n" , isEmployed);

        System.out.printf("%s is %d years old" , name, age);


    }
}

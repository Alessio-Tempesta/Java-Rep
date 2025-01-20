package JavaBasisc;

public class Substring {
    public static void main(String[] args) {
//        .substring() = metodo utilizzato per estrarre una porzione della stringa
//        string.substring(start, end)

        String email = "Ale@gmail.com";
        String username = email.substring(0, 3);
        String domain = email.substring(4);

        System.out.println(username);
        System.out.println(domain);
    }
}

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name?");
        String name = scanner.nextLine();
        System.out.println("e-mail?");
        String email = scanner.nextLine();
        System.out.println("Your registration is:");
        System.out.println("Name :"+ name);
        System.out.println("e-mail address :"+ email);
    }
}

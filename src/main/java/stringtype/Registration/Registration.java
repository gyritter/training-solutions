package stringtype.Registration;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Regisztráció");

        System.out.println("Felhasználónév:");
        String username = scanner.nextLine();

        System.out.println("Jelszó:");
        String pass1 = scanner.nextLine();
        System.out.println("Jelszó még egyszer:");
        String pass2 = scanner.nextLine();

        System.out.println("e-mail cím:");
        String email = scanner.nextLine();

        UserValidator user= new UserValidator();

        System.out.println(user.isValidUsername(username) ? "felhasználónév rendben" : "felhasználónév helytelen");
        System.out.println(user.isValidPassword(pass1, pass2) ? "jelszó rendben" : "Nem egyezik a két jelszó!");
        System.out.println(user.isValidEmail(email) ? "e-mail rendbenn" : "Nem érvényes e-mail cím!");

    }
}

package classsctructureconstructors;

import java.util.Scanner;

public class BookMain {

        public static void main(String[] args) {

            Book book = new Book("Jóska", "Nincs");

            Scanner scanner = new Scanner(System.in);

            System.out.println("Regisztrációs szám:");
            String regnumber = scanner.nextLine();
            book.setRegNumber(regnumber);

            System.out.println(book.getAuthor());
            System.out.println(book.getTitle());
            System.out.println(book.getRegNumber());
        }


}

package classstructureintegrate;

import classsctructureconstructors.Book;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {

        Product product = new Product("column", 500);

        System.out.println(product.getName());
        System.out.println(product.getPrice());

        Scanner scanner = new Scanner(System.in);

        System.out.println("áremelkedés:");
        int emel = scanner.nextInt();
        product.increasePrice(emel);

        System.out.println(product.getPrice());

        System.out.println("árecsökkenés:");
        int csokkent = scanner.nextInt();
        scanner.nextLine();
        product.decreasePrice(csokkent);

        System.out.println(product.getPrice());
    }
}

package week05d04;

import java.sql.SQLOutput;

public class ProductMain {
    Store store= new Store();

    public static void main(String[] args) {
        System.out.println(Store.addProduct("wheat", 2020, 05, 30););
        Store.addProduct("wheat", 2020, 05, 30);
        Store.addProduct("salt", 3030, 10, 15);
        Store.addProduct("sugar", 2030, 03, 10);
        Store.addProduct("oil", 2023, 05, 30);

        System.out.println(Store.getNumberOfExpired());
    }
}

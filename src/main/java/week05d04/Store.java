package week05d04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Store {
    private List<Product> store = new ArrayList<>();

    public Boolean addProduct(String name, int year, int month, int day) {
        Product product = new Product(name, year, month, day);
        Boolean answer = true;
        for (Product check : store) {
            if (product.getExpiryDate().isBefore(LocalDate.now()) || check.getName().equals(product.getName())) {
                answer = false;
            } else store.add(product);
        }
        return answer;
    }

    public int getNumberOfExpired() {
        //Product product= new Product("wheat", 2020, 05, 30);
       // store.add(product);
        int count = 0;

        for (Product check : store) {
            if (check.getExpiryDate().isBefore(LocalDate.now())) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct("wheat", 2020, 05, 30);
        store.addProduct("wheat", 2020, 05, 30);
        store.addProduct("salt", 3030, 10, 15);
        store.addProduct("sugar", 2030, 03, 10);
        store.addProduct("oil", 2023, 05, 30);

        System.out.println(store.getNumberOfExpired());

    }
}

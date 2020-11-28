package week05d04;

import java.util.ArrayList;
import java.util.List;

public class Store2 {

    private List<Product2> products = new ArrayList();

    public Boolean addProduct(Product2 product) {
        if (isValid(product)) {
            products.add(product);
            return true;
        }
        return false;
    }

    public int getNumberOfExpired() {
        int count = 0;
        for (Product2 prod: products) {
            if (prod.isExpired()) {
                count++;
            }
        }
        return count;
    }

    private Boolean isValid(Product2 product) {

        if (containsByName(product) || product.isExpired()) {
            return false;
        }
        return true;
    }

    private Boolean containsByName(Product2 product) {
        for (Product2 prod: products) {
            if (prod.getName().equals(product.getName())) {
                return true;
            }
        }
        return false;
    }
}

package week06d02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreCategoryTest {

    @Test
    public void storeCategoryTest() {

        List<Product> products = new ArrayList<>();

        products.add(new Product("tej", "DAIRY", 500));
        products.add(new Product("áfonya", "FROZEN", 500));
        products.add(new Product("kenyér", "BAKEDGOODS", 500));
        products.add(new Product("szappan", "OTHER", 500));
        products.add(new Product("vaj", "DAIRY", 500));
        products.add(new Product("túró", "DAIRY", 500));
        products.add(new Product("málna", "FROZEN", 500));
        products.add(new Product("kifli", "BAKEDGOODS", 500));
        products.add(new Product("fogpiszkáló", "OTHER", 500));

        Store bolt = new Store(products);

        assertEquals(3, bolt.getProductByCategoryName("DAIRY"));
    }

}

package week06d02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreCategoryTest {

    @Test
    public void storeCategoryTest() {

        List<Product> products = new ArrayList<>();

        products.add(new Product("tej", ProductCategory.DAIRY, 500));
        products.add(new Product("áfonya", ProductCategory.FROZEN, 500));
        products.add(new Product("kenyér", ProductCategory.BAKEDGOODS, 500));
        products.add(new Product("szappan", ProductCategory.OTHER, 500));
        products.add(new Product("vaj", ProductCategory.DAIRY, 500));
        products.add(new Product("túró", ProductCategory.DAIRY, 500));
        products.add(new Product("málna", ProductCategory.FROZEN, 500));
        products.add(new Product("kifli", ProductCategory.BAKEDGOODS, 500));
        products.add(new Product("fogpiszkáló", ProductCategory.OTHER, 500));

        Store bolt = new Store(products);

        assertEquals(3, bolt.getProductByCategoryName(ProductCategory.DAIRY));
    }
}

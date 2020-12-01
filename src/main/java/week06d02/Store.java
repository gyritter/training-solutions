package week06d02;

import jdk.jfr.Category;

import java.util.List;

public class Store {

    private List<Product> productlist;

    public Store(List<Product> productlist) {
        this.productlist = productlist;
    }

    public int getProductByCategoryName(ProductCategory category){

        int count = 0;
        for(Product product: productlist){
            if(product.getCategory() == category){
                count++;
            }
        }
        return count;
    }
}

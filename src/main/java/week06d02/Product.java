package week06d02;

public class Product {

    private String name;
    private ProductCategory category;
    private int price;

    public Product(String name, ProductCategory category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }
}

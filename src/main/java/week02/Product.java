package week02;

public class Product {
    private String  name;
    private String  code;

    public String getName() {
        return name;
    }


    public String getCode() {
        return code;
    }



    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }
    public boolean areTheyEqual (Product anotherproduct){
       return name.equals(anotherproduct.name);
    }

    public static void main(String[] args) {

        Product product1 =new Product("Tégla", "abc123");


        Product product2 =new Product("Kavics", "abc124");



        Product product3 =new Product("Kavics", "abc125");


        System.out.println(product1.areTheyEqual(product2));
        System.out.println(product1.areTheyEqual(product3));
        System.out.println(product3.areTheyEqual(product2));
        }


    }







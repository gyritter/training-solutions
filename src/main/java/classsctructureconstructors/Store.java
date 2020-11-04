package classsctructureconstructors;

public class Store {
    private String product;
    private int stock;

    public Store (String product) {
    this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void store(int bevét) {
        stock = stock + bevét;
    }
    public void dispatch(int csökken) {
        stock = stock - csökken;
    }
}

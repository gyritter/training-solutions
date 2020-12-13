package inheritanceattributes;

public class ShippedBooks extends Book{

    private int shippingCost;

    public ShippedBooks(String title, int price, int shippongCost) {
        super(title, price);
        this.shippingCost = shippongCost;
    }

    public int order(int pieces){
        return super.purchase(pieces) + shippingCost;
    }

    public String toString(){
        return super.getTitle() + ":" + price + " - " + shippingCost;
    }
}

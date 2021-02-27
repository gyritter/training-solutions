package x.canoe;

public enum CanoeType {RED(1.0),GREEN(1.2),BLUE(1.5);

    private double price;

    CanoeType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

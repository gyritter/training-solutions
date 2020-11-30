package methodstructure;

public class Pendrive {
    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    public String toStrimd() {

        return "name: " + getName() + " capacity: " + getCapacity() + " price: " + getPrice();
    }

    public void risePrice(int percent) {

        this.price += this.price*percent / 100.0;
    }

    public int comparePricePerCapacity(Pendrive pndr) {

        double masterRatio = (double) price / (double) capacity;
        double pndrRatio = (double) pndr.getPrice() / (double) pndr.getCapacity();
        if (masterRatio > pndrRatio) return 1;
        if (masterRatio < pndrRatio) return -1;
        return 0;

    }
    public boolean cheaperThan(Pendrive pndr){
        if (price<pndr.getPrice()) return true;
        return false;
    }
}

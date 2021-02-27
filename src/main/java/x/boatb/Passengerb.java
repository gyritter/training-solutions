package x.boatb;

public class Passengerb {

    private String name;
    private CruiseClassb cruiseClass;

    public Passengerb(String name, CruiseClassb cruiseClass) {
        this.name = name;
        this.cruiseClass = cruiseClass;
    }

    public String getName() {
        return name;
    }

    public CruiseClassb getCruiseClass() {
        return cruiseClass;
    }

    @Override
    public String toString() {
        return "Passengerb{" +
                "name='" + name + '\'' +
                ", cruiseClass=" + cruiseClass +
                '}';
    }
}

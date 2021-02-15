package exam03;

public class Passenger {

    private String name;
    private Enum<CruiseClass> cruiseClass;

    public Passenger(String name, Enum<CruiseClass> cruiseClass) {
        this.name = name;
        this.cruiseClass = cruiseClass;
    }

    public String getName() {
        return name;
    }

    public Enum<CruiseClass> getCruiseClass() {
        return cruiseClass;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", cruiseClass=" + cruiseClass +
                '}';
    }
}

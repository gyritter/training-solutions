package exam03;

public enum CruiseClass {
    LUXURY(3.0), FIRST(1.8), SECOND(1.0);

    public final double multiplyer;

    CruiseClass(double multiplyer) {
        this.multiplyer = multiplyer;
    }

    public double getMultiplyer() {
        return multiplyer;
    }
}

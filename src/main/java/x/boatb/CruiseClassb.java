package x.boatb;

public enum CruiseClassb {LUXURY(3.0), FIRST(1.8), SECOND(1.0);
    private double extraprice;

    CruiseClassb(double extraprice) {
        this.extraprice = extraprice;
    }

    public double getExtraprice() {
        return extraprice;
    }
}

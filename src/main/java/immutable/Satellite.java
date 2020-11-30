package immutable;

public class Satellite {
    private final CelestialCoordinates target;
    private final String satID;

    public Satellite(CelestialCoordinates target, String satID) {
        if (isEmpty(satID)){
            throw new IllegalArgumentException ("Register ident must not be empty!");
        }
        this.target = target;
        this.satID = satID;
    }

    public CelestialCoordinates getTarget() {
        return target;
    }

    public String getSatID() {
        return satID;
    }

    public void modifyDestination(CelestialCoordinates coorDiff){
        //target = new CelestialCoordinates(target.getX() + coorDiff.getX(),
        //        target.getY() + coorDiff.getY(),
        //        target.getZ() + coorDiff.getZ());
    }

    public String toString(){
        return getSatID() + ": "+ target.toString();
    }

    private Boolean isEmpty(String text){
        if (text == null || text.isBlank()) {
            return true;
        }
        return false;
    }
}

package week06d05;

public class Bottle {

    private BottleType type;
   private int filledUntil;

    private Bottle(BottleType type) {
        this.type = type;
        this.filledUntil=0;

    }

    public BottleType getType() {
        return type;
    }

    public int getFilledUntil() {
        return filledUntil;
    }

    public static Bottle of(BottleType type){
        return new Bottle(type);
    }
    public void fill (int fillAmount){
        if(filledUntil+fillAmount>type.getMaximumAmount()){
            throw new IllegalArgumentException("Too much");
        }
        filledUntil+=fillAmount;

    }
}

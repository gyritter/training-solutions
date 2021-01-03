package week06d05;

public enum BottleType {GLASS_BOTTLE(500), PET_BOTTLE(1000);

    private int maximumAmount;

    BottleType(int maximumAmount) {
        this.maximumAmount = maximumAmount;
    }

    public int getMaximumAmount() {
        return maximumAmount;
    }
}

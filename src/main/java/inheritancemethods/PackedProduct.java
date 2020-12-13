package inheritancemethods;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PackedProduct extends Product{

    private int packingUnit;
    private BigDecimal weightOfBox;

    public PackedProduct(String name, BigDecimal unitWeigth, int numberOfDecimals, int packingUnit, BigDecimal weightOfBox) {
        super(name, unitWeigth, numberOfDecimals);
        this.packingUnit = packingUnit;
        this.weightOfBox = weightOfBox;
    }

    public PackedProduct(String name, BigDecimal unitWeigth, int packingUnit, BigDecimal weightOfBox) {
        super(name, unitWeigth);
        this.packingUnit = packingUnit;
        this.weightOfBox = weightOfBox;
    }

    public int getPackingUnit() {
        return packingUnit;
    }

    public BigDecimal getWeightOfBox() {
        return weightOfBox;
    }

    @Override
    public BigDecimal totalWeight(int pieces){
        BigDecimal productWeight =super.totalWeight(pieces);
        int packings = pieces / packingUnit;
        if (pieces % packingUnit > 0) packings++;
        BigDecimal box = weightOfBox.multiply(new BigDecimal(String.valueOf(packings)));
        return productWeight.add(box).setScale(getNumberOfDecimals(), RoundingMode.HALF_UP);
    }
}

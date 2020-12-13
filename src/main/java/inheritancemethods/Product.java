package inheritancemethods;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {

    private String name;
    private BigDecimal unitWeigth;
    private int numberOfDecimals;

    public Product(String name, BigDecimal unitWeigth, int numberOfDecimals) {
        this.name = name;
        this.unitWeigth = unitWeigth;
        this.numberOfDecimals = numberOfDecimals;
    }

    public Product(String name, BigDecimal unitWeigth) {
        this.name = name;
        this.unitWeigth = unitWeigth;
        this.numberOfDecimals = 2;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfDecimals() {
        return numberOfDecimals;
    }

    public BigDecimal totalWeight(int pieces){
        return unitWeigth.multiply(new BigDecimal(String.valueOf(pieces))).setScale(numberOfDecimals, RoundingMode.HALF_UP);
    }

    public BigDecimal getUnitWeight() {
        return unitWeigth;
    }
}

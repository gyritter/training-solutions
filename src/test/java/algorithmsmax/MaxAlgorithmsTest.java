package algorithmsmax;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxAlgorithmsTest {

    List<Salesperson> salespersons = Arrays.asList(
            new Salesperson("John", 600, 500),
            new Salesperson("Bill", 200, 300),
            new Salesperson("Kate", 700, 100),
            new Salesperson("Mary", 700, 300),
            new Salesperson("Karl", 200, 50)
    );

    @Test
    public void testSelectSalesPersonWithMaxSalesAmount() {
        SalesAmountSelector maxAmount = new SalesAmountSelector();

        assertEquals(700, maxAmount.salespersonWithMaxAmount(salespersons).getAmount());
        assertEquals(100, maxAmount.salespersonWithMaxAmount(salespersons).getTarget());
    }

    @Test
    public void testSelectSalesPersonWithFurthestAboveTarget() {
        SalesAmountSelector aboveTarget = new SalesAmountSelector();

        assertEquals(600, aboveTarget.salespersonWithMaxOver(salespersons).getDifferenceFromTarget());
        assertEquals(700, aboveTarget.salespersonWithMaxOver(salespersons).getAmount());
        assertEquals(100, aboveTarget.salespersonWithMaxOver(salespersons).getTarget());
    }

    @Test
    public void testSelectSalesPersonWithFurthestBelowTarget() {
        SalesAmountSelector belowTarget = new SalesAmountSelector();

        assertEquals(-100, belowTarget.salespersonWithMaxUnder(salespersons).getDifferenceFromTarget());
        assertEquals(200, belowTarget.salespersonWithMaxUnder(salespersons).getAmount());
        assertEquals(300, belowTarget.salespersonWithMaxUnder(salespersons).getTarget());
    }

}

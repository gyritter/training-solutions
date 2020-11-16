package algorithmsmax;

import java.util.List;

public class SalesAmountSelector {

    public Salesperson salespersonWithMaxAmount(List<Salesperson> salers) {
        Salesperson SalespersonWithMaxAmount = null;
        int maxsale = Integer.MIN_VALUE;
        for (Salesperson saler : salers) {
            if (saler.getAmount() > maxsale) {
                SalespersonWithMaxAmount = saler;
                maxsale = saler.getAmount();
            }
        }
        return SalespersonWithMaxAmount;
    }

    public Salesperson salespersonWithMaxOver(List<Salesperson> salers) {
        Salesperson SalespersonWithMaxOver = null;
        int maxsale = Integer.MIN_VALUE;
        for (Salesperson saler : salers) {
            if (saler.getAmount() - saler.getTarget() > maxsale) {
                SalespersonWithMaxOver = saler;
                maxsale = saler.getAmount() - saler.getTarget();
            }
        }
        return SalespersonWithMaxOver;
    }

    public Salesperson salespersonWithMaxUnder(List<Salesperson> salers) {
        Salesperson SalespersonWithMaxUnder = null;
        int maxsale = Integer.MIN_VALUE;
        for (Salesperson saler : salers) {
            if (saler.getTarget() - saler.getAmount() > maxsale) {
                SalespersonWithMaxUnder = saler;
                maxsale = saler.getTarget() - saler.getAmount();
            }
        }
        return SalespersonWithMaxUnder;
    }
}

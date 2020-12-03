package week06d04;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BudgetTest {

    @Test
    public void budgetTest() {

        List<Item> items = new ArrayList<>();

       items.add(new Item(100, 12, "Útszórás"));
       items.add(new Item(200, 10, "Irodaszer"));
       items.add(new Item(300, 9, "Felújítás"));
       items.add(new Item(400, 9, "Turbinák"));
       items.add(new Item(500, 8, "Kertép"));



        Budget költségvetés = new Budget(items);

        assertEquals(2, költségvetés.getItemsByMonth(9).size());
    }
}


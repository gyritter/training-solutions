package week07d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingListTest {

    @Test
    public void CalculateSiumTest() {
        ShoppingList shoppingList = new ShoppingList();
        assertEquals(630, shoppingList.calculateSum("shoppinglist.txt"));
    }
}
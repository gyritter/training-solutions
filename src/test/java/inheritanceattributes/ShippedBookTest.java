package inheritanceattributes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShippedBookTest {

    @Test
    public void constructorAndToStringTest() {
        //Given
        ShippedBooks book = new ShippedBooks("Gyűrűk ura", 3000, 1200);
        //Then
        assertEquals("Gyűrűk ura:3000 - 1200",book.toString());
    }

    @Test
    public void orderTest()  {
        //Given
        ShippedBooks book = new ShippedBooks("Gyűrűk ura", 3000, 1200);
        //Then
        assertEquals(7200,book.order(2));
    }
}

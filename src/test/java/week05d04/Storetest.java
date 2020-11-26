package week05d04;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Storetest {

    @Test
    public void testNoOfExpired() {
        Store store = new Store();

        store.addProduct("wheat", 2020, 05, 30);
        store.addProduct("wheat", 2020, 05, 30);
        store.addProduct("salt", 3030, 10, 15);
        store.addProduct("sugar", 2030, 03, 10);
        store.addProduct("oil", 2023, 05, 30);

        assertEquals(1, store.getNumberOfExpired());
        //ahhoz, hogy jól fusson a // jeleket ki kell venni a Store.java-ból

    }

}

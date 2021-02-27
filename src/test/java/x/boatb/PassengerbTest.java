package x.boatb;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

    public class PassengerbTest {

        @Test
        void create() {
            Passengerb passenger = new Passengerb("John Doe", CruiseClassb.LUXURY);
            assertEquals("John Doe", passenger.getName());
            assertEquals(CruiseClassb.LUXURY, passenger.getCruiseClass());
        }

}
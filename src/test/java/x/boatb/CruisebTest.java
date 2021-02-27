package x.boatb;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

    public class CruisebTest {

        private Boatb boat = new Boatb("WetDreams", 5);

        private Cruiseb cruise = new Cruiseb(boat, LocalDate.of(2021, 1, 1), 100_000);

        @Test
        void create() {
            assertEquals(boat, cruise.getBoat());
            assertEquals(LocalDate.of(2021, 1, 1), cruise.getSailing());
            assertEquals(100_000, cruise.getBasicPrice());
        }

        @Test
        void bookPassenger() {
            cruise.bookPassenger(new Passengerb("John Doe", CruiseClassb.LUXURY));

            assertEquals(1, cruise.getPassengers().size());
            assertEquals("John Doe", cruise.getPassengers().get(0).getName());
        }

        @Test
        void overBooking() {
            for (int i = 0; i < 5; i++) {
                cruise.bookPassenger(new Passengerb("John Doe", CruiseClassb.LUXURY));
            }
            assertThrows(IllegalArgumentException.class,
                    () -> cruise.bookPassenger(new Passengerb("John Doe", CruiseClassb.LUXURY)));
        }

        @Test
        void getPriceForPassenger() {
            double price = cruise.getPriceForPassenger(new Passengerb("John Doe", CruiseClassb.LUXURY));
            assertEquals(300_000, price, 0.5);

            price = cruise.getPriceForPassenger(new Passengerb("John Doe", CruiseClassb.FIRST));
            assertEquals(180_000, price, 0.5);

            price = cruise.getPriceForPassenger(new Passengerb("John Doe", CruiseClassb.SECOND));
            assertEquals(100_000, price, 0.5);
        }

        @Test
        void findPassengerByName() {
            cruise.bookPassenger(new Passengerb("John Doe", CruiseClassb.LUXURY));
            cruise.bookPassenger(new Passengerb("Jack Doe", CruiseClassb.FIRST));

            Passengerb passenger = cruise.findPassengerByName("Jack Doe");
            assertEquals("Jack Doe", passenger.getName());
        }

        @Test
        void getPassengerNamesOrdered() {
            cruise.bookPassenger(new Passengerb("Jack Smith", CruiseClassb.FIRST));
            cruise.bookPassenger(new Passengerb("John Doe", CruiseClassb.LUXURY));
            cruise.bookPassenger(new Passengerb("Jack Doe", CruiseClassb.FIRST));

            List<String> names = cruise.getPassengerNamesOrdered();
            assertEquals(List.of("Jack Doe", "Jack Smith", "John Doe"), names);
        }

        @Test
        void sumAllBookingsCharged() {
            cruise.bookPassenger(new Passengerb("Jack Smith", CruiseClassb.LUXURY));
            cruise.bookPassenger(new Passengerb("John Doe", CruiseClassb.FIRST));
            cruise.bookPassenger(new Passengerb("Jack Doe", CruiseClassb.SECOND));

            double sum = cruise.sumAllBookingsCharged();
            assertEquals(300_000 + 180_000 + 100_000, sum, 0.5);
        }

        @Test
        void countPassengerByClass() {
            cruise.bookPassenger(new Passengerb("Jack Smith", CruiseClassb.LUXURY));
            cruise.bookPassenger(new Passengerb("John Doe", CruiseClassb.LUXURY));
            cruise.bookPassenger(new Passengerb("Jack Doe", CruiseClassb.FIRST));

            Map<CruiseClassb, Integer> result = cruise.countPassengerByClass();
            assertEquals(Map.of( CruiseClassb.FIRST, 1, CruiseClassb.LUXURY, 2), result);
        }

}
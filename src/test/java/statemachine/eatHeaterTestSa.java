package statemachine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class eatHeaterTestSa {

    @Test
    public void testNext() {

        assertEquals(SeatHeaterState.THREE, SeatHeaterState.OFF.next());
        assertEquals(SeatHeaterState.TWO, SeatHeaterState.THREE.next());
        assertEquals(SeatHeaterState.ONE, SeatHeaterState.TWO.next());
        assertEquals(SeatHeaterState.OFF, SeatHeaterState.ONE.next());
    }
}

package x.boatb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BoatbTest {
    @Test
    void create() {
        Boatb boat = new Boatb("WetDreams", 15);
        assertEquals("WetDreams", boat.getName());
        assertEquals(15, boat.getMaxPassengers());
    }

}
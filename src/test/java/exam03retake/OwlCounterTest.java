package exam03retake;

import java.io.InputStreamReader;

import static org.junit.jupiter.api.Assertions.*;


    import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OwlCounterTest {

        @Test
        void load() throws IOException {
            OwlCounter owlCounter = new OwlCounter();
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(OwlCounterTest.class.getResourceAsStream("owl.txt")))) {
                owlCounter.readFromFile(reader);
            }
            System.out.println();
            assertEquals(1000, owlCounter.getNumberOfOwls("Bács-Kiskun"));
            assertEquals(893, owlCounter.getNumberOfOwls("Somogy"));
            assertEquals(135, owlCounter.getNumberOfOwls("Zala"));
        }

}
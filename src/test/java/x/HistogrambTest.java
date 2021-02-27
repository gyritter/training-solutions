package x;


import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

    public class HistogrambTest {

        @Test
        void createHistogram() throws IOException {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(HistogrambTest.class.getResourceAsStream("Histogramb.txt")))) {
                String result = new Histogramb().createHistogram(reader);
//            System.out.println(result);
                assertEquals("***\n" +
                        "****\n" +
                        "**\n" +
                        "*\n", result);
                System.out.println(result);
            }
        }

}
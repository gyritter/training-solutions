package week15d01;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CoordinatesTest {

    @Test

    public void testMaxValue() {

        Coordinates coordinate = new Coordinates();
        Map<Double, Double> function = new HashMap<>();
        function.put(-3.5, -12.6);
        function.put(+3.5, +13.6);
        function.put(-1.0, -8.3);
        function.put(100.0, 0.0);
        Map.Entry<Double, Double> result = coordinate.searchMin(function);
        assertEquals(3.5, result.getKey());
        assertEquals(13.6, result.getValue());
        assertEquals("3.5=13.6", result.toString());
    }

}
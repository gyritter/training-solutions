package week08d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathAlgorithmsTest {
    @Test
            public void Test(){

    MathAlgorithms mathalgorithms = new MathAlgorithms();
    assertEquals(20,mathalgorithms.greatestCommonDivisor(60, 200));
}
}

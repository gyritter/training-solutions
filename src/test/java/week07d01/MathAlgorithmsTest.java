package week07d01;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathAlgorithmsTest {

    @Test

    public void primeTest(){
        MathAlgorithms mathAlgorithms = new MathAlgorithms();

        assertEquals(true, mathAlgorithms.isPrime(3));

    }
}

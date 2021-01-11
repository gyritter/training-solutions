package week11d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisorfinderTest {
    @Test
    public void DivisorTest(){
    Divisorfinder divisorfinder= new Divisorfinder();

        assertEquals(1, divisorfinder.findDivisors(425));

}
}
package week07d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitSumTest {

    @Test
    public void testDigitSum() {

        DigitSum digitSum = new DigitSum();

        assertEquals(2, digitSum.sumOfDigits(11));
        assertEquals(2, digitSum.sumOfDigits(101));
        assertEquals(2, digitSum.sumOfDigits(110));
        assertEquals(5, digitSum.sumOfDigits(104));

    }

}

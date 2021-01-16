package week11d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileSumTest {
    @Test
    public void fileSumTest() {

        FileSum fileSum = new FileSum();

        assertEquals(144, fileSum.SumNumbers());
    }

    @Test
    void numberFormatExctest (){

        FileSum fileSum = new FileSum();

        assertThrows(IllegalArgumentException.class,()->fileSum.SumNumbers());
    }
}

package week12d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberStatTest {
    @Test
    public void numberStatTest(){

        NumberStat numberStat= new NumberStat();
        numberStat.readFromFile("NumberStat.txt");
        assertEquals(6, numberStat.onceInstance());
    }

}
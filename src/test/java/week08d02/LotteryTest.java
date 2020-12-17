package week08d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LotteryTest {
    @Test

    public  void LotteryTest() {

        Lottery lottery= new Lottery();

        assertEquals(6, lottery.getNumbers(45,6).size());
        System.out.println(lottery.toString());
    }
}


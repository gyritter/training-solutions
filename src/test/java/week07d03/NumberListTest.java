package week07d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberListTest {

    @Test
    public void testNumberList() {

        NumberList numberList = new NumberList();

        List<Integer> testlist1 = Arrays.asList(1, 2, 3, 3, 3, 5);
        List<Integer> testlist2 = Arrays.asList(1, 3, 2, 3, 3, 5);

        assertEquals(true, numberList.isIncreasing(testlist1));
        assertEquals(false, numberList.isIncreasing(testlist2));


    }
}


package week05d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListCounterTest {

    @Test
    public void testStartWithA() {

        ListCounter listCounter = new ListCounter();
        List<String> testlist = Arrays.asList("alma", "áfonya", "Apple", "meggy", "Barack");

        assertEquals(2, listCounter.listCounter(testlist));

    }

    @Test
    public void startWithEmptyListTest() {

        ListCounter listCounter = new ListCounter();
        List<String> testlist = Arrays.asList();

        assertEquals(0, listCounter.listCounter(testlist));

    }

    @Test
    public void startWithANonATest() {

        ListCounter listCounter = new ListCounter();
        List<String> testlist = Arrays.asList("áfonya", "meggy", "Barack");

        assertEquals(0, listCounter.listCounter(testlist));

    }



}

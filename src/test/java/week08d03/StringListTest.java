package week08d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

public class StringListTest {

    @Test
    public void stringListTest(){

        StringLists stringlist = new StringLists();
        List<String> first = Arrays.asList("a", "b", "c");
        List<String> second = Arrays.asList("d", "e", "f");

        assertEquals(6, stringlist.stringListsUnion(first, second).size());
    }

    @Test
    public void stringListTestRepeats(){

        StringLists stringlist = new StringLists();
        List<String> first = Arrays.asList("a", "b", "c", "a");
        List<String> second = Arrays.asList("d", "e", "f", "f");

        assertEquals(6, stringlist.stringListsUnion(first, second).size());
    }
}

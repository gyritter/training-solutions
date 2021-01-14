package week11d03;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordFilterTest {
public void wordFilterTest(){
    List<String> test = List.of("kukac", "kerek", "kocka", "macska");

    WordFilter wordFilter= new WordFilter();
    assertEquals(4,wordFilter.wordsWithChar(test,'k'));
    assertEquals(1,wordFilter.wordsWithChar(test,'e'));
}


}
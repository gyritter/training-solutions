package week06d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordEraserTest {

     @Test
     public void testEraser(){

       assertEquals("ember nagy ember állat kiskert", new WordEraser().eraseWord("kis ember nagy ember kis állat kiskert", "kis"));
       assertEquals("ember nagy ember állat kiskert", new WordEraser().eraseWordWithScanner("kis ember nagy ember kis állat kiskert", "kis"));
    }
}

package week05d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChangeLetterTest {

    @Test

    public void replaceLetter(){
        ChangeLetter changeLetter=new ChangeLetter();

        String text= "Kisember";
        assertEquals("K*s*mb*r", changeLetter.changeVowels(text));




    }

}

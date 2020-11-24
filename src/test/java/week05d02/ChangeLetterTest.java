package week05d02;

import introjunit.Gentleman;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChangeLetterTest {

    @Test

    public void ChangeLetterTest() {

        // Given
        String text = "John Doe";

        // When
        String teszt = changeVowels(text);

        // Then
        assertEquals("J*hn D**", teszt);
    }

    public void ChangeLetterTest2() {

        // Given
        String text = "Jó napot";

        // When
        String teszt = changeVowels(text);

        // Then
        assertEquals("Jó n*p*t", teszt);
    }
}

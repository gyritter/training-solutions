package week05d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserTest {

    @Test
    public void userTest() {
        User user = new User("John", "Doe", "abcd@akarmi.com");
        assertEquals("John Doe", user.getFullName());
    }


    @Test
    public void emailNoKukac() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () ->
                new User("John", "Dow", "abcdakarmi.com"));
        assertEquals("The e-mail address invalid!", ex.getMessage());
    }

    @Test
    public void emailNoPointAfterKukac() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () ->
                new User("John", "Dow", "abcd@akarmicom"));
        assertEquals("The e-mail address invalid!", ex.getMessage());
    }
}

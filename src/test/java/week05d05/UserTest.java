package week05d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserTest {

    @Test
    public void userTest(){
        User user = new User("John", "Doe", "abcd@akarmi.com");
        assertEquals("John Doe", user.getFullName());
    }

    @Test
    public void userTest2(){
        User user = new User("John", "Doe", "abcdakarmi.com");
        assertEquals("John Doe", user.getFullName());
    }

    @Test
    public void userTest3(){
        User user = new User("John", "Doe", "abcd@akarmicom");
        assertEquals("John Doe", user.getFullName());
    }

//    @Test
//    public void emailNokukac() throws IllegalArgumentException {
//        User user = new User("John", "Dow", "abcdakarmi.com");
//        Exception ex = assertThrows(IllegalArgumentException.class, () -> user.kukac());
//        assertEquals("The e-mail address invalid!", ex.getMessage());
//    }

//    @Test
//    public void emailBadPointPosition() throws IllegalArgumentException {
//        User user = new User("John", "Dow", "abc.d@akarmicom");
//        Exception ex = assertThrows(IllegalArgumentException.class, () -> user);
//        assertEquals("The e-mail address invalid!", ex.getMessage());
//    }

}

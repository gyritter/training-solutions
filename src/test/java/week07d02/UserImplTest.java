package week07d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserImplTest {

    @Test

    public void userImplTest(){

        UserImpl userIml= new UserImpl("Baba", "Nagy","Réka");
        assertEquals("Nagy Réka", userIml.getFullName());
    }
}

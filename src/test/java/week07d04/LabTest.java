package week07d04;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LabTest {

    @Test
    public void createWithTitle(){
      Lab lab =new Lab ("feladat");

      assertEquals("feladat", lab.getTitle());
    }

    @Test
    public void createWithTitleAnDate(){
        Lab lab =new Lab ("feladat", LocalDate.of(2020, 12, 10));
        assertEquals("feladat", lab.getTitle());
        assertTrue(lab.isCompleted());
        assertEquals(LocalDate.of(2020, 12, 10), lab.getCompletedAt());
    }

    @Test
    public void completeNowTest(){
        Lab lab =new Lab ("feladat");
        lab.complete();
        assertEquals("feladat", lab.getTitle());
        assertTrue(lab.isCompleted());
        assertEquals(LocalDate.of(2020, 12, 10), lab.getCompletedAt());
    }

    @Test
    public void completeLaterTest(){
        Lab lab =new Lab ("feladat");
        lab.complete(LocalDate.of(2020, 12, 9));
        assertEquals("feladat", lab.getTitle());
        assertTrue(lab.isCompleted());
        assertEquals(LocalDate.of(2020, 12, 9), lab.getCompletedAt());
    }

    @Test
    public void createToStringTest(){
        Lab lab =new Lab ("feladat", LocalDate.of(2020, 12, 10));
        assertEquals("feladat completed at: 2020:DECEMBER:10", lab.toString());
    }

    @Test
    public void createToStringNotCompletdTest(){
        Lab lab =new Lab ("feladat");
        assertEquals("feladat Not yet completed", lab.toString());
    }
}

package week14d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void createTest() {
        Student s = new Student("Bill");
        assertEquals("Bill", s.getName());
        assertEquals(0, s.getMarks().size());

    }
    @Test
    public void addMarkTest(){
        Student s = new Student("Bill");
        s.addMark("GEO",2);
        s.addMark("CHEM",5);
        assertEquals(2, s.getMarks().size());
        assertEquals(2, s.getMarks().get("GEO").get(0));
        assertEquals(5, s.getMarks().get("CHEM").get(0));
    }
}
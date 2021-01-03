package week07d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test

    public void TestDateOf(){
        Date date = Date.of(2020,1,12);
        System.out.println(date.getYear()+ " "+ date.getMonth()+" "+date.getDay());
    }

    @Test

    public void TestwithYear(){
        Date date = Date.of(2020,1,12);
        assertEquals(1988,date.withYear(1988).getYear()) ;
    }
    @Test

    public void TestwithMonth(){
        Date date = Date.of(2020,1,12);
        assertEquals(9,date.withMonth(9).getMonth()) ;
    }

    @Test

    public void TestwithDay(){
        Date date = Date.of(2020,1,12);
        assertEquals(30,date.withDay(30).getDay()) ;
    }

}
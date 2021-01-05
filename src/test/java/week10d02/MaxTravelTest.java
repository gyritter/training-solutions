package week10d02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxTravelTest {

    @Test
    public void getMaxIndexTest(){
        MaxTravel maxtravel = new MaxTravel();
        List<Integer> stops =List.of(12,12,12,0,3,4,4);
        assertEquals(12,maxtravel.getMaxIndex(stops));
    }

}
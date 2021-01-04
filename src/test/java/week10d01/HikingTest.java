package week10d01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {

    @Test
    public void upTest(){
        Hiking hiking = new Hiking();
        List<Double> elevations= List.of(10.,20.,15.,18.);

        assertEquals(13., hiking.getPlusElevation(elevations));
    }

   @Test
    public void nullTest() {
        Hiking hiking = new Hiking();
        List<Double> elevations= List.of(10.,10.,10.,10.);
        assertEquals(0., hiking.getPlusElevation(elevations));
    }
}
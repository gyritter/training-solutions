package week11d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourierTest {

    @Test

    public void addRideTest(){
        Courier courier= new Courier();
        courier.addRide(new Ride(1,1,10));
        courier.addRide(new Ride(2,1,10));
        courier.addRide(new Ride(2,2,30));
        courier.addRide(new Ride(3,1,50));
        courier.addRide(new Ride(3,2,15));

        assertEquals(5,courier.getRides().size());

    }
    public void nonWorkTest(){
        Courier courier= new Courier();
        courier.addRide(new Ride(1,1,10));
        courier.addRide(new Ride(2,1,10));
        courier.addRide(new Ride(2,2,30));
        courier.addRide(new Ride(4,1,50));
        courier.addRide(new Ride(4,2,15));

        assertEquals(3,courier.nonWork());

    }

}
package week07d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehiclesTest {

    @Test
    public void testVehicle() {

        Vehicle vehicle = new Vehicle();

        assertEquals(5, vehicle.getNumberOfGears());
        assertEquals(TransmissionType.MANUAL, vehicle.getTransmissionType());

    }

    @Test
    public void testMotocycle() {

        Motorcycle motor = new Motorcycle();

        assertEquals(5, motor.getNumberOfGears());
        assertEquals(TransmissionType.SEQUENTIAL, motor.getTransmissionType());

    }

    @Test
    public void testCar() {

        Car car = new Car();

        assertEquals(5, car.getNumberOfGears());
        assertEquals(TransmissionType.AUTOMATIC, car.getTransmissionType());

    }

    @Test
    public void testTruck() {

        Truck truck = new Truck();

        assertEquals(5, truck.getNumberOfGears());
        assertEquals(TransmissionType.MANUAL, truck.getTransmissionType());

    }
}

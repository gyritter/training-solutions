package exam03;

import java.time.LocalDate;
import java.util.*;

public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers = new ArrayList<>();

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public Passenger bookPassenger(Passenger passenger) {
        if (passengers == null || boat.getMaxPassengers() > passengers.size()) {
            passengers.add(passenger);
        } else throw new IllegalArgumentException();
        return passenger;
    }

    public double getPriceForPassenger(Passenger passenger) {
        return basicPrice * passenger.getCruiseClass().getMultiplier();
    }

    public Passenger findPassengerByName(String name) {
        for (Passenger passenger : passengers) {
            if (passenger.getName().equals(name)) {
                return passenger;
            }
        }
        throw new IllegalArgumentException("No such passanger");
    }

    public List<String> getPassengerNamesOrdered() {
        List<String> result = new ArrayList<>();
        for (Passenger passenger : passengers) {
            result.add(passenger.getName());
        }
        Collections.sort(result);
        return result;
    }

    public double sumAllBookingsCharged() {
        double result=0;
        for (Passenger passenger : passengers) {
            result += getPriceForPassenger(passenger);
        }
        return result;
    }

    public Map<CruiseClass, Integer> countPassengerByClass() {
        Map<CruiseClass, Integer> result= new HashMap<>();
        for (Passenger passenger : passengers) {
            if (result.containsKey(passenger.getCruiseClass())) {
                result.put(passenger.getCruiseClass(), result.get(passenger.getCruiseClass()) + 1);
            }
            else {
                result.put(passenger.getCruiseClass(), 1);
            }
        }
        return result;
    }
}

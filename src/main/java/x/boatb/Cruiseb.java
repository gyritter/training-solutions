package x.boatb;

import java.time.LocalDate;
import java.util.*;

public class Cruiseb {

    private Boatb boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passengerb> passengers = new ArrayList<>();

    public Cruiseb(Boatb boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public Boatb getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passengerb> getPassengers() {
        return passengers;
    }

    public Passengerb bookPassenger(Passengerb passenger) {
        if (passengers.isEmpty() || passengers.size() < boat.getMaxPassengers()) {
            passengers.add(passenger);
        } else throw new IllegalArgumentException();
        return passenger;
    }

    public double getPriceForPassenger(Passengerb passenger) {
        return passenger.getCruiseClass().getExtraprice() * basicPrice;
    }

    public Passengerb findPassengerByName(String name) {
        for (Passengerb x : passengers) {
            if (x.getName().equals(name)) {
                return x;
            }
        }
        throw new IllegalArgumentException("no passenger exists");
    }

    public List<String> getPassengerNamesOrdered() {
        List<String> result = new ArrayList<>();
        for (Passengerb x : passengers) {
            result.add(x.getName());
        }
        Collections.sort(result);
        return result;
    }

    public double sumAllBookingsCharged() {
        double count = 0.0;
        for (Passengerb x : passengers) {
            count += getPriceForPassenger(x);
        }
        return count;
    }

    public Map<CruiseClassb, Integer> countPassengerByClass() {
        Map<CruiseClassb, Integer> result = new HashMap<>();
        for (Passengerb x : passengers) {
            if (result.containsKey(x.getCruiseClass())) {
                result.put(x.getCruiseClass(), result.get(x.getCruiseClass()) + 1);
            } else {
                result.put(x.getCruiseClass(), 1);
            }

        }
        return result;
    }
}

package exam03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers=new ArrayList<>();

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

    public Passenger bookPassenger(Passenger passenger){
        if(passengers==null || boat.getMaxPassengers()>passengers.size()){
            passengers.add(passenger);
        } else throw new IllegalArgumentException();
        return passenger;
    }

    public double getPriceForPassenger(Passenger passenger){
        for(Passenger p:passengers){
            if (p.getName().equals(passenger.getName())){
                return basicPrice*p.getCruiseClass().;
            }
        }
        return 0.0;
    }
}

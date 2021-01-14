package week11d02;

import java.util.ArrayList;
import java.util.List;

public class Courier {

    private List<Ride> rides = new ArrayList<>();

    public List<Ride> getRides() {
        return rides;
    }

    public void addRide(Ride adds) {
        if (rides == null || rides.size() == 0) {
            rides.add(adds);
            return;
        }
        if (adds.getDay() < rides.get(rides.size() - 1).getDay()) {
            throw new IllegalArgumentException("Korábbi nap");
        }
        if (adds.getRound() > rides.get(rides.size() - 1).getRound() ||
                adds.getDay() > rides.get(rides.size() - 1).getDay()) {
            rides.add(adds);
        } else throw new IllegalArgumentException("Korábbi fuvar");

    }

    public int nonWork() {

        for (int i = 1; i < rides.size(); i++) {

            if ((rides.get(i).getDay() - rides.get(i - 1).getDay()) > 1) {

                return rides.get(i).getDay() - 1;
            }
        }
        return 0;
    }
}

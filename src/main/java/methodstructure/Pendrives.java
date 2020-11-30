package methodstructure;

import java.util.List;

public class Pendrives {


    public Pendrive best(List<Pendrive> pndr) {
        Pendrive lowest= pndr.get(0);
        for (int i = 0; i < pndr.size(); i++) {
            if (lowest.comparePricePerCapacity(pndr.get(i)) > 0) {
                lowest = pndr.get(i);
            }
        }
        return lowest;
    }

    public Pendrive cheapest(List<Pendrive> pndr) {
        Pendrive lowest= pndr.get(0);
        for (int i = 0; i < pndr.size(); i++) {
            if (pndr.get(i).cheaperThan(lowest)) {
                lowest = pndr.get(i);
            }
        }
        return lowest;
    }

    public void risePriceWhereCapacity(List<Pendrive> pndr, int percent, int capacity) {
        for(Pendrive pnd: pndr){
            if (pnd.getCapacity() == capacity) {
                pnd.risePrice(percent);
            }
        }
    }

}
package immutable;

import java.util.ArrayList;
import java.util.List;

public class SpaceAgency {

    List<Satellite> satellites = new ArrayList<>();

    public void registerSatellite(Satellite sat){

        if (sat == null){
            throw new NullPointerException ("Parameter must not be null!");
        }
        satellites.add(sat);
    }

    //public String toString(){
    //    String sats = "[";
    //    for (Satellite sat: satellites){
    //        sats = sats +sat.toString() + ", ";
    //    }
    //    return sats.substring(0, sats.length()-2) + "]";
    //}

    public String toString(){
        return satellites.toString();
    }

    private Boolean isEmpty(String text){
        if (text == null || text.isBlank()) {
            return true;
        }
        return false;
    }

    public Satellite findSatelliteByRegisterIdent(String satID){
        if (isEmpty(satID)){
            throw new IllegalArgumentException ("Register ident must not be empty!");
        }
        for (Satellite sat: satellites){
            if (satID.equals(sat.getSatID())){
                return sat;
            }
        }
        throw new IllegalArgumentException ("Satellite with the given registration cannot be found!" + satID);
    }
}

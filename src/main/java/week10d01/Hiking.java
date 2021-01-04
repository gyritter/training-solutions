package week10d01;


import java.util.ArrayList;
import java.util.List;

public class Hiking {

    public double getPlusElevation(List<Double> elevations){

        Double summ=0.;
        for(int i=1; i<elevations.size(); i++){
            if (elevations.get(i)>elevations.get(i-1)){
                summ+=elevations.get(i)-elevations.get(i-1);
            }
        }
        return summ;
    }
}

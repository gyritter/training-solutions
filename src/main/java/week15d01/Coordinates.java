package week15d01;

import java.util.Map;
import java.util.TreeMap;

public class Coordinates {


    public Map.Entry<Double, Double> searchMin(Map<Double, Double> coordinates) {
        if (coordinates == null) throw new IllegalArgumentException("Empty data");
        Map.Entry<Double, Double> maxElement = null;
        //double maxValue = Double.MIN_VALUE;

        for (Map.Entry<Double, Double> x : coordinates.entrySet()) {

            if(maxElement==null || x.getValue()>maxElement.getValue()){

                maxElement=x;
            }
            /*if (x.getValue() > maxValue) {
                maxValue = x.getValue();
                maxElement = x;
            }*/

        }
        return maxElement;
    }
}

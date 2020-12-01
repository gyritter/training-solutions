package methodchain;

import java.util.ArrayList;
import java.util.List;

public class Robot {

    private int distance;
    private int azimut;

    private List<NavigationPoint> points = new ArrayList<>();

    public int getDistance() {
        return distance;
    }

    public int getAzimut() {
        return azimut;
    }

    public List<NavigationPoint> getPoints() {
        return points;
    }

    public Robot go (int meter){
        distance = distance + meter;
        return this;
    }

    public Robot rotate(int angle){
        azimut += angle;
        azimut = azimut % 360;
        return this;
    }
    public Robot registerNavigationPoint(){
        this.points.add(new NavigationPoint(this.distance, this.azimut));
        return this;
    }
}

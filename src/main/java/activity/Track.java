package activity;

import java.util.ArrayList;
import java.util.List;

public class Track {

    public List<TrackPoint> trackPoints = new ArrayList();

    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }

    public double getDistance() {
        double sumDist = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            sumDist += trackPoints.get(i - 1).getDistanceFrom(trackPoints.get(i));
        }
        return sumDist;
    }

    public double getFullDecrease() {
        double sumDecrease = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            if (trackPoints.get(i - 1).getElevation() > trackPoints.get(i).getElevation()) {
                sumDecrease += trackPoints.get(i - 1).getElevation() - trackPoints.get(i).getElevation();
            }
        }
        return sumDecrease;
    }

    public double getFullElevation() {
        double sumElevation = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            if (trackPoints.get(i - 1).getElevation() < trackPoints.get(i).getElevation()) {
                sumElevation += trackPoints.get(i).getElevation() - trackPoints.get(i - 1).getElevation();
            }
        }
        return sumElevation;
    }

    public Coordinate findMaximumCoordinate(){
        double lat=-200;
        double lon=-200;
        for(TrackPoint track:trackPoints){
            if (track.getCoordinate().getLatitude()>lat){
                lat=track.getCoordinate().getLatitude();
            }
            if (track.getCoordinate().getLongitude()>lon){
                lon=track.getCoordinate().getLongitude();
            }
        }
        return new Coordinate(lat, lon);
    }

    public Coordinate findMinimumCoordinate(){
        double lat=200;
        double lon=200;
        for(TrackPoint track:trackPoints){
            if (track.getCoordinate().getLatitude()<lat){
                lat=track.getCoordinate().getLatitude();
            }
            if (track.getCoordinate().getLongitude()<lon){
                lon=track.getCoordinate().getLongitude();
            }
        }
        return new Coordinate(lat, lon);
    }

    public double getRectangleArea(){
        Coordinate maxCor=findMaximumCoordinate();
        Coordinate minCor=findMinimumCoordinate();
        Coordinate lUp=new Coordinate(maxCor.getLatitude(), minCor.getLongitude());

        return (maxCor.getLatitude()- minCor.getLatitude())*(maxCor.getLongitude()- minCor.getLongitude());
    }
}

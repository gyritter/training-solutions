package week11d02;

public class Ride {
    private int day;
    private int round;
    private int distance;

    public Ride(int day, int round, int distance) {
        this.day = day;
        this.round = round;
        this.distance = distance;
    }

    public int getDay() {
        return day;
    }

    public int getRound() {
        return round;
    }

    public int getDistance() {
        return distance;
    }
}

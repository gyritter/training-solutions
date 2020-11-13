package Statements;

public class Time {
    private int hour;
    private int min;
    private int sec;

    public Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;

    }
    public int getInMinutes() {
        return hour*60+min;

}

    public int getInSeconds() {
        return (hour*60+min)*60+sec;

    }
    public boolean earlierThen(Time other) {
        int thisTimeInSeconds = this.getInSeconds();
        int otherTimeInSeconds = other.getInSeconds();
        return thisTimeInSeconds < otherTimeInSeconds;
    }

    public String toString() {
        return hour + ":" + min + ":" + sec;
    }
}


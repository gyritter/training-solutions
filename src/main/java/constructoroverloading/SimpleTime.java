package constructoroverloading;

public class SimpleTime {
    private int hours;
    private int minutes;

    public SimpleTime(int hours, int minutes){
        this.hours=hours;
        this.minutes=minutes;
    };
    public SimpleTime(int hours){
        this.hours=hours;
    }
    public SimpleTime(SimpleTime time){
        this.hours=time.getHours();
        this.minutes=time.getMinutes();
    };

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int difference(SimpleTime time){
        return hours*60+minutes-time.getHours()*60-time.getMinutes();
    }
    public String toString(){
return hours + ":" + minutes;

    }
}

package constructoroverloading;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {

    private List<SimpleTime> timeTable = new ArrayList<>();

    public BusTimeTable(List<SimpleTime> timeTable) {
        this.timeTable = timeTable;
    }

    public List<SimpleTime> getTimeTable() {
        return timeTable;
    }

    public BusTimeTable(int firstHour, int lastHour, int everyMinute) {
        int hour = firstHour;
        int minute=0;
        if (everyMinute == 0) everyMinute = 60;
        while (hour<lastHour){
            minute +=everyMinute;
            if (minute>=60){
                minute=minute-60;
                hour++;
            }
            timeTable.add(new SimpleTime(hour, minute));
        }
    }

    public SimpleTime nextBus(SimpleTime actual){
        for(SimpleTime time:timeTable){
            if(time.difference(actual)>0) return time;
        }
        throw new IllegalStateException("No more buses today!");
    }

}

package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceMain {

    public static void main(String[] args) {
        Performance perf= new Performance(LocalDate.of(2000, 05,05), "Sting", LocalTime.of(18,00), LocalTime.of(20,00));

        System.out.println(perf.getArtist() +": " +  perf.getDate() + " " + perf.getStartTime() + " " + perf.getEndTime());
    }

}

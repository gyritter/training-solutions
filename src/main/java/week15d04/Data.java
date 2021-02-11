package week15d04;

import org.jetbrains.annotations.NotNull;

public class Data implements Comparable <Data>{

    private String week;
    private int cases;


    public String getWeek() {
        return week;
    }

    public int getCases() {
        return cases;
    }

    public Data(String week, int cases) {
        this.week = week;
        this.cases = cases;

    }

    @Override
    public String toString() {
        return "Data{" +
                "week='" + week + '\'' +
                ", cases=" + cases +
                '}';
    }

    @Override
    public int compareTo(@NotNull Data o) {
        return o.cases-this.cases;
    }
}

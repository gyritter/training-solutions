package week13d03;

public class Schedules {

    private String name;
    private String subject;
    private String group;
    private int hours;

    public Schedules(String name, String subject, String group, int hours) {
        this.name = name;
        this.subject = subject;
        this.group=group;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public int getHours() {
        return hours;
    }
}

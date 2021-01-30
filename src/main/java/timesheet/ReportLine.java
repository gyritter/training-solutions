package timesheet;

public class ReportLine {

    private Project project;
    private long time;

    public ReportLine(Project name, long time) {
        this.project = name;
        this.time = time;
    }

    public Project getProject() {
        return project;
    }

    public long getTime() {
        return time;
    }


    public void addTime(long adds){

        this.time=this.getTime()+adds;
    }
}

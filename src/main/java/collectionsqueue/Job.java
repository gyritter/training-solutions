package collectionsqueue;

public class Job implements Comparable<Job> {

    private final int priority; // 1 - 10 skálán osztályozzuk a prioritást
    private final String jobDescription;
    private final boolean urgent; // minden olyan job esetén true, ahol a prioritás < 5

    public Job(int priority, String jobDescription) {
        if (priority<1 || priority>10){
            throw new IllegalArgumentException("The priority out of borders");
        }
        this.priority = priority;
        this.jobDescription = jobDescription;
        if (priority<5){
            this.urgent = true;
        } else this.urgent = false;
    }

    public int getPriority() {
        return priority;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public boolean isUrgent() {
        return urgent;
    }

    @Override
    public int compareTo(Job o) {
        return this.priority - o.priority;
    }
}

package week07d04;

import java.time.LocalDate;

public class Lab {

    private String title;
    private boolean completed;
    private LocalDate completedAt;

    public Lab(String title) {
        this.title = title;
        this.completed = false;
    }


    public Lab(String title, LocalDate completedAt) {
        this.title = title;
        this.completedAt = completedAt;
        this.completed = true;
    }

    public void complete (LocalDate date) {
        this.completedAt = date;
        this.completed = true;
    }

    public LocalDate getCompletedAt() {
        return completedAt;
    }

    public Lab(String title, boolean completed, LocalDate completedAt) {
        this.title = title;
        this.completed = completed;
        this.completedAt = completedAt;
    }

    public void complete () {
        this.completedAt = LocalDate.now();
        this.completed = true;
    }

    public boolean isCompleted() {
        return completed;
    }

    public String toString() {
        if (completed) {
            return title + " completed at: " +completedAt.getYear()+":"+completedAt.getMonth()+":"+completedAt.getDayOfMonth();

        }
        return title + " Not yet completed";
    }

    public String getTitle() {
        return title;
    }

}


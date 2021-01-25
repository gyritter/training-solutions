package timesheet;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class TimeSheetItem {

    private Employee employee;
    private Project project;
    private LocalDateTime beginDate;
    private LocalDateTime endDate;

    public Employee getEmployee() {
        return employee;
    }

    public Project getProject() {
        return project;
    }

    public LocalDateTime getBeginDate() {
        return beginDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public TimeSheetItem(Employee employee, Project project, LocalDateTime beginDate, LocalDateTime endDate) {
        this.employee = employee;
        this.project = project;

        if (beginDate.toLocalDate().equals(endDate.toLocalDate()) && endDate.isAfter(beginDate)) {
            this.beginDate = beginDate;
            this.endDate = endDate;
        } else throw new IllegalArgumentException("Dates are invalid");
    }

    public long hoursBetweenDates() {

        return Duration.between(beginDate, endDate).toHours();

    }
}

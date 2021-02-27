package x.canoe;

import java.time.Duration;
import java.time.LocalDateTime;

public class CanoeRental implements Comparable <CanoeRental>{

    private String name;
    private CanoeType canoeType;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public CanoeRental(String name, CanoeType canoeType, LocalDateTime startTime, LocalDateTime endTime) {
        this.name = name;
        this.canoeType = canoeType;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getName() {
        return name;
    }

    public CanoeType getCanoeType() {
        return canoeType;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public double calculateRentalSum() {
        Duration duration = Duration.between(startTime, endTime);
        return 5000.0*(duration.toHoursPart());
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(CanoeRental o) {
        return this.startTime.compareTo(o.getStartTime());
    }
}

package covid;

import java.time.LocalDateTime;

public class Vaccinations {
    Long vaccination_id;
    Long citizen_id;
    LocalDateTime vaccination_date;
    String vaccination_status;
    String vaccination_note;
    String vaccination_type;

    public Vaccinations(Long vaccination_id, Long citizen_id, LocalDateTime vaccination_date, String vaccination_status, String vaccination_note, String vaccination_type) {
        this.vaccination_id = vaccination_id;
        this.citizen_id = citizen_id;
        this.vaccination_date = vaccination_date;
        this.vaccination_status = vaccination_status;
        this.vaccination_note = vaccination_note;
        this.vaccination_type = vaccination_type;
    }

    public Long getCitizen_id() {
        return citizen_id;
    }

    public LocalDateTime getVaccination_date() {
        return vaccination_date;
    }

    public String getVaccination_status() {
        return vaccination_status;
    }

    public String getVaccination_note() {
        return vaccination_note;
    }

    public String getVaccination_type() {
        return vaccination_type;
    }

    public Long getVaccination_id() {
        return vaccination_id;
    }

    @Override
    public String toString() {
        return "Vaccinations{" +
                "vaccination_id=" + vaccination_id +
                ", citizen_id=" + citizen_id +
                ", vaccination_date=" + vaccination_date +
                ", vaccination_status='" + vaccination_status + '\'' +
                ", vaccination_note='" + vaccination_note + '\'' +
                ", vaccination_type='" + vaccination_type + '\'' +
                '}';
    }
}

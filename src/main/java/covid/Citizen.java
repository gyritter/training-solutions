package covid;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;

public class Citizen implements Comparable<Citizen>{

    private long citizen_id;
    private String citizen_name;
    private String zip;
    private long age;
    private String email;
    private String taj;
    private long  number_of_vaccination;
    private LocalDateTime last_vaccination_date;


    public Citizen(long citizen_id,
                   String citizen_name,
                   String zip,
                   long age,
                   String email,
                   String taj,
                   long number_of_vaccination,
                   LocalDateTime last_vaccination_date) {
        this.citizen_id = citizen_id;
        this.citizen_name = citizen_name;
        this.zip = zip;
        this.age = age;
        this.email = email;
        this.taj = taj;
        this.number_of_vaccination = number_of_vaccination;
        this.last_vaccination_date = last_vaccination_date;
    }

    public Citizen(String citizen_name, String zip,
                   long age,
                   String email,
                   String taj,
                   long number_of_vaccination,
                   LocalDateTime last_vaccination_date) {
        this.citizen_name = citizen_name;
        this.zip = zip;
        this.age = age;
        this.email = email;
        this.taj = taj;
        this.number_of_vaccination = number_of_vaccination;
        this.last_vaccination_date = last_vaccination_date;
    }

    public long getId() {
        return citizen_id;
    }

    public String getCitizen_name() {
        return citizen_name;
    }

    public String getZip() {
        return zip;
    }

    public long getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getTaj() {
        return taj;
    }

    public long getNumber_of_vaccination() {
        return number_of_vaccination;
    }

    public LocalDateTime getLast_vaccination_date() {
        return last_vaccination_date;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "citizen_id=" + citizen_id +
                ", citizen_name='" + citizen_name + '\'' +
                ", zip='" + zip + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", taj='" + taj + '\'' +
                ", number_of_vaccination=" + number_of_vaccination +
                ", last_vaccination_date=" + last_vaccination_date +
                '}';
    }

    @Override
    public int compareTo(@NotNull Citizen other) {
        String egy=Integer.toString((int) this.age);
        String ket=Integer.toString((int) other.age);
        return egy.compareTo(ket);
    }


}

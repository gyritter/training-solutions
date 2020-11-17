package stringbasic;

import java.time.LocalDate;

public class Pet {
    private String name;
    private LocalDate birth;
    private String regnumber;
    private Gender gender;



    public Pet(String name, LocalDate birth,  String regnumber, Gender gender) {
        this.name = name;
        this.birth = birth;
        this.regnumber = regnumber;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public String getRegnumber() {
        return regnumber;
    }

    public Enum getGender() {
        return gender;
    }
}

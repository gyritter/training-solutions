package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Tutor {

    private String name;

    private List<Subject> taughtSubjects = new ArrayList<>();

    public Tutor(String name, List taughtSubjects) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("The name should be filled with valid data");
        } else {
        this.name = name;}

        this.taughtSubjects = taughtSubjects;
    }

    private boolean isEmpty(String name) {
        if (name == null || name.length() == 0) {
            return true;
        } else return false;
    }

    public String getName() {
        return name;
    }

    public List getTaughtSubjects() {
        return taughtSubjects;
    }

    public Boolean tutorTeachingSubject(Subject subject) {

        Boolean teach = false;

        for (Subject taughtSubject : taughtSubjects) {
            if (taughtSubject.getSubjectName().equals(subject.getSubjectName()))
                teach = true;
            }


        return teach;
    }
}


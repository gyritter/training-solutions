package schoolrecords;

import algorithmssum.TransactionOperation;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Mark> marks = new ArrayList<>();

    public Student(String name, List<Mark> marks) {

        if (isEmpty(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        this.name = name;

        if (marks == null) {
            throw new NullPointerException("Mark must not be null!");
        }
        this.marks = marks;}

    public boolean isEmpty(String str) {
        if ((str == null) || (str.length() <1)) {
            return true;
        } else return false;
    }

    public Student(String name) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        } else {
            this.name = name;}
   }

    public String getName() {
        return name;
    }

    public List<Mark> getMarks() {
        return marks;
    }

    public Double calculateAverage() {

        Double average = 0.0;
        double count = 0.0;
        MarkType jegy;

        for (Mark mark: marks) {
            jegy = mark.getMarkType();
            switch (jegy) {
                case A:
                    average = average + 5;
                    break;
                case B:
                    average = average + 4;
                    break;
                case C:
                    average = average + 3;
                    break;
                case D:
                    average = average + 2;
                    break;
                case F:
                    average = average + 1;
                    break;
            }
            count = count + 1.0;
        }

        if (count < 1) {
            average = 0.0;
        } else average = Double.valueOf(Math.round(100*(average / count)))/100;

        return average;
    }

    public Double calculateSubjectAverage(Subject subject) {

        String sub1 = subject.getSubjectName();

        Double average = 0.0;
        Double subjectAverage = 0.0;
        double count = 0.0;
        MarkType jegy;

        for (Mark mark: marks) {
            jegy = mark.getMarkType();
            String sub2 = mark.getSubject().getSubjectName();
            if (sub2.equals(sub1)) {
                switch (jegy) {
                    case A:
                        average = average + 5;
                        break;
                    case B:
                        average = average + 4;
                        break;
                    case C:
                        average = average + 3;
                        break;
                    case D:
                        average = average + 2;
                        break;
                    case F:
                        average = average + 1;
                        break;
                }
                count = count + 1.0;
            }
        }

            if (count < 1) {
                subjectAverage = 0.0;
            } else subjectAverage = Double.valueOf(Math.round(100*(average / count)))/100;

        return subjectAverage;
    }

    public void grading(Mark mark) {
        marks.add(mark);
    }

    public String toString() {

        MarkType jegy;

        String y = name + " marks: ";
        String x = null;

        for (Mark mark: marks) {
            jegy = mark.getMarkType();
            x = y + mark.getSubject().getSubjectName() + ": " + jegy.getDescription(jegy);
            return x;

        }
        return x;
    }

}

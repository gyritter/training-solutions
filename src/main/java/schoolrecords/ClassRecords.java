package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {

    private String className;
    private Random rnd;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random rnd) {
        this.className = className;
        this.rnd = rnd;
    }

    public String getClassName() {
        return className;
    }

    public Random getRnd() {
        return rnd;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Boolean addStudent(Student student) {

        Boolean exist = true;

        String newName = student.getName();

        for (Student stud: students) {
            if (stud.getName().equals(newName)) exist = false;
        }

        if (exist) students.add(student);

        return exist;
    }
    public Double calculateClassAverage() {

        List<Mark> marks = new ArrayList<>();
        Double average = 0.0;
        Double count = 0.0;
        MarkType jegy;

        if (students.size() <1) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
            //return average;
        }

        for (Student stud: students) {
            marks = stud.getMarks();
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
                count=count + 1.0;
            }
        }
        Double classAverage;

        if (count < 1.0) {
            classAverage = 0.0;
            throw new ArithmeticException("No marks present, average calculation aborted!");
        } else classAverage = Double.valueOf(Math.round(100*(average / count)))/100;

        return classAverage;
    }

    public Double calculateClassAverageBySubject(Subject subject) {

        String sub = subject.getSubjectName();
        List<Mark> marks = new ArrayList<>();
        Double average = 0.0;
        Double count = 0.0;
        MarkType jegy;

        for (Student stud: students) {
            marks = stud.getMarks();
            for (Mark mark: marks) {
                if (sub.equals(mark.getSubject().getSubjectName())) {
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
            }
        }

        Double subjectAverage;

        if (count < 1.0) {
            subjectAverage = 0.0;
            throw new ArithmeticException("No marks present, average calculation aborted!");
        } else subjectAverage = Double.valueOf(Math.round(100*(average / count)))/100;

        return subjectAverage;
    }

    public Student findStudentByName(String studentName) {

        Student found = new Student("nincs");

        for (Student stud: students) {
            if (stud.getName().equals(studentName)) {
                found = stud;
            }
        }
        return found;
    }

    public String listStudentNames() {

        String names = "";

        for (Student stud: students) {
            names = names + stud.getName() + ", ";
            }

        return  names.substring(0, names.length()-2);
    }

    public List listStudyResults (){

        List studyResultsByName = new ArrayList();

        Double average;

        for (Student stud: students) {

            average = stud.calculateAverage();

            StudyResultByName result = new StudyResultByName(stud.getName(), average);
            studyResultsByName.add(result);
        }

        return studyResultsByName;
    }

    public Boolean removeStudent(Student student) {

        Boolean removed = false;

        String newName = student.getName();

        for (Student stud: students) {
            if (stud.getName().equals(newName)) removed = true;
        }

        if (removed) students.remove(student);

        return removed;
    }
    public Student  repetition() {
        Student stud = new Student("nincs");
        stud = students.get(rnd.nextInt(students.size()));
        return stud;
    }

}

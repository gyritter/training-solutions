package schoolrecords;

public class StudyResultByName {

    private String studentName;
    private Double studyAverage;

    public StudyResultByName(String studentName, Double studyAverage) {

//        if (isEmpty(studentName)) {
//            throw new IllegalArgumentException("The name should be filled with valid data");
//        } else {
//            this.studentName = studentName;}

        this.studentName = studentName;

        this.studyAverage = studyAverage;
    }

    private boolean isEmpty(String name) {
        if ((name == null) || (name.length() == 0)) {
            return false;
        } else return true;
    }

    public String getStudentName() {
        return studentName;
    }

    public Double getStudyAverage() {
        return studyAverage;
    }
}

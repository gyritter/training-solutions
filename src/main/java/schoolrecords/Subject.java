package schoolrecords;

public class Subject {

    private String subjectName;

    public Subject(String subjectName) {
        if (isEmpty(subjectName)) {
            throw new IllegalArgumentException("The name should be filled with valid data");
        } else {
            this.subjectName = subjectName;}
    }

    private boolean isEmpty(String name) {
        if (name == null || name.length() == 0) {
            return true;
        } else return false;
    }


    public String getSubjectName() {
        return subjectName;
    }


}

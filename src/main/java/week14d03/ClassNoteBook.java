package week14d03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassNoteBook {

    private List<Student> students;

    public ClassNoteBook(List<Student> students) {
        this.students = students;
    }



    public List<Student> sortNotebook() {
        List<Student> result = new ArrayList<>();
        for (Student s : students) {
            result.add(new Student(s));//a copykonstruktor felhasználásával
            // a másolaton rendez sorba
        }
        Collections.sort(result);
        return result;

    }

    public static void main(String[] args) {
        List<Student> s = new ArrayList<>();
        s.add(new Student("John"));
        s.add(new Student("Bari"));
        s.add(new Student("Kata"));
        s.add(new Student("Bálint"));
        ClassNoteBook classNoteBook = new ClassNoteBook(s);
       /* StringBuilder sb = new StringBuilder();
        for(Student x:s){
            sb.append(x.getName()+" ");
        }
        sb.append("\n");

        for(Student x:s2){
            sb.append(x.getName()+" ");
        }
        System.out.println(sb.toString());*/
        System.out.println(s.toString());
        List<Student> s2 = new ArrayList<>();
        s2 = classNoteBook.sortNotebook();
        System.out.println(s2.toString());
    }

}

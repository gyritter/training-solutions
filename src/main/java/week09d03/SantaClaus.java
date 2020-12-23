package week09d03;


import java.util.ArrayList;
import java.util.List;

public class SantaClaus {
    private List<Person> persons= new ArrayList<>();

    public SantaClaus(List<Person> persons) {
        this.persons = persons;
    }
    public void getThroughChimneys(){
        for (Person x:persons){
            if(!(x.getAge()>14)){
                x.setPresent(x.getAge());
            }

        }
    }
    public String toString(Person person){
       return person.getName() + " kor: "+person.getAge() + "ajándék: " + person.getPresent();
    }
}

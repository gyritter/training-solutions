package week09d03;

import java.util.ArrayList;
import java.util.List;

public class SantaClausTest {

    public static void main(String[] args) {
        List<Person> persons= new ArrayList<>();
        persons.add(new Person("Viktor Nikiforov", 15));
        persons.add(new Person("Buta Nándor", 85));
        persons.add(new Person("Uenoyama Ritsuka", 16));
        persons.add(new Person("Dúr Renáta", 45));
        persons.add(new Person("Katsuki Yuri", 3));
        persons.add(new Person("Mafuyu Sato", 14));
        SantaClaus santaClaus= new SantaClaus(persons);
        santaClaus.getThroughChimneys();
        for(Person x:persons){
            System.out.println(santaClaus.toString(x));
        }
    }

}

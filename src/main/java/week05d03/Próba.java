package week05d03;

import java.util.ArrayList;
import java.util.List;

public class Próba {

    public  int próba(List<String> words) {

        int counter = 0;

        for (String initial: words) {
            if ('A' == ((initial.toUpperCase().charAt(0)))) {
                counter += 1;
            }
        }
        return counter;
    }
    public static void main(String[] args) {

        Próba test = new Próba();

      List<String> words = new ArrayList<>();

       words.add("Alma");
       words.add("tök");
       words.add("andrea");
       words.add("bivaly");

      System.out.println(test.próba(words));

     }
}

package week05d03;

import java.util.ArrayList;
import java.util.List;

public class Próba {
    public static int próba(List<String> words) {

        int counter = 0;

        for (String initial : words) {
            if ("A".equals(initial.charAt(0)) || "a".equals(initial.charAt(0))) counter += counter;
        }
        return counter;
    }
    public static void main(String[] args) {

      List<String> words = new ArrayList<>();

      words.add("Alma");
      words.add("tök");
      words.add("andrea");
      words.add("bivaly");

      System.out.println(próba(words));

     }
}

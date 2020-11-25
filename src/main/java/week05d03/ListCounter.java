package week05d03;

import java.util.ArrayList;
import java.util.List;

public class ListCounter {

    private static int ListCounter(List<String> words){

        int count = 0;
        String first = "";

        for (String word: words) {
            first = word.substring(0, 1).toUpperCase();
            if ("A".equals(first)){
                count=count + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();

        System.out.println(ListCounter(words));

        words.add("barack");
        words.add("körte");
        words.add("álkörmös");
        words.add("meggy");
        words.add("cseresznye");

        System.out.println(ListCounter(words));

        words.add("Alma");
        words.add("almabor");

        System.out.println(ListCounter(words));
    }
}

package week05d03;

import java.util.List;

public class ListCounter {

    public int listCounter(List<String> words){

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
}

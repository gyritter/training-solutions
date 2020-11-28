package week05d03;

import java.util.List;

public class ListCounter2 {

    public int startsWithACounter(List<String> words){

        int counter=0;
        for (String s: words){

            if(s.toUpperCase().startsWith("A")){
                counter++;
            }
        }
        return counter;
    }
}

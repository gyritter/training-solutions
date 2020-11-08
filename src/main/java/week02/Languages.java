package week02;

import java.util.ArrayList;
import java.util.List;

public class Languages {
    public static void main(String[] args) {

    List<String> lang=new ArrayList<>();
    lang.add("Java");
    lang.add("Python");
    lang.add("JavaScript");

        for (String nyelv: lang){
            if (nyelv.length()>5){
            System.out.println(nyelv);



        }
        }
    }
}



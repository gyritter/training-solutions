package x;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Languages {


    public static void main(String[] args) {
     List<String> nyelvek =Arrays.asList("Java", "Python", "JavaScript");
        for (String lang:nyelvek){
            if (lang.length()>5){
                System.out.println(lang);
            }
        }
    }
}

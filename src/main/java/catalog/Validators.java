package catalog;

import java.util.List;

public class Validators {

    public static boolean isBlank(String text){
        if(text==null || text.length()==0){
            return true;
        } else return false;
    }

    public static boolean isEmpty(List<String> text){
        if(text==null || text.size()==0){
            return true;
        } else return false;
    }
}

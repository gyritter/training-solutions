package week06d01;

import java.util.List;

public class ListSelector {



    public String listSelector(List<String> list) {

        if (list == null) {
            throw new NullPointerException("Üres lista nem elfogadható!");
        }
        StringBuilder text = new StringBuilder();

            if (!list.isEmpty()) {
             text.append("[").append(list.get(0));
             for(int i=2;i<list.size();i+=2){
                 text.append(",").append(list.get(i));
             }
            text.append("]");

        }
        return text.toString();
    }
}

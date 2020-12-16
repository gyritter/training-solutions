package week08d03;


import java.util.ArrayList;
import java.util.List;

public class StringLists {

    public List stringListsUnion(List<String> first, List<String> second) {
        List<String> result = new ArrayList<>(first.size() + second.size());
        boolean cont;
        int i;
        for (String a:first){
            result.add(a);
        }
        String a;
        int kezd=0;
        for (i = kezd; i < second.size(); i++) {
            cont = true;
            a = second.get(i);
            for (String b : result) {
                if (a.equals(b)) {
                    cont = false;
                    break;
                }
            }
            if (cont) result.add(a);
        }
        return result;
    }
}



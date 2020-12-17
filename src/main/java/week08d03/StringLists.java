package week08d03;


import java.util.ArrayList;
import java.util.List;

public class StringLists {

    public List stringListsUnion(List<String> first, List<String> second) {
        List<String> result = new ArrayList<>();
        boolean cont;
        int i;
        result.add(first.get(0));

        for (String a : first) {
            if (!result.contains(a)) result.add(a);
        }
        for (String a : second) {
            if (!result.contains(a)) result.add(a);

        }
        return result;
    }
}




package week12d03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberStat {

    public int onceInstance(List<Integer> example) {
        if (example.size() == 0) throw new IllegalArgumentException();
        int result = 0;
        Collections.sort(example);
        for (int i = 1; i < example.size(); i++) {
            if (!((example.get(i - 1) - example.get(i)) == 0)) {
                result = example.get(i);
            }
        }
        return result;
    }
}



package objectclass;

import java.util.ArrayList;
import java.util.List;

public class SimpleBag {

    private List<Object> items = new ArrayList<>();

    int cursor = -1;

    public void putItem(Object item) {
        items.add(item);
    }

    public boolean isEmpty() {
        if (items == null || items.size() == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return items.size();
    }

    public void beforeFirst() {
        cursor = -1;
    }

    public boolean hasNext() {
        boolean x = !(isEmpty() || cursor >= items.size()-1);
        return x;
        }

    public Object next() {
        cursor++;
        return items.get(cursor);
    }

    public boolean contains(Object item) {
        return items.contains(item);
    }

    public int getCursor() {
        return cursor;
    }

}
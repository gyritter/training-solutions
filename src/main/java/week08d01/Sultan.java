package week08d01;

import java.util.ArrayList;
import java.util.List;

public class Sultan {

    public void openDoors() {

        List<Integer> cells = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            cells.add(1);
        }
        for (int i = 2; i < 101; i++) {
            for (int j = i - 1; j < 100; j += i) {
                cells.set(j, (cells.get(j) + 1) % 2);
            }
        }
        int count =0;
        System.out.println("A nyitott cellák:");
        for (int i = 0; i < 100; i++) {
            if (cells.get(i) == 1) {
                System.out.println("Cellaszám " + (i+1));
                count++;
            }
        }
        System.out.println("Összesen: " + count);

    }

    public static void main(String[] args) {
        Sultan sultan = new Sultan();
        sultan.openDoors();
    }
}

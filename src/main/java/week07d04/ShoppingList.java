package week07d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ShoppingList {

    public long calculateSum(String fileName) {
        long sum = 0;
        try {
            List<String> items = Files.readAllLines(Path.of(fileName));
            for (String item : items) {
                int darab1 = item.indexOf(';');
                int darab2 = item.indexOf(';', darab1 + 1);
                int darab = Integer.parseInt(item.substring(darab1 + 1, darab2));
                int ár = Integer.parseInt(item.substring(darab2 + 1));
                sum += darab * ár;
            }
        } catch (IOException ioe) {

            throw new IllegalStateException("Can not read file", ioe);
        }
        return sum;
    }
}


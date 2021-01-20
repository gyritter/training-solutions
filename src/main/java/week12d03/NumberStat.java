package week12d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberStat {

    private List<Integer> numbers=new ArrayList<>();

    public int onceInstance() {
        List<Integer> example = new ArrayList<>(numbers);
        if (example.isEmpty()) throw new IllegalArgumentException("List is too short");
        if (example.size() == 1) {
            return example.get(0);
        }
        Collections.sort(example);
        if (example.size() == 2) {
            if (example.get(0) < example.get(1)) {
                return example.get(0);
            }
        }
        for (int i = 1; i < example.size() - 2; i++) {
            if ((example.get(i - 1) != example.get(i)) && example.get(i) != example.get(i + 1)) {
                return example.get(i);
            }
        }
        if (example.get(example.size() - 1) > example.get(example.size() - 2)) {
            return example.get(example.size() - 1);
        }

        throw new IllegalArgumentException("List is invalid");
    }

    public void readFromFile(String filename) {
        Path path = Path.of(filename);
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] temp = line.split(",");
                addLine(temp);

            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not read file", ioe);
        }
    }

    private void addLine(String[] temp){
        for (String s:temp){
            numbers.add(Integer.parseInt(s));
        }
    }

}




package week15d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Statistics {

    private List<Data> datas = new ArrayList<>();

    public void readFromFile(BufferedReader br) {
        try {

            String line;
            br.readLine(); //a fejlécert eldobja, ezt csak beolvassa de nem dolgozza fel
            while ((line = br.readLine()) != null) {
                if (line.contains("Hungary")) {
                    datas.add(processLine(line));
                }
            }

        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not read from file");
        }

    }

    private Data processLine(String line) {
        String[] temp = line.split(",");
        int numberOfCases = Integer.parseInt(temp[2]);
        return new Data(temp[1], numberOfCases);
    }

    public List<String> findThreeMax(int weekNumber) {
        List<Data> sorted = new ArrayList<>(datas);

        Collections.sort(sorted);
        List<String> result = new ArrayList<>();
        if (weekNumber>sorted.size()){
            weekNumber=sorted.size();
        }
        for (int i = 0; i < weekNumber; i++) {
            result.add(sorted.get(i).getWeek());
        }
        return result;
    }

    public static void main(String[] args) {

        Statistics statistics = new Statistics();
        try (BufferedReader br = Files.newBufferedReader(Path.of("data.csv"))) {

            statistics.readFromFile(br);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not find file");
        }
        System.out.println(statistics.findThreeMax(3));
    }
}

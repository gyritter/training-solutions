package exam03retake02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.Collator;
import java.util.*;

public class BalatonStorm {
    private List<String> temp = new ArrayList<>();

    private List<String> result = new ArrayList<>();

    public List<String> getStationsInStorm(BufferedReader reader) throws IOException {

        String line;
        while ((line = reader.readLine()) != null) {
            temp.add(line.trim());
        }

        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i).contains("level")) {

                String level = temp.get(i).substring(9, 10);

                if (level.equals("3")) {

                    String stationPre = temp.get(i - 4);
                    String[] divide = stationPre.split(": ");
                    String station = divide[1].substring(1, divide[1].length() - 2);
                    result.add(station);
                }

            }

        }

        Collections.sort(result, Collator.getInstance(new Locale("hu", "HU")));
        System.out.println(result);
        return result;

    }
}






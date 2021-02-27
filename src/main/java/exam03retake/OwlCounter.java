package exam03retake;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class OwlCounter {

    Map<String, Integer> result = new HashMap<>();

    public Map<String, Integer> readFromFile(BufferedReader reader) throws IOException {

        String line;
        while ((line = reader.readLine()) != null) {
            if(line.length()>2) {
                String[] parts = line.split("=");
                result.put(parts[0], Integer.parseInt(parts[1]));
            }
        }
        return result;
    }

    public int getNumberOfOwls(String name) {
        for (Map.Entry entry : result.entrySet()) {
            if (entry.getKey().equals(name)) {
                return (int) entry.getValue();
            }
        }
        throw new IllegalArgumentException();

    }

}

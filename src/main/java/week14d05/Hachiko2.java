package week14d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class Hachiko2 {

    private Map<String, Integer> wordCounter(BufferedReader br, String... words) {

        Map<String, Integer> result;

        try {
            result = processLine(br, words);
        } catch (IOException e) {
            throw new IllegalArgumentException("mibajodvan", e);
        }
        return result;
    }

    private Map<String, Integer> processLine(BufferedReader br, String[] words) throws IOException {
        Map<String, Integer> result = loadMap(words);
        String line;
        while ((line = br.readLine()) != null) {
            for (String word : words) {
                modifyMap(result, line, word);
            }
        }
        return result;
    }

    private Map<String, Integer> loadMap(String[] words) {
        Map<String, Integer> result = new HashMap<>();
        for (String s : words) {
            result.put(s, 0);
        }
        return result;
    }

    private void modifyMap(Map<String, Integer> result, String line, String word) {
        if (line.contains(word)) {
            int count = result.get(word);
            result.put(word, count + 1);
        }
    }

    public static void main(String[] args) {
        Hachiko2 hachiko2 = new Hachiko2();
        try (BufferedReader br = Files.newBufferedReader(Path.of("Hachiko.srt"))) {

            System.out.println(hachiko2.wordCounter(br, "Hachiko", "pályaudvar", "jó", "haza"));
        } catch (IOException e) {
            throw new IllegalArgumentException("mibajodvan", e);
        }
    }

}


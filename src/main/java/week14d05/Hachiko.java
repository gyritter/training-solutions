package week14d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class Hachiko {

    private Map<String, Integer> wordCounter(BufferedReader br, String... words) {

        Map<String, Integer> result = new HashMap<>();
//feltöltjük a map-et a kulcs értékpárokkal
        for (String s : words) {
            result.put(s, 0);
        }

        String line;
  //soronként beolvassuk a file-t
        try {
            while ((line = br.readLine()) != null) {
            for(String word:words){
                if (line.contains(word)){
                    int count= result.get(word);
                    result.put(word,count+1);
                }
            }
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("mibajodvan", e);
        }

        return result;
    }

    public static void main(String[] args) {
        Hachiko hachiko = new Hachiko();
        try (BufferedReader br = Files.newBufferedReader(Path.of("Hachiko.srt"))) {

            System.out.println(hachiko.wordCounter(br, "Hachiko", "pályaudvar", "jó", "haza"));
        } catch (IOException e) {
            throw new IllegalArgumentException("mibajodvan", e);
        }
    }


}



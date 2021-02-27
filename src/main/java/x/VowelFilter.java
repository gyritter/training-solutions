package x;

import java.io.BufferedReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VowelFilter {

    public String filterVowels(BufferedReader br) {
      List<String> vowels = Arrays.asList("a", "á", "i", "í", "e", "é", "o", "ó", "ö", "ő", "ü", "ű");
        StringBuilder sb = new StringBuilder();
        String line;
        //soronként beolvassuk a file-t
        try {
            while ((line = br.readLine()) != null) {
                char[] word = line.toCharArray();
                for (int i = 0; i < word.length; i++) {
                    if(!(vowels.contains(Character.toString(word[i]).toLowerCase()))){
                        sb=sb.append(word[i]);
                }
            }
                sb.append("\n");

        }
            return sb.toString();
    } catch(
    IOException e)

    {
        throw new IllegalArgumentException("Can not read file", e);
    }
}
        }

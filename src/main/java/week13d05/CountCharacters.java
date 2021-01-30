package week13d05;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Set;

public class CountCharacters {

    public int charCounter (String abc) {
            Set<Character> chars = new HashSet<>();
            char[] charArray = abc.toLowerCase().toCharArray();
            for (char c : charArray) {
                if ('a' <= c && c <= 'z') {
                    chars.add(c);
                }
            }

            return chars.size();
        }

    public static void main(String[] args) {
        CountCharacters countCharacters= new CountCharacters();
        System.out.println(countCharacters.charCounter("almát 121"));
    }
}



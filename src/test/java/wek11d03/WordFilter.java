package wek11d03;

import java.util.ArrayList;
import java.util.List;

public class WordFilter {

    public List<String> wordsWithChar(List<String> words, char c) {

        List<String> result = new ArrayList();

        String s = Character.toString(c);

        for (String word : words) {

            if (word.contains(s)) {

                result.add(word);
            }

        }
        return result;
    }

}

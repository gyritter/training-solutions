package week06d03;

import java.util.Scanner;

public class WordEraser {

    public String eraseWord(String words, String word) {
        String[] temp = words.split(" ");
        StringBuilder newString = new StringBuilder("");
        for(String s:temp){
            if(!s.equals(word)){
                newString.append(s+" ");
            }
        }

        return newString.toString().trim();
    }

    public String eraseWordWithScanner(String words, String word) {
        Scanner scanner=new Scanner(words);

        StringBuilder result = new StringBuilder();

        while (scanner.hasNext()) {
            String s = scanner.next();
            if (!word.equals(s))  {
                result.append(s).append(" ");
            }
        }
        return result.toString().trim();


    }


}


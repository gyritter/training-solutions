package week06d03;

public class WordEraser {

    public String eraseWord(String words, String word){
        String del = word + " ";
        int begin = 0;
        int end = 0;
        int wordLength = word.length() + 2;

        StringBuilder newString = new StringBuilder("");

        while (end>=0) {
            end = words.indexOf(del);
            if (end>0){
                newString.append(words.substring(begin, end));
                begin = end + wordLength;
            }
            newString.append(words.substring(begin));
        }
        return newString.toString();
    }
}


package week05d02;

public class ChangeLetter {

    public String changeVowels(String text){

        int length = text.length();
        String bet;
        String bet2;
        String result="";

        for (int i=0; i<length; i++) {
            bet = text.substring(i, i+1);
            bet2 = bet.toUpperCase();
            if (bet2.equals("A") || bet2.equals("E")  || bet2.equals("I") || bet2.equals("O") || bet2.equals("U")){
                result=result+"*";
            } else result=result+bet;

        }
        return result;
    }
}

package week05d02;

//Megoldás replace-el: időigényes lahat, ha pl a str egy könyv (mindig végigmegy rajta  a ciklus)
public class ChangeLetter3 {
    public static final char[] WOVELS_ARRAY = {'a', 'e', 'i', 'o', 'u'};

    String str;
    public String ChangeWovels2(String str) {
        for (char c : WOVELS_ARRAY) {
            str = str.replace(c, '*');
        }
        return str;
    }
}

package week05d02;
//Felépítem újra a stringet és így ellenőrzöm, hosszbb kód d kevésbé időigényes
public class ChangeLetter2 {
    public static final String WOVELS ="aeiou";
    public String changeWovels (String str){
        str=str.toLowerCase();
        StringBuilder result=new StringBuilder();
        for(int i=0; i<str.length(); i++) {
            String c= str.substring(i,i+1);
            if(WOVELS.contains(c)){
                result.append("*");

            }
            else{
                result.append(c);

            }

        }

        return result.toString();
    }
}

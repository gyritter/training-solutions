package exceptionmulticatch;

public class BinaryStringConverter {

    public boolean[] binaryStringToBooleanArray(String s) {
        if(s.length()<1){
            throw new IllegalArgumentException();
        }
        boolean[] result = new boolean[s.length()];
        char b;
        for (int i = 0; i < s.length(); i++) {
            b = s.charAt(i);
            if (b == '0') {
                result[i] = false;
            } else if (b == '1') {
                result[i] = true;
            } else throw new IllegalArgumentException();
        }
        return result;
    }

    public String booleanArrayToBinaryString(boolean[] boo){
        if(boo.length<1){
            throw new IllegalArgumentException();
        }
        StringBuilder s=new StringBuilder();
        for(boolean b:boo){
            if (b){
                s.append("1");
            }else s.append("0");
        }
        return s.toString();
    }
}

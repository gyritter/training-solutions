package week07d02;

public class DigitSum {

    private String number;

    public int sumOfDigits(int szam) {

        //if (szam == null) {
        //    throw new IllegalArgumentException("The number must not be null!");
       // }

        number=Integer.toString(szam);
        int summ=0;
        for (int i=0; i<number.length(); i++){
            summ=summ+Integer.parseInt(number.substring(i,i+1));
        }
        return summ;
    }
}

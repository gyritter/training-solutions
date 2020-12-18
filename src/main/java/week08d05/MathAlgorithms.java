package week08d05;


public class MathAlgorithms {
    private int gcd = 1;

    public int greatestCommonDivisor(int num1, int num2) {

        if (num1==0 && num2==0) throw new IllegalArgumentException("no solution");
        if (num1==0 || num2==0){
            gcd=num1+num2;
        }
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0)
                gcd = i;
        }
        return gcd;
    }


}


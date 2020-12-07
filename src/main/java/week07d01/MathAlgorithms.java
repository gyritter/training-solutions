package week07d01;

public class MathAlgorithms {
    int x;

    public Boolean isPrime(int x) {
        if (x < 1) throw new IllegalArgumentException("Only positive numbers are taken");
        if (x>1 && x<=3) return true;
        if (x == 1 || x%2 ==0) return false;
        int divisers =0;
        for (int i=3; i<x; i++){
            if (x%i==0) divisers++;
        }

        if (divisers==0) {
            return true;
        } else {
            return false;
        }


    }

}

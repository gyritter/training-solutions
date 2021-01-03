package week07d01;

public class Fibonacci {

    public long fib(int n){
        if( n<1) return 0;
        if (n<3) return 1;
        long fib1=1;
        long fib2=1;
        long fib3=1;

        for (int i=3; i<=n; i++){
            fib3=fib1+fib2;
            fib1=fib2;
        fib2=fib3;
        }
        return fib2;
    }
}

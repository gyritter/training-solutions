package week07d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest{

    @Test

    public void fibonacciTest (){
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(13,fibonacci.fib(7));
    }
}

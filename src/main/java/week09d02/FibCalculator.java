package week09d02;

public class FibCalculator {


    public long sumEvens(int bound) {
        long number1 = 0;
        long number2 = 1;
        long sum;

        System.out.print(number1);
        long total = 0;


        do {
            if (number2 % 2 == 0) total += number2;
            sum = number1 + number2;
            System.out.print(", " + number2);
            number1 = number2;
            number2 = sum;

        } while (sum < bound);

        return total;
    }

    public static void main(String[] args) {
        FibCalculator fibCalculator = new FibCalculator();
        System.out.println("\naz összeg: " + fibCalculator.sumEvens(100));
    }
}

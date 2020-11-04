import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number1?");
        int number1 = scanner.nextInt();
        scanner .nextLine();

        System.out.println("Number2?");
        int number2 = scanner.nextInt();
        scanner .nextLine();
        System.out.println(number1 + " + " +number2);
        System.out.println(number1+number2);
    }
}

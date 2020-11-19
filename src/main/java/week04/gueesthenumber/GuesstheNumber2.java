package week04.gueesthenumber;

import java.util.Random;
import java.util.Scanner;

public class GuesstheNumber2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int number = random.nextInt(100) + 1;

        int guess = 0;

        int numberofguesses = 0;
        System.out.println(number);

        while (number != guess && numberofguesses < 6) {
            while (guess != number) {
                System.out.println("Írj be egy számot:");
                guess = Integer.parseInt(scanner.nextLine());
                numberofguesses++;
                System.out.println(guess);
                System.out.println(numberofguesses + ". kérdés:");
                if (guess != number) {
                    System.out.println("Nem találtad el!");
                    if (guess < number) {
                        System.out.println(("A tipp kisebb a számnál"));
                    }
                    if (guess > number) {
                        System.out.println(("A tipp nagyobb a számnál"));
                    }
                }
            }

        }
        System.out.println("Eltaláltad " + number);
    }
}

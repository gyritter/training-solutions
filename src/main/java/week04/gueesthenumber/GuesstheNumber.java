package week04.gueesthenumber;

import java.util.Random;
import java.util.Scanner;

public class GuesstheNumber {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Random random = new Random();

    int number = random.nextInt(100) + 1;

    int guess = 0;

    int numberofguesses = 0;
    //System.out.println(number);

    boolean talalat = false;

        while (!talalat && numberofguesses < 6) {
        numberofguesses++;
        System.out.println(numberofguesses + ". kérdés:");
        System.out.println("Írj be egy számot:");
        guess = Integer.parseInt(scanner.nextLine());
        if (guess != number) {
            //System.out.println("Nem találtad el!");
            if (guess < number) {
                System.out.println(("A tipp kisebb a számnál"));
            }
            if (guess > number) {
                System.out.println(("A tipp nagyobb a számnál"));
            }
        } else {
            talalat = true;
        }
    }
    //System.out.println("Eltaláltad " + number);
        if (talalat) {
        System.out.println("Eltaláltad!");

    } else System.out.println("Nem találtad el! Szám= "+ number);}

}

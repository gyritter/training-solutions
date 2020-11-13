package Statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("1. Óra: ");
        int hour1 = scanner.nextInt();
        System.out.println("1. Perc: ");
        int min1 = scanner.nextInt();
        System.out.println("1. Mp: ");
        int sec1 = scanner.nextInt();

        Time time1= new Time(hour1, min1, sec1);

        System.out.println("2. Óra: ");
        int hour2 = scanner.nextInt();
        System.out.println("2. Perc: ");
        int min2 = scanner.nextInt();
        System.out.println("2. Mp: ");
        int sec2 = scanner.nextInt();

        Time time2= new Time(hour2, min2, sec2);

        System.out.println("1.időont:" + time1.toString());
        System.out.println("1.időont percekben:" + time1.getInMinutes());

        System.out.println("2.időont:" + time2.toString());
        System.out.println("2.időont másodpercekben:" + time2.getInSeconds());

        System.out.println("Az első korábbi, mint a második: " + time1.earlierThen(time2));

    }
}

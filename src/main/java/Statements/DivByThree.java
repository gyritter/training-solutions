package Statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);
        System.out.println("mi a szám?");
        int number = scanner.nextInt();


        int c=number % 3 ;
        System.out.println(number % 3 == 0 ? "osztható 3-al" : "nem osztható 3-al");





    }
}
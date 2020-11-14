package Statements;

import java.util.Scanner;

public class InvestmentsMain {


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Befektetés összege?");
        int fund= scanner.nextInt();
        System.out.println("Kamatláb?");
        int interestRate= scanner.nextInt();
        Investments investment = new Investments(fund, interestRate);

        System.out.println("Tőke: " + investment.getFund());
        System.out.println("Kamatláb: " + interestRate);
            System.out.println("Hozam 50 napra: " + investment.getYield(50));
            System.out.println("Kivett összeg 80 nap után: " + investment.close(80));
            System.out.println("Kivett összeg 90 nap után: " + investment.close(90));
    }
}

package classstructureintegrate;

import java.util.Scanner;

public class BankAccountMain {

    public static void main(String[] args) {

        BankAccount szamla1 =new BankAccount("123456-123456-123456","Jóska Pista",1000000);

        BankAccount szamla2 =new BankAccount("654321-654321-654321","Pista Jóska",1000000);

        System.out.println(szamla1.getInfo());

        System.out.println(szamla2.getInfo());

        Scanner scanner = new Scanner(System.in);

        int osszeg;

        System.out.println("Betét " + szamla1.getOwner() + " számlájára:");
        osszeg = scanner.nextInt();
        szamla1.deposit(osszeg);

        System.out.println("Kivét " + szamla2.getOwner() + " számlájáról:");
        osszeg = scanner.nextInt();
        szamla2.withdraw(osszeg);

        System.out.println(szamla1.getInfo());

        System.out.println(szamla2.getInfo());

        System.out.println("Átutalás " + szamla1.getOwner() + " számlájáról " + szamla2.getOwner() + " számlájára");
        osszeg = scanner.nextInt();
        szamla1.transfer(szamla2, osszeg);

        System.out.println(szamla1.getInfo());

        System.out.println(szamla2.getInfo());
    }
}

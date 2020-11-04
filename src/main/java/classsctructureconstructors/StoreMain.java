package classsctructureconstructors;

import java.util.Scanner;

public class StoreMain {

    public static void main(String[] args) {

        Store rakt1= new Store ("Doboz");

        Store rakt2= new Store ("Tányér");

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. raktár készlete: " + rakt1.getStock() + " " +
                rakt1.getProduct());

        System.out.println("2. raktár készlete: " + rakt2.getStock() + " " +
                rakt2.getProduct());

        System.out.println("Doboz Beérkezés:");
        int inlet = scanner.nextInt();
        rakt1.store(inlet);

        System.out.println("Tányér Beérkezés:");
        int inlet2 = scanner.nextInt();
        rakt2.store(inlet2);

        System.out.println("1. raktár készlete: " + rakt1.getStock() + " " +
                rakt1.getProduct());

        System.out.println("2. raktár készlete: " + rakt2.getStock() + " " +
                rakt2.getProduct());

        System.out.println("Doboz Kivét:");
        int outlet = scanner.nextInt();
        rakt1.dispatch(outlet);

        System.out.println("Tányér Kivét");
        int outlet2 = scanner.nextInt();
        rakt2.dispatch(outlet2);

        System.out.println("1. raktár készlete: " + rakt1.getStock() + " " +
                rakt1.getProduct());

        System.out.println("2. raktár készlete: " + rakt2.getStock() + " " +
                rakt2.getProduct());

    }
}

package week02;

import java.util.Scanner;

public class InputNames {
    public static void main(String[] args) {


    String [] names = new String[5];
    Scanner scanner =  new Scanner (System.in);
    for (int i=0; i<5; i++){

    System.out.println("Név" );
    names[i] = scanner.nextLine();
    }
        for (int i=0; i<names.length; i++){
            System.out.println((i+1)+".név" + " " + names[i]);
    }
}
}


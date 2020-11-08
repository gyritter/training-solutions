package classstructureintegrate;

import java.util.Scanner;

public class TrainerMain {
    public static void main(String[] args) {

   Trainer trainer1 = new Trainer("Kiss Andi",  1956);
        Trainer trainer2 = new Trainer("Kiss2",  1970);

        System.out.println("Első tréner: " + trainer1.getName() +" született: " + trainer1.getYearofBirth());
        System.out.println(trainer1.getName());
        System.out.println(trainer1.getYearofBirth());


    System.out.println("Második tréner új neve?");
    Scanner scanner = new Scanner(System.in);
    String newName =scanner.nextLine();
        trainer2.changeName(newName);




    System.out.println("Második tréner: " + trainer2.getName()  +"  " + trainer2.getYearofBirth() +" "+trainer2.getAge()); }
}
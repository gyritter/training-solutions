import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client(); // 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name?");
        client.name = scanner.nextLine();
        System.out.println("Year of birth?");
        client.year= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Address?");
        client.address =scanner.nextLine();
        System.out.println("Cléient name: " +client.name);
        System.out.println("Year of birth :"+ client.year);
        System.out.println("Addres :"+ client.address);
    }

}

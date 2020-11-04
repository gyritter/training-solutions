import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Song song = new Song(); // 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Band?");
        song.band = scanner.nextLine();
        System.out.println("Title?");
        song.title =scanner.nextLine();
        System.out.println("Length in minutes?");
        song.length= scanner.nextInt();
        scanner.nextLine();

        System.out.println("Band name: " +song.band);
        System.out.println("Title :"+ song.title);
        System.out.println("Length :"+ song.length);
    }
}

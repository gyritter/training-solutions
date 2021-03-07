package covid;

import org.mariadb.jdbc.MariaDbDataSource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLException;
import java.util.Scanner;

public class CovidMain {

    //CovidMain covidMain = new CovidMain();


    public static void main(String[] args) {

        CovidMain covidMain=new CovidMain();
        MariaDbDataSource dataSource;
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/covidmanager?useUnicode=true");
            dataSource.setUser("covidmanager");
            dataSource.setPassword("covidmanager");
        } catch (
                SQLException sqlException) {
            throw new IllegalStateException("Connection failed!", sqlException);
        }
        CovidDao covidDao = new CovidDao(dataSource);
        CovidMethods covidMethods = new CovidMethods();
        covidMain.menu(covidMethods, covidDao);
    }

    private void menu(CovidMethods covidMethods, CovidDao covidDao){

        String choice = printMenu();

        if(!choice.equalsIgnoreCase("x")){
            switch (choice){
                case "1" -> {boolean b=covidMethods.registration(covidDao);
                    if (b) {
                        System.out.println("Sikeres regisztráció");
                    } else System.out.println("Sikertelen regisztáció");
                }
                case "2" -> covidMethods.massRegistration(covidDao);
                case "3" -> covidMethods.vaccGenerator(covidDao);
                case "4" -> covidMethods.vaccination(covidDao);
                case "5" -> covidMethods.vaccination(covidDao);
            }
            menu(covidMethods, covidDao);
        }

    }

    private String printMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "regisztráció - 1\n" +
                        "Tömeges regisztráció - 2\n" +
                        "Oltólista generálása - 3\n" +
                        "Oltás + oltás meghíúsulása - 4\n" +
                        "Riport - 5\n\n" +
                        "Kilépés - x\n\n" +
                        "Választás: ");
        return scanner.nextLine();
    }
}

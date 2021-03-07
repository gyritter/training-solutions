package covid;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

import static java.time.temporal.ChronoUnit.DAYS;

public class CovidMethods {

    public boolean registration(CovidDao covidDao) {

        Scanner scanner = new Scanner(System.in);

        String citizen_name = "";
        String zip = "";
        long age = 0;
        String email = "";
        String taj = "";


        System.out.println("Enter name");
        citizen_name = scanner.nextLine();
        if (!VaccinationValidator.stringValidator(citizen_name)) {
            System.out.println("Wrong name try again");
            return false;
        }

        System.out.println("Enter zip");
        zip = scanner.nextLine();
        if (VaccinationValidator.stringValidator(zip)) {
            String cityName = covidDao.selectCityByZip(zip);
            if (VaccinationValidator.stringValidator(cityName)) {
                System.out.println(cityName);

            }
        } else {
            System.out.println("Wrong zip try again");
            return false;
        }


        System.out.println("Enter age");
        age = scanner.nextInt();
        scanner.nextLine();
        if (!VaccinationValidator.ageValidator(age)) {
            System.out.println("Wrong age try again");
            return false;
        }

        System.out.println("Enter TAJ");
        taj = scanner.nextLine();
        if (!VaccinationValidator.cDVValidator(taj)) {
            System.out.println("Wrong TAJ try again");
            return false;
        }

        String email2;

        System.out.println("Enter email address");
        email = scanner.nextLine();
        if (!VaccinationValidator.emailValidator(email)) {
            System.out.println("Wrong email address try again");
            return false;
        } else {
            System.out.println("Enter email address again");
            email2 = scanner.nextLine();
            if (!email.equals(email2)) {
                System.out.println("Mismatch in email address");
                return false;
            }
        }

        Citizen citizen = new Citizen(citizen_name, zip, (int) age, email, taj, 0, null);
        covidDao.insertRegistration(citizen);
        return true;
    }

    public void massRegistration(CovidDao covidDao) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the file path and name");
        String fileName = scanner.nextLine();

        //Path path = Path.of("C:/training/mass_registration.txt");
        try (BufferedReader reader = Files.newBufferedReader(Path.of(fileName), Charset.forName("ISO-8859-2"))) {
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                lineProcess(line, covidDao);
            }
        } catch (IOException ioe) {
            System.out.println("Can not open file" + ioe);
            return;
        }
    }

    private void lineProcess(String line, CovidDao covidDao) {
        String cits[] = line.split(";");
        Citizen citizen = new Citizen(cits[0], cits[1], Integer.parseInt(cits[2]),
                cits[3],
                cits[4],
                0,
                null);
        covidDao.insertRegistration(citizen);
    }

    public void vaccGenerator(CovidDao covidDao) {

        Scanner scanner = new Scanner(System.in);

        List<Citizen> citizenList = new ArrayList<>();

        String zip;
        System.out.println("Enter zip");
        zip = scanner.nextLine();
        if (VaccinationValidator.stringValidator(zip)) {
            String cityName = covidDao.selectCityByZip(zip);
            if (VaccinationValidator.stringValidator(cityName)) {
                System.out.println(cityName);

            }
        } else {
            System.out.println("Wrong zip try again");
            return;
        }

        System.out.println("Enter filename");
        String file = scanner.nextLine();

        citizenList = covidDao.selectCitizensByZip(zip);

        Collections.sort(citizenList, Collections.reverseOrder());

        LocalTime time = LocalTime.of(8, 0);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of(file))) {
            writer.write("Időpont;Név;Irányítószám;Életkor;E-mail cím;TAJ szám\n");
            while(i<16) {
                for (Citizen c : citizenList) {
                    if (c.getNumber_of_vaccination() < 2) {
                        sb.append(time.toString()).append(";");
                        sb.append(c.getCitizen_name()).append(";");
                        sb.append(c.getZip()).append(";");
                        sb.append(c.getAge()).append(";");
                        sb.append(c.getEmail()).append(";");
                        sb.append(c.getTaj()).append("\n");
                    }
                    if (c.getNumber_of_vaccination() == 0 || DAYS.between(LocalDateTime.now(), c.getLast_vaccination_date()) >= 15) {
                        writer.write(sb.toString());
                        time = time.plusMinutes(30);
                        i++;
                    }
                }
                sb.delete(0, sb.length());
            }
        } catch(IOException ioe)  {
        throw new IllegalStateException("Can not write file", ioe);
    }
}


    public void vaccination(CovidDao covidDao) {

        Scanner scanner = new Scanner(System.in);

        List<Vaccinations> vaccinations = new ArrayList<>();
        System.out.println("Enter TAJ");
        String taj = scanner.nextLine();
        if (VaccinationValidator.cDVValidator(taj)) {

        } else {
            System.out.println("Wrong TAJ try again");
            return;
        }

        Citizen citizen = covidDao.selectCitizensByTAJ(taj);
        System.out.println(citizen.getCitizen_name());

        if (citizen.getNumber_of_vaccination() > 1) {
            throw new IllegalArgumentException("Already had two vaccinations");
        }

        String vaccination_type = "";
        String vaccination_status = "";

        if (citizen.getNumber_of_vaccination() == 1) {
            vaccinations = covidDao.getExistingVaccinations(taj);
        }
        for (Vaccinations v : vaccinations) {
            System.out.println(v.toString());
        }

        if (citizen.getNumber_of_vaccination() == 0) {

            System.out.println("TÍPUS");
            vaccination_type = scanner.nextLine();
        }

        boolean stat = true;
        while (stat) {
            System.out.println("Sikeres/Sikertelen?");
            vaccination_status = scanner.nextLine();
            if (vaccination_status.equals("Sikeres") || vaccination_status.equals("Sikertelen")) {
                stat = false;
            } else {
                System.out.println("The acceptible words are Sikres or Sikertelen");
            }
        }
        System.out.println("Megjegyzés");
        String vaccination_note = scanner.nextLine();

        if (vaccination_status.equals("Sikeres")) {
            covidDao.addVaccination(citizen.getId(), LocalDateTime.now(), vaccination_status, vaccination_note, vaccination_type);
        } else {
            covidDao.addVaccination(citizen.getId(), LocalDateTime.now(), vaccination_status, vaccination_note, "nincs");
        }
    }

    /*public void vaccinationReportGenerator(CovidDao covidDao){
        List<Citizen> citizens=covidDao.selectAllCitizensByNumberOfVaccinations();
        Map<String, Integer> vaccReport = new TreeMap<>();
        String key;
        for(Citizen c:citizens){
            if(!vaccReport.containsKey(c.getZip())){
                vaccReport.put((c.getZip()+"_"+c.getNumber_of_vaccination()),0);
            }
            key=c.getZip()+"_"+c.getNumber_of_vaccination();
            vaccReport.put(key,vaccReport.get(key)+1);
        }

        StringBuilder sb = new StringBuilder();
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of("Vaccination_report_"+ LocalDate.now().toString()))) {
            writer.write("Irányítószám;Oltatlan;Egyszer oltott;Kétszer oltott\n");
            String zip;
            String vaccNumber;
            int nulla=0;
            int egy=0;
            int ket=0;
            for (Map.Entry Entry:vaccReport.entrySet()) {
                zip=Entry.getKey().toString().substring(0,3);
                vaccNumber=Entry.getKey().toString().substring(5);
                if (sb.length()<1){
                    sb.append(zip).append(";");
                }

                writer.write(sb.toString());


            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }*/
}



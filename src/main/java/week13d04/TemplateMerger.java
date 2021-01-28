package week13d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TemplateMerger {

    public String merger(Path file, List<Employee> employees) {

        String sablon = loadSablon(file);
        return createString(sablon, employees);
    }

    public String loadSablon(Path file) {
        String sablon;
        try {
            sablon = Files.readString(file);

        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }
        return sablon;
    }

    public String createString(String sablon, List<Employee> employees) {
        StringBuilder sb = new StringBuilder();
        for (Employee e : employees) {
            String name = e.getName();
            String year = String.valueOf(e.getYearOfBirth());
            sb.append(sablon.replace("{nev}", name).replace("{ev}", year));
        }
        return sb.toString();
    }

    public static void main (String[]args){
        TemplateMerger templateMerger = new TemplateMerger();

        Path path = Path.of("EmployeeSablon.txt");
        List<Employee> employees = new ArrayList<>();

        employees.add((new Employee("John Doe",1980)));
        employees.add((new Employee("Jack Doe",1990)));
        employees.add((new Employee("Jans Varog",1960)));
        employees.add((new Employee("OTTI Klaim",1993)));


        System.out.println(templateMerger.merger(path, employees));
    }
}
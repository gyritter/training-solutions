package week13d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TemplateMerger2 {

        StringBuilder sb = new StringBuilder();

        public String merge(Path file, List<Employee> employees) {
            try {


                List<String> readed = Files.readAllLines(file);
                for (String r : readed) {
                    employees.add(lineSplitter(r));
                }

            } catch (IOException ioe) {
                throw new IllegalStateException("Cannot read file", ioe);
            }

            for (Employee e : employees) {
                sb.append("Az alkalmazott neve: ").append(e.getName()).append(", ");
                sb.append("születési éve: ").append(e.getYearOfBirth()).append('\n');


            }
            return sb.toString();
        }

        private Employee lineSplitter(String line) {
            String name = line.split(",")[0].split(":")[1].trim();
            int year = Integer.parseInt(line.split(",")[1].split(":")[1].trim());
            return new Employee(name, year);
        }



/*Írj egy a TemplateMerger osztályba egy public String merge(Path file, List<Employee> employees)
    metódust, ami felolvassa a fájlt, melynek tartalma:
    Az alkalmazott neve: {nev}, születési éve: {ev}
    Nyugodtan beolvashatod egy utasítással!
    Majd a visszatérési értékként add vissza soronként az alkalmazottakat, abban a formátumban,
    Tehát a txt file adja meg sablont. A későbbiekben ebbe belenyúlva könnyen módosítható a
    kiirás formátuma nem kell a javaba belenyúlni

    Ez meg lett csinálva, de félre lett értve. Nem sablonnal dolgozik*/

        public static void main(String[] args) {
            Path file = Path.of("merge.txt");
            List<Employee> employees = new ArrayList<>();
            week13d04.TemplateMerger2 templateMerger = new week13d04.TemplateMerger2();

            System.out.println(templateMerger.merge(file, employees));

        }

    }

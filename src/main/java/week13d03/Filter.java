package week13d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Filter {

    private List<Schedules> schedules = new ArrayList<>();

    public int numberOfHoursbyTeacher(String fileName, String name) {
        Path path = Path.of(fileName);
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String[] temp = new String[4];
            while ((temp[0] = br.readLine()) != null) {
                for (int i = 1; i < 4; i++) {
                    temp[i] = br.readLine();
                }
                schedules.add(new Schedules(temp[0], temp[1], temp[2], Integer.parseInt(temp[3])));
            }
        } catch (IOException e) {
            throw new IllegalStateException("can read file", e);
        }
        int count = 0;
        for (Schedules x : schedules) {
            if (x.getName().equals(name)) {
                count += x.getHours();
            }
        }
        return count;

    }


    public int numberOfHoursbyTeacher2(String fileName, String name) {
        Path path = Path.of(fileName);
        int count=0;
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                skipTwoLines(br);
                if (line.equals(name)){
                    count+=Integer.parseInt(br.readLine());
                }else br.readLine();
            }

        } catch (IOException e) {
            throw new IllegalStateException("can read file", e);

        }
       return count;
    }

    public void skipTwoLines(BufferedReader br) throws IOException {

        br.readLine();
        br.readLine();
    }


    public static void main(String[] args) {
        Filter filter = new Filter();
        System.out.println(filter.numberOfHoursbyTeacher("beosztas.txt", "Vadmacska Vadony"));
        System.out.println(filter.numberOfHoursbyTeacher2("beosztas.txt", "Vadmacska Vadony"));

    }

}

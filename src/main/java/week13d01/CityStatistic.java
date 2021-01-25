package week13d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CityStatistic {

    public String maxLengthCityFromFile(String fileName) {

        try (BufferedReader reader = Files.newBufferedReader(Path.of(fileName))) {
            skipHeader(reader);
            return maxLengthCity(reader);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    private String maxLengthCity(BufferedReader br) throws IOException {
        String maxLength = "";
        String line;
        int count = 0;
        while ((line = br.readLine()) != null) {
            count++;
            String city = splitLine(line, count);
            if (city.length() > maxLength.length()) {
                maxLength = city;
            }
        }
        return maxLength;
    }

    private String splitLine(String line, int lineNumber) throws IOException {
        String[] temp = line.split(";");
        if (temp.length > 1) {
            return temp[1].trim();
        }
        throw new IllegalArgumentException("wrong " + line + "in line: " + lineNumber);
    }

    private void skipHeader(BufferedReader bufferedreader) throws IOException {
        bufferedreader.readLine();
    }

    public static void main(String[] args) {
        CityStatistic cityStatistic = new CityStatistic();
        System.out.println(cityStatistic.maxLengthCityFromFile("iranyitoszamok-varosok-2021.csv"));
    }
}

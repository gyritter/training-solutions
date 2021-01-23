package ioreaderclasspath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {

    private List<Country> countryList = new ArrayList<>();

    public List<Country> getCountryList() {
        return new ArrayList<>(countryList);
    }

    public void readFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                CountryStatistics.class.getResourceAsStream(fileName)))) {
            String line;
            while ((line = reader.readLine()) != null) {
                addCountry(line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    private void addCountry(String line) {
        String[] temp = line.split(" ");
        countryList.add(new Country(temp[0], Integer.parseInt(temp[1])));
    }

    public int numberOFCountries() {
        return countryList.size();
    }

    public Country mostBorderCountries() {
        int neighborNumber = countryList.get(0).getBorderCountries();
        int index = 0;
        for (int i = 1 ; i < countryList.size(); i++) {
            if (countryList.get(i).getBorderCountries()>neighborNumber){
                neighborNumber=countryList.get(i).getBorderCountries();
                index=i;
            }
        }
        return countryList.get(index);
    }
}
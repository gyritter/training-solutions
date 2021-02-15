package exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Histogram {

    public String createHistogram(BufferedReader reader) {
        List<Integer> numbers=new ArrayList<>();
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
        }
        catch (IOException ioe){
            throw new IllegalArgumentException("Can not read from file");
        }
        StringBuilder sb=new StringBuilder();
        stringBildUp(numbers, sb);
        return sb.toString();
    }

    private void stringBildUp(List<Integer> numbers, StringBuilder sb) {
        for(int number: numbers){
            for(int j=0; j<number; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
    }

}


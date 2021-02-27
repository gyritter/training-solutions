package x;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class Histogramb {

    public String createHistogram(BufferedReader reader) throws IOException {
        String line;
        StringBuilder sb= new StringBuilder();
        try {
            while ((line = reader.readLine()) != null) {
                for (int i=0;i<Integer.parseInt(line); i++){
                    sb.append("*");
                }
                sb.append("\n").toString();
            }

        } catch (IOException ioe){
            throw new IllegalStateException("Can not read file", ioe);

        }
        return sb.toString();

    }
}

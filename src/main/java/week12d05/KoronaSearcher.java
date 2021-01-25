package week12d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class KoronaSearcher {

    public static void main(String[] args) {
        KoronaSearcher koronaSearcher=new KoronaSearcher();
        Path file = Path.of("index.html");
        int count=0;
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String line;
            while((line = reader.readLine()) != null) {
                if (line. toLowerCase().contains("koronav")) count++;
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        System.out.println(count);
    }

    public int SearchWord(Path path, String word) {
        int count=0;
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while((line = reader.readLine()) != null) {
                if (line.contains(word)) count++;
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return count;
    }

    public int SearchWordWithReader(BufferedReader reader, String word) {
        int count=0;
        /* ide nem kell a try with resources; ahol példányosítom a BufferedReadert, oda kell
           a Bufferedreaderbe becsomagolható egy InputStreamReader is, és egy clssPathReader is
           az InputStream lehet:
           - file (Path-ként),
           - file a classPath-ról
           - memóriaterület (StringReader),
           - URL stream,
            */
        try {
            String line;
            while((line = reader.readLine()) != null) {
                if (line.contains(word)) count++;
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return count;
    }

}

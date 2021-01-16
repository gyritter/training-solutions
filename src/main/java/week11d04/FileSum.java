package week11d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileSum {

    public int SumNumbers() {
        int count = 0;
        for (int i = 0; i < 100; i++) {
            String file = nameMaker(i);
            if (Files.isRegularFile(Path.of(file))) {
                count += read(file);
            }
        }
        return count;
    }

    public String nameMaker(int i) {

        return String.format("number%02d.txt", i);
    }

    public int read(String filename) {
        int content=0;
        try {

            content = Integer.parseInt(Files.readString(Path.of(filename)));

        } catch (IOException | NumberFormatException e) {
            throw new IllegalArgumentException("hiba", e);

        }
        return content;
    }

}

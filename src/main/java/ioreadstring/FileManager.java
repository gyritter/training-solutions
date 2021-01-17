package ioreadstring;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private Path fileName;
    private List<Human> humans = new ArrayList<>();

    public FileManager(String path) {
        this.fileName = Path.of(path);
    }

    public Path getFileName() {
        return fileName;
    }

    public List<Human> getHumans() {
        return humans;
    }

    public void readFromFile() {
        try {
            List<String> peoples = Files.readAllLines(fileName);
            for (String p : peoples) {
                humans.add(new Human(forName(p), lastName(p)));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    private String forName(String fullName) {
        int index = fullName.indexOf(" ");
        return fullName.substring(0, index);
    }

    private String lastName(String fullName) {
        int index = fullName.indexOf(" ");
        return fullName.substring(index + 1);
    }

    public Path getMyFile() {
        return fileName;
    }
}

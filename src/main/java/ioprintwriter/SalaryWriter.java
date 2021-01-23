package ioprintwriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SalaryWriter {

    private List<String> names;


    public SalaryWriter(List<String> names) {
        this.names = names;
    }

    public void writeNamesAndSalaries(Path path){
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(path))) {
            for (String s:names) {
                writer.print(s);
                writer.print(": ");
                String title = s.substring(0, 2);
                switch (title) {
                    case "Dr":{
                        writer.println(500_000);
                        break;
                    }
                    case "Mr":{
                        writer.println(200_000);
                        break;
                    }
                    default: writer.println(100_000);
                }
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}

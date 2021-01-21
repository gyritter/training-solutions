package week12d04;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;

public class Enigma {

    public String printSecret_ReadAll(Path path) {
        StringBuilder sb = new StringBuilder();
        try {
            byte[] bytes = Files.readAllBytes(path);
            {
                for (byte b : bytes) {
                    char c = (char) (b + 10);
                    sb.append(c);
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }
        return sb.toString();
    }

    public String printSecret_BatchRead(Path path) {
        StringBuilder sb = new StringBuilder();
        try (InputStream is = Files.newInputStream(path)) {
            byte[] buffer = new byte[1000];
            int size;
            while ((size = is.read(buffer)) > 0)
                for (int i = 0; i < size; i++) {
                    char c = (char) (buffer[i] + 10);
                    sb.append(c);
                }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }
        return sb.toString();
    }

    public void printSecret_ReadWrite(Path source, Path destination) {
        try (InputStream is = Files.newInputStream(source);
             //Java8 előtt: InputStream is = new BufferedInputStream(new FileInputStream(source.toFile()))
             //OutputStream os =Files.newOutputStream (destination)){ kiírás byte-ként
             Writer os = Files.newBufferedWriter(destination)) {
            byte[] buffer = new byte[1000];
            int size;
            while ((size = is.read(buffer)) > 0)
                for (int i = 0; i < size; i++) {
                    char c = (char) (buffer[i] + 10);
                    os.write(c);
                }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }
    }

    public static void main(String[] args) {
        Enigma enigma = new Enigma();
        System.out.println(enigma.printSecret_ReadAll(Path.of("secret.dat")));
        System.out.println(enigma.printSecret_BatchRead(Path.of("secret.dat")));
        enigma.printSecret_ReadWrite(Path.of("secret.dat"), Path.of("secret.txt"));
    }
}

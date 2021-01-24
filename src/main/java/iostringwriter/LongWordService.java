package iostringwriter;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

public class LongWordService {

    public void writeTo(List<String> words, Writer writer) {
        try {
            for (String word :words) {
                writer.write(word);
               writer.write(", ");
                writer.write(Integer.toString(word.length()));
                writer.write("\n");
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public String writeWithStringWriter(List<String> words){
        StringWriter stringWriter = new StringWriter();
        try (stringWriter) {
            writeTo(words, stringWriter);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write", ioe);
        }
        return stringWriter.toString();
    }
}

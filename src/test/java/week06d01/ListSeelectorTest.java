package week06d01;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListSeelectorTest {

    ListSelector lista = new ListSelector();
    List<String> próba = Arrays.asList("takács", "bognár","bodnár","kefekötő", "felcser");
    //List<String> próba = new ArrayList<>();

    @Test
    public void listSelectorTest() {
                assertEquals("[takács,bodnár,felcser]", lista.listSelector(próba));
    }
}

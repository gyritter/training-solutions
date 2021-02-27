package x;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class VowelFilterTest {
    @Test
    public void postFinderTest(){

    VowelFilter vowelFilter= new VowelFilter();
    try (
    BufferedReader br = Files.newBufferedReader(Path.of("Vowels.txt"))) {

        System.out.println(vowelFilter.filterVowels(br));
    } catch (
    IOException e) {
        throw new IllegalArgumentException("Can not find text", e);
    }

}
}
package week15d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class GamaOfThrones {

    private Map<String, Integer> clanBattleCounter = new HashMap<>();

    public void readFromFile(BufferedReader br) {

        try {
            String line;
            br.readLine(); //a fejlécet eldobja, ezt csak beolvassa de nem dolgozza fel
            while ((line = br.readLine()) != null) {
                processLine(replaceQuoted(line));
            }

        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not read from file");
        }
    }

    private void processLine(String line) {
        String[] temp = line.split(",");
        Set<String> tempSet = new HashSet();
        for (int i = 5; i < 13; i++) {
            if (!(temp[i] == null || temp[i].length() < 1)) {
                tempSet.add(temp[i]);
            }
        }
        for (String s : tempSet) {
            if (!(clanBattleCounter.keySet().contains(s))) {
                clanBattleCounter.put(s, 0);
            }
            clanBattleCounter.put(s, clanBattleCounter.get(s) + 1);
        }
    }

    private String replaceQuoted(String line) {
        while (line.contains("\"")) {
            int first = line.indexOf("\"");
            int last = line.substring(first + 1).indexOf("\"") + first;
            String result = line.substring(first, last + 2);
            String change = result.replace(",", "_").replace("\"", "");
            line = line.replace(result, change);
        }
        return line;
    }

    public String maxBattleNumberClan() {
        int max = 0;
        String clanName = "";
        for (String s : clanBattleCounter.keySet()) {
            if (clanBattleCounter.get(s) > max) {
                clanName = s;
                max = clanBattleCounter.get(s);
            }
        }
        return clanName;
    }

    public static void main(String[] args) {

        GamaOfThrones game = new GamaOfThrones();
        try (BufferedReader br = Files.newBufferedReader(Path.of("battles.csv"))) {

            game.readFromFile(br);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not find file");
        }
        System.out.println(game.maxBattleNumberClan());
    }
}

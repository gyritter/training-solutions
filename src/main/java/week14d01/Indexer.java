package week14d01;

import java.util.*;

public class Indexer {

    public Map<Character, List<String>> index(List<String> names) {
        Map<Character, List<String>> result = new HashMap<>();
        for (String n : names) {
            if (!(result.containsKey(n.charAt(0)))) {
                result.put(n.charAt(0), new ArrayList<>());
            }
            result.get(n.charAt(0)).add(n);
        }
        return result;
    }

    public static void main(String[] args) {
        Indexer indexer=new Indexer();
        System.out.println(indexer.index(Arrays.asList("Odon", "Lujza", "Abraham", "Magdolna", "Lajos")));
    }




    /*Készíts egy Indexer osztályt, melynek van egy public Map<Character, List<String>> index(List<String> names)
    metódusa. A feladat az, hogy egy indexet készítsünk a megadott nevek kezdőbetűiből
     (minden kezdőbetűt társítsunk az összes névvel, mely ezzel a betűvel kezdődik).
Példa:
System.out.println(new Indexer().index(Arrays.asList("Odon", "Lujza", "Abraham", "Magdolna")));
// {A=[Abraham], L=[Lujza], M=[Magdolna], O=[Odon]}*/
}

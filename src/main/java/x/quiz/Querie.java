package x.quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Querie {

    private List<Question> questions = new ArrayList<>();


    private void readLines(BufferedReader reader) throws IOException {
        String line;
        String question;
        while ((line = reader.readLine()) != null) {
            question = line;
            line = reader.readLine();
            addQuestionToList(question, line);
        }
    }

    public void readQuestions() {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("kerdesek.txt"))) {
            readLines(reader);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    private void addQuestionToList(String question, String line) {

        String answer = line.split(" ")[0];
        int score = Integer.parseInt(line.split(" ")[1]);
        String topic = line.split(" ")[2];
        questions.add(new Question(question, answer, score, topic));

    }

    /*1. Írj egy metódust, melynek paramétere a téma és add vissza, az összes kérdést abban a témában. (Csak a kérdéseket)*/

    public List<String> getQuestionsByTopic(String topic) {
        List<String> result = new ArrayList<>();
        for (Question q : questions) {
            if (q.getTopic().equals(topic)) {
                result.add(q.getQuestion());
            }
        }
        return result;
    }

    /*2. Írj egy metódust, ami random sorsol ki egy kérdést, és adja vissza annak összes adatát.*/
    public Question randomQuestion() {
        Random rnd = new Random();
        return questions.get(rnd.nextInt(questions.size()));
    }

    /*3. Készíts egy metódust ami rendszerezi a kérdéseket témakörönként.
    Visszatér egy datszerkezetben amelyben témánként megtalálható az összes kérdés.*/


    public Map<String, List<String>> getAllQuestionsByTopics() {
        Map<String, List<String>> result = new TreeMap<>();
        for (Question q : questions) {
            if (!result.containsKey(q.getTopic())) {
                result.put(q.getTopic(), getQuestionsByTopic(q.getTopic()));
            }
        }
        return result;
    }

        /*4. Az előző feladat segítségével határozd meg, hogy melyik téma kérdései
        érik a legtöbb pontot (összpontszám)!*/

    private Map<String, Integer> getScoreByTopic() {
        Map<String, Integer> result = new TreeMap<>();
        for (Question q : questions) {
            if (!result.containsKey(q.getTopic())) {
                result.put(q.getTopic(), 0);
            }
            result.put(q.getTopic(), result.get(q.getTopic()) + q.getScore());
        }
        return result;

    }

    public Map.Entry<String, Integer> getMaxScoreByTopic() {
        Map<String, Integer> temp = getScoreByTopic();
        Map.Entry<String, Integer> result=null;

        for (Map.Entry <String, Integer> entry : temp.entrySet()) {
            if (result==null || entry.getValue()>result.getValue()) {
                result = entry;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        Querie querie = new Querie();
        querie.readQuestions();
        System.out.println(querie.getQuestionsByTopic("matematika")); //1
        System.out.println(querie.randomQuestion().toString()); //2
        System.out.println(querie.getAllQuestionsByTopics());//3
        System.out.println(querie.getMaxScoreByTopic());//4
    }
}

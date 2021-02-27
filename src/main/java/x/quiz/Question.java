package x.quiz;

public class Question {

    private String question;
    private String answer;
    private int score;
    private String topic;

    public Question(String question, String answer, int score, String topic) {
        this.question = question;
        this.answer = answer;
        this.score = score;
        this.topic = topic;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public int getScore() {
        return score;
    }

    public String getTopic() {
        return topic;
    }

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", score=" + score +
                ", topic='" + topic + '\'' +
                '}';
    }
}

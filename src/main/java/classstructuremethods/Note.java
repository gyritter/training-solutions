package classstructuremethods;

public class Note {
    private String name2;

    private String topic;

    private String text;

    public String getName2() {
        return name2;
    }

    public void setName(String name) {
        this.name2 = name;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setText(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }

    public String getNoteText() {
        return "name: " + name2+ " ("+topic + ") "+ text;
    }
}

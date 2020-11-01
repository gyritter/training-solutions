package classsctructureconstructors;

public class Book {

    private String author;

    private String title;

    private String regNumber;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setAuthor(String auhor) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

}

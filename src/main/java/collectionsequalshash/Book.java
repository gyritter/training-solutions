package collectionsequalshash;

import java.util.Objects;

public class Book {

    private String regNumber;
    private String title;
    private String author;

    public Book(String regNumber, String title, String author) {
        this(title, author);
        this.regNumber = regNumber;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title.equals(book.title) &&
                author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
//"Book{regNumber='2121', "Book{regNumber='Vuk', author='Fekete István'}"
    @Override
    public String toString() {
        return "Book{regNumber='"+ this.regNumber +"', title='" + this.title
                + "', author='" + this.author + "'}";
    }
}

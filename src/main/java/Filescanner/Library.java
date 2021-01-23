package Filescanner;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book addBook) {

        for (Book x : books) {
            if (addBook.getTitle().equals(x.getTitle()) &&
                    (addBook.getAuthor().equals(x.getAuthor()))) {
                return;

            }
        }
        books.add(addBook);

    }


    public void saveBooks() {
        Path path = Path.of("books.csv");
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (Book book : books) {
                writer.write(book.toString() + "\n");
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("Can not write file", e);
        }

    }

    private Book stringSplitter(String line) {

        String[] temp = line.split(";");
        return new Book(temp[0], temp[1]);

    }

    public void loadBooks() {

        Path path = Path.of("books.csv");
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                books.add(stringSplitter(line));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }

    }

    public static void main(String[] args) {
        Library library = new Library();
        library.loadBooks();
        library.addBook(new Book("Petőfi", "Anyám Tyúkja"));
        library.saveBooks();
    }
}



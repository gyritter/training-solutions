package collectionsiterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LibraryManager {

    private Set<Book> libraryBooks;

    public LibraryManager(Set<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public Book findBookByRegNumber(int regNumber) {

        Book found;

        Iterator<Book> iterator = libraryBooks.iterator();

        while (iterator.hasNext()) {
            found = iterator.next();
            if (found.getRegNumber() == regNumber) {
                return found;
            }
        }
        throw new MissingBookException("No books found with regnumber: " + regNumber);

    }

    public int removeBookByRegNumber(int regNumber) {

        Book found;
        Iterator<Book> iterator = libraryBooks.iterator();

        while (iterator.hasNext()) {
            found = iterator.next();
            if (found.getRegNumber() == regNumber) {
                iterator.remove();
                return regNumber;
            }
        }
        throw new MissingBookException("No books found with regnumber: " + regNumber);
    }

    public Set<Book> selectBooksByAuthor(String author) {

        Book found;
        Set<Book> result = new HashSet<>();
        Iterator<Book> iterator = libraryBooks.iterator();

        while (iterator.hasNext()) {
            found = iterator.next();
            if (found.getAuthor() == author) {
                result.add(found);
            }
        }
        if (result.size() < 1) {
            throw new MissingBookException("No books found by " + author);
        }

        return result;
    }

    public int libraryBooksCount() {
        return libraryBooks.size();
    }
}

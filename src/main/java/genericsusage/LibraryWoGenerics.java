package genericsusage;

import java.util.List;

public class LibraryWoGenerics {

    public Book getFirstBook(List books) {

        if (books.isEmpty()) throw new IllegalArgumentException("Argument should not be empty!");
        if (books == null) throw new NullPointerException("A lista nem lehet null");

        Object o = books.get(0);

        if (!(o instanceof Book)) throw new ClassCastException("Not a book");

        return (Book) o;
    }

}

package genericsusage;

import java.util.List;

public class Library {

    public Book getFirstBook(List<Book> books){

        if (books.isEmpty()) throw new IllegalArgumentException("Argument should not be empty!");
        if (books==null) throw new NullPointerException("A lista nem lehet null");

        return books.get(0);


    }
}

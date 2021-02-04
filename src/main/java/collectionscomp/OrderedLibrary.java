package collectionscomp;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class OrderedLibrary {

    private List<Book> libraryBooks;

    public OrderedLibrary(List<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public List<Book> orderedByTitle(){

        List<Book> orderedList = new ArrayList<>(libraryBooks);
        Collections.sort(orderedList);

        return orderedList;
    }

    public List<Book> orderedByAuthor(){

        List<Book> orderedList = new ArrayList<>(libraryBooks);
        Collections.sort(orderedList, new AuthorComparator());

        return orderedList;
    }

    public List<String> orderedByTitleLocale(Locale locale){

        List<String> orderedList = new ArrayList<>();
        for (Book book : libraryBooks) {
            orderedList.add(book.getTitle());
        }

        Collator hungarianCollator = Collator.getInstance(locale);
        hungarianCollator.setStrength(Collator.PRIMARY);
        Collections.sort(orderedList, hungarianCollator);

        return orderedList;
    }
}

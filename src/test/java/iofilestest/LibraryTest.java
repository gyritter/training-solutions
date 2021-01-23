package iofilestest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LibraryTest {

    @Test
    public void testLoadBooks() {
        Library library = new Library();

        library.loadBooks();

        assertEquals(4, library.getBooks().size());
        assertEquals("Robert C. Martin", library.getBooks().get(2).getAuthor());
    }

}
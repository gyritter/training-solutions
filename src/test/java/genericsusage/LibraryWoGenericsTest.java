package genericsusage;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LibraryWoGenericsTest{


        @Test
        public void shouldThrowExceptionIfArgumentIsNull() {
            assertThrows(NullPointerException.class, () -> new LibraryWoGenerics().getFirstBook(null));
        }

        @Test
        public void shouldThrowExceptionIfArgumentIsEmptyList() {
            Exception ex = assertThrows(IllegalArgumentException.class, () -> new LibraryWoGenerics().getFirstBook(new ArrayList()));
            assertEquals("Argument should not be empty!", ex.getMessage());
        }

        @Test
        public void shouldThrowExceptionAddingDifferentObjects() {
            LibraryWoGenerics library = new LibraryWoGenerics();
            Exception ex = assertThrows(ClassCastException.class, () -> library.getFirstBook(Arrays.asList("", "", "")));
            assertEquals("Not a book", ex.getMessage());
        }

        @Test
        public void shouldReturnFirst() {
            assertEquals("Egri Csillagok", new LibraryWoGenerics().getFirstBook(Arrays.asList(new Book("Egri Csillagok"), new Book("Antigoné"))).getTitle());
        }
}
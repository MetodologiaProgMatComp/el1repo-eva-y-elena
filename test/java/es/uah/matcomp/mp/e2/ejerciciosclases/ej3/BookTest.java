package es.uah.matcomp.mp.e2.ejerciciosclases.ej3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getIsbn() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b = new Book("12345","Java for dummy", a, 8.8, 88);
        assertDoesNotThrow(() -> b.getIsbn());
        assertEquals("12345", b.getIsbn());
    }

    @Test
    void getName() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b = new Book("12345","Java for dummy", a, 8.8, 88);
        assertDoesNotThrow(() -> b.getName());
        assertEquals("Java for dummy", b.getName());
    }

    @Test
    void getAuthor() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b = new Book("12345","Java for dummy", a, 8.8, 88);
        assertDoesNotThrow(() -> b.getAuthor());
        assertEquals(a, b.getAuthor());
    }

    @Test
    void getPrice() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b = new Book("12345","Java for dummy", a, 8.8, 88);
        assertDoesNotThrow(() -> b.getPrice());
        assertEquals(8.8,  b.getPrice());
    }

    @Test
    void getQty() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b = new Book("12345","Java for dummy", a, 8.8, 88);
        assertDoesNotThrow(() -> b.getQty());
        assertEquals(88, b.getQty());
    }

    @Test
    void setPrice() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b = new Book("12345","Java for dummy", a, 8.8, 88);
        assertDoesNotThrow(() -> b.setPrice(9.9));
    }

    @Test
    void setQty() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b = new Book("12345","Java for dummy", a, 8.8, 88);
        assertDoesNotThrow(() -> b.setQty(99));
    }

    @Test
    void getAuthorName() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b = new Book("12345","Java for dummy", a, 8.8, 88);
        assertDoesNotThrow(() -> b.getAuthorName());
        assertEquals("Tan Ah Teck", b.getAuthorName());
    }

    @Test
    void testToString() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b = new Book("12345","Java for dummy", a, 8.8, 88);
        assertDoesNotThrow(() -> b.toString());
    }
}
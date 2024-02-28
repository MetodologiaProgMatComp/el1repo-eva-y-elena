package es.uah.matcomp.mp.e2.ejerciciosclases.ej3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getIsbn() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("123", "Juan", a, 23);
        Book b = new Book("12345","Java for dummy", a, 8.8, 88);
        assertDoesNotThrow(() -> b.getIsbn());
        assertEquals("12345", b.getIsbn());
        assertDoesNotThrow(() -> b1.getIsbn());
        assertEquals("123", b1.getIsbn());
    }

    @Test
    void getName() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("123", "Juan", a, 23);
        Book b = new Book("12345","Java for dummy", a, 8.8, 88);
        assertDoesNotThrow(() -> b.getName());
        assertEquals("Java for dummy", b.getName());
        assertDoesNotThrow(() -> b1.getName());
        assertEquals("Juan", b1.getName());
    }

    @Test
    void getAuthor() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("123", "Juan", a, 23);
        Book b = new Book("12345","Java for dummy", a, 8.8, 88);
        assertDoesNotThrow(() -> b.getAuthor());
        assertEquals(a, b.getAuthor());
        assertDoesNotThrow(() -> b1.getAuthor());
        assertEquals(a, b1.getAuthor());
    }

    @Test
    void getPrice() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("123", "Juan", a, 23.5);
        Book b = new Book("12345","Java for dummy", a, 8.8, 88);
        assertDoesNotThrow(() -> b.getPrice());
        assertEquals(8.8,  b.getPrice());
        assertDoesNotThrow(() -> b1.getPrice());
        assertEquals(23.5,  b1.getPrice());
    }

    @Test
    void getQty() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("123", "Juan", a, 23.5);
        Book b = new Book("12345","Java for dummy", a, 8.8, 88);
        assertDoesNotThrow(() -> b.getQty());
        assertEquals(88, b.getQty());
        assertDoesNotThrow(() -> b1.getQty());
        assertEquals(0, b1.getQty());
    }

    @Test
    void setPrice() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("123", "Juan", a, 23.5);
        Book b = new Book("12345","Java for dummy", a, 8.8, 88);
        assertDoesNotThrow(() -> b.setPrice(9.9));
        assertDoesNotThrow(() -> b1.setPrice(9.9));
    }

    @Test
    void setQty() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("123", "Juan", a, 23.5);
        Book b = new Book("12345","Java for dummy", a, 8.8, 88);
        assertDoesNotThrow(() -> b.setQty(99));
        assertDoesNotThrow(() -> b1.setQty(99));
    }

    @Test
    void getAuthorName() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("123", "Juan", a, 23.5);
        Book b = new Book("12345","Java for dummy", a, 8.8, 88);
        assertDoesNotThrow(() -> b.getAuthorName());
        assertEquals("Tan Ah Teck", b.getAuthorName());
        assertDoesNotThrow(() -> b1.getAuthorName());
        assertEquals("Tan Ah Teck", b1.getAuthorName());
    }

    @Test
    void testToString() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("123", "Juan", a, 23.5);
        Book b = new Book("12345","Java for dummy", a, 8.8, 88);
        assertDoesNotThrow(() -> b.toString());
        assertDoesNotThrow(() -> b1.toString());
    }
}
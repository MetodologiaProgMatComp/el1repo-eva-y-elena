package es.uah.matcomp.mp.e2.ejerciciosclases.ej1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getName() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        Book b = new Book("Java for dummy", a, 19.95, 99);
        assertDoesNotThrow(() -> b.getName());
        assertEquals("Java for dummy", b.getName());
    }

    @Test
    void getAuthor() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        Book b = new Book("Java for dummy", a, 19.95, 99);
        assertDoesNotThrow(() -> b.getAuthor());
        assertEquals(a, b.getAuthor());
    }

    @Test
    void getPrice() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        Book b = new Book("Java for dummy", a, 19.95, 99);
        assertDoesNotThrow(() -> b.getPrice());
        assertEquals(19.95, b.getPrice());
    }

    @Test
    void getQty() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        Book b = new Book("Java for dummy", a, 19.95, 99);
        assertDoesNotThrow(() -> b.getQty());
        assertEquals(99, b.getQty());
    }

    @Test
    void setPrice() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        Book b = new Book("Java for dummy", a, 19.95, 99);
        assertDoesNotThrow(() -> b.setPrice(20));
    }

    @Test
    void setQty() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        Book b = new Book("Java for dummy", a, 19.95, 99);
        assertDoesNotThrow(() -> b.setQty(90));
    }

    @Test
    void testToString() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        Book b = new Book("Java for dummy", a, 19.95, 99);
        assertDoesNotThrow(() -> b.toString());
    }

    @Test
    void getAuthorName() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        Book b = new Book("Java for dummy", a, 19.95, 99);
        assertDoesNotThrow(() -> b.getAuthorName());
        assertEquals("Tan Ah Teck", b.getAuthorName());
    }

    @Test
    void getAuthorEmail() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        Book b = new Book("Java for dummy", a, 19.95, 99);
        assertDoesNotThrow(() -> b.getAuthorEmail());
        assertEquals("ahteck@nowhere.com", b.getAuthorEmail());
    }

    @Test
    void getAuthorGender() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        Book b = new Book("Java for dummy", a, 19.95, 99);
        assertDoesNotThrow(() -> b.getAuthorGender());
        assertEquals('m', b.getAuthorGender());
    }
}
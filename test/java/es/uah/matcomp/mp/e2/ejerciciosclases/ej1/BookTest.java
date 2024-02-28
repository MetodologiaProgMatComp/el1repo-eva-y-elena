package es.uah.matcomp.mp.e2.ejerciciosclases.ej1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getName() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        Book b1 = new Book("Juan", a, 23.5);
        Book b = new Book("Java for dummy", a, 19.95, 99);
        assertDoesNotThrow(() -> b.getName());
        assertEquals("Java for dummy", b.getName());
        assertDoesNotThrow(() -> b1.getName());
        assertEquals("Juan", b1.getName());
    }

    @Test
    void getAuthor() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        Book b1 = new Book("Juan", a, 23.5);
        Book b = new Book("Java for dummy", a, 19.95, 99);
        assertDoesNotThrow(() -> b.getAuthor());
        assertEquals(a, b.getAuthor());
        assertDoesNotThrow(() -> b1.getAuthor());
        assertEquals(a, b1.getAuthor());
    }

    @Test
    void getPrice() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        Book b1 = new Book("Juan", a, 23.5);
        Book b = new Book("Java for dummy", a, 19.95, 99);
        assertDoesNotThrow(() -> b.getPrice());
        assertEquals(19.95, b.getPrice());
        assertDoesNotThrow(() -> b1.getPrice());
        assertEquals(23.5, b1.getPrice());
    }

    @Test
    void getQty() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        Book b1 = new Book("Juan", a, 23.5);
        Book b = new Book("Java for dummy", a, 19.95, 99);
        assertDoesNotThrow(() -> b.getQty());
        assertEquals(99, b.getQty());
        assertDoesNotThrow(() -> b1.getQty());
        assertEquals(0, b1.getQty());
    }

    @Test
    void setPrice() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        Book b1 = new Book("Juan", a, 23.5);
        Book b = new Book("Java for dummy", a, 19.95, 99);
        assertDoesNotThrow(() -> b.setPrice(20));
        assertDoesNotThrow(() -> b1.setPrice(20));
    }

    @Test
    void setQty() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        Book b1 = new Book("Juan", a, 23.5);
        Book b = new Book("Java for dummy", a, 19.95, 99);
        assertDoesNotThrow(() -> b.setQty(90));
        assertDoesNotThrow(() -> b1.setQty(90));
    }

    @Test
    void testToString() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        Book b1 = new Book("Juan", a, 23.5);
        Book b = new Book("Java for dummy", a, 19.95, 99);
        assertDoesNotThrow(() -> b.toString());
        assertDoesNotThrow(() -> b1.toString());
    }

    @Test
    void getAuthorName() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        Book b1 = new Book("Juan", a, 23.5);
        Book b = new Book("Java for dummy", a, 19.95, 99);
        assertDoesNotThrow(() -> b.getAuthorName());
        assertEquals("Tan Ah Teck", b.getAuthorName());
        assertDoesNotThrow(() -> b1.getAuthorName());
        assertEquals("Tan Ah Teck", b1.getAuthorName());
    }

    @Test
    void getAuthorEmail() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        Book b1 = new Book("Juan", a, 23.5);
        Book b = new Book("Java for dummy", a, 19.95, 99);
        assertDoesNotThrow(() -> b.getAuthorEmail());
        assertEquals("ahteck@nowhere.com", b.getAuthorEmail());
        assertDoesNotThrow(() -> b1.getAuthorEmail());
        assertEquals("ahteck@nowhere.com", b1.getAuthorEmail());
    }

    @Test
    void getAuthorGender() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        Book b1 = new Book("Juan", a, 23.5);
        Book b = new Book("Java for dummy", a, 19.95, 99);
        assertDoesNotThrow(() -> b.getAuthorGender());
        assertEquals('m', b.getAuthorGender());
        assertDoesNotThrow(() -> b1.getAuthorGender());
        assertEquals('m', b1.getAuthorGender());
    }
}
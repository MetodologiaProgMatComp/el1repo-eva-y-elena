package es.uah.matcomp.mp.e2.ejerciciosclases.ej3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @Test
    void getName() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        assertDoesNotThrow(() -> a.getName());
        assertEquals("Tan Ah Teck", a.getName());
    }

    @Test
    void getEmail() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        assertDoesNotThrow(() -> a.getEmail());
        assertEquals("ahteck@nowhere.com", a.getEmail());
    }

    @Test
    void setEmail() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        assertDoesNotThrow(() -> a.setEmail("ah@nowhere.com"));
    }

    @Test
    void testToString() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        assertDoesNotThrow(() -> a.toString());
    }
}
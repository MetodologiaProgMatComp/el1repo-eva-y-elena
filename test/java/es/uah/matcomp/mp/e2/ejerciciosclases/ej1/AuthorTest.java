package es.uah.matcomp.mp.e2.ejerciciosclases.ej1;

import es.uah.matcomp.mp.e1.ejerciciosclases.ej9.Ball;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @Test
    void getName() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        assertDoesNotThrow(() -> a.getName());
        assertEquals("Tan Ah Teck", a.getName());
    }

    @Test
    void getEmail() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        assertDoesNotThrow(() -> a.getEmail());
        assertEquals("ahteck@nowhere.com", a.getEmail());
    }

    @Test
    void setEmail() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        assertDoesNotThrow(() -> a.setEmail("paulTan@nowhere.com"));
    }

    @Test
    void getGender() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        assertDoesNotThrow(() -> a.getGender());
        assertEquals('m', a.getGender());
    }

    @Test
    void testToString() {
        Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        assertDoesNotThrow(() -> a.toString());
        assertEquals("Author[name=Tan Ah Teck, email=ahteck@nowhere.com,gender=m]", a.toString());
    }
}
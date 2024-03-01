package es.uah.matcomp.mp.e2.ejerciciosclases.ej5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getId() {
        Customer c = new Customer(88, "Juan", 'm');
        assertDoesNotThrow(()-> c.getId());
        assertEquals(88, c.getId());
    }

    @Test
    void getName() {
        Customer c = new Customer(88, "Juan", 'm');
        assertDoesNotThrow(()-> c.getName());
        assertEquals("Juan", c.getName());
    }

    @Test
    void getGender() {
        Customer c = new Customer(88, "Juan", 'm');
        assertDoesNotThrow(()-> c.getGender());
        assertEquals('m', c.getGender());
    }

    @Test
    void testToString() {
        Customer c = new Customer(88, "Juan", 'm');
        assertDoesNotThrow(()-> c.toString());
        assertEquals(88, c.toString());
    }
}
package es.uah.matcomp.mp.e2.ejerciciosclases.ej4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getId() {
        Customer c = new Customer(88, "Juan", 10);
        assertDoesNotThrow(()-> c.getId());
        assertEquals(88, c.getId());
    }

    @Test
    void getName() {
        Customer c = new Customer(88, "Juan", 10);
        assertDoesNotThrow(()-> c.getName());
        assertEquals("Juan", c.getName());
    }

    @Test
    void getDiscount() {
        Customer c = new Customer(88, "Juan", 10);
        assertDoesNotThrow(()-> c.getDiscount());
        assertEquals(10, c.getDiscount());
    }

    @Test
    void setDiscount() {
        Customer c = new Customer(88, "Juan", 10);
        assertDoesNotThrow(()-> c.setDiscount(8));
    }

    @Test
    void testToString() {
        Customer c = new Customer(88, "Juan", 10);
        assertDoesNotThrow(()-> c.toString());
    }
}
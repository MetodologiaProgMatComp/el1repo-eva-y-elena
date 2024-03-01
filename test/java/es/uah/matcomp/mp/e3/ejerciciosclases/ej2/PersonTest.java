package es.uah.matcomp.mp.e3.ejerciciosclases.ej2;

import es.uah.matcomp.mp.e3.ejerciciosclases.ej1.Cylinder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getAddress() {
        Person p = new Person("Maria", "Madrid");
        assertDoesNotThrow(() -> p.getAddress());
        assertEquals("Madrid", p.getAddress());
    }

    @Test
    void setAddress() {
        Person p = new Person("Maria", "Madrid");
        assertDoesNotThrow(() -> p.setAddress("Murcia"));
    }

    @Test
    void testToString() {
        Person p = new Person("Maria", "Madrid");
        assertDoesNotThrow(() -> p.toString());
        assertEquals("Person[name=Maria,address=Madrid]", p.toString());
    }
}
package es.uah.matcomp.mp.e3.ejerciciosclases.ej6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MammalTest {

    @Test
    void testToString() {
        Animal a = new Mammal("blue");
        assertDoesNotThrow(() -> a.toString());
        assertEquals("Mammal[Animal[name=blue]]", a.toString());
    }
}
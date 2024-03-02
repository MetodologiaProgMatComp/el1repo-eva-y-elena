package es.uah.matcomp.mp.e3.ejerciciosclases.ej6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void greets() {
        Cat a = new Cat("blue");
        assertDoesNotThrow(() -> a.greets());
    }

    @Test
    void testToString() {
        Mammal a = new Cat("blue");
        assertDoesNotThrow(() -> a.toString());
        assertEquals("Cat[Mammal[Animal[name=blue]]]", a.toString());
    }
}
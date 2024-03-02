package es.uah.matcomp.mp.e3.ejerciciosclases.ej6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void greets() {
        Dog a = new Dog("blue");
        assertDoesNotThrow(() -> a.greets());
    }

    @Test
    void testGreets() {
        Dog a = new Dog("blue");
        Dog b = new Dog("blues");
        assertDoesNotThrow(() -> a.greets(b));
    }

    @Test
    void testToString() {
        Mammal a = new Dog("blue");
        assertDoesNotThrow(() -> a.toString());
        assertEquals("Dog[Mammal[Animal[name=blue]]]", a.toString());
    }
}
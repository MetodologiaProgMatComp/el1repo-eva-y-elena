package es.uah.matcomp.mp.e4.ejerciciosclases.ej6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void greets() {
        Animal d = new Dog("a");
        assertDoesNotThrow(()->d.greets());
    }

    @Test
    void testGreets() {
        Dog d = new Dog("a");
        Dog d2 = new Dog("b");
        assertDoesNotThrow(()->d.greets(d2));
    }
}
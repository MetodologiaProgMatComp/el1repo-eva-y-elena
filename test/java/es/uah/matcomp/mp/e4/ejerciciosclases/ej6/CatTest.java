package es.uah.matcomp.mp.e4.ejerciciosclases.ej6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void greets() {
        Animal c = new Cat("a");
        assertDoesNotThrow(()->c.greets());
    }
}
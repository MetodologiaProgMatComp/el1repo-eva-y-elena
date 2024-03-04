package es.uah.matcomp.mp.e4.ejerciciosclases.ej6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigDogTest {

    @Test
    void greets() {
        Animal b = new BigDog("a");
        assertDoesNotThrow(()->b.greets());
    }

    @Test
    void testGreets() {
        BigDog b = new BigDog("a");
        Dog d = new Dog("b");
        assertDoesNotThrow(()->b.greets(d));
    }

    @Test
    void testGreets1() {
        BigDog b = new BigDog("a");
        BigDog b2 = new BigDog("b");
        assertDoesNotThrow(()->b.greets(b2));
    }
}
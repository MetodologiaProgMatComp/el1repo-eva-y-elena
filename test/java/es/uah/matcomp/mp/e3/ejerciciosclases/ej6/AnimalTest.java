package es.uah.matcomp.mp.e3.ejerciciosclases.ej6;

import es.uah.matcomp.mp.e3.ejerciciosclases.ej5.Shape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void testToString() {
        Animal a = new Animal("blue");
        assertDoesNotThrow(() -> a.toString());
        assertEquals("Animal[name=blue]", a.toString());
    }
}
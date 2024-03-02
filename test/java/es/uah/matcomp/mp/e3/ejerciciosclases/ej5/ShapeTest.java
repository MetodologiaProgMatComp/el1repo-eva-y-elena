package es.uah.matcomp.mp.e3.ejerciciosclases.ej5;

import es.uah.matcomp.mp.e3.ejerciciosclases.ej2.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void getColor() {
        Shape s1 = new Shape();
        Shape s2 = new Shape("blue", false);
        assertDoesNotThrow(() -> s1.getColor());
        assertEquals("red", s1.getColor());
        assertDoesNotThrow(() -> s2.getColor());
        assertEquals("blue", s2.getColor());
    }

    @Test
    void setColor() {
        Shape s1 = new Shape();
        Shape s2 = new Shape("blue", false);
        assertDoesNotThrow(() -> s1.setColor("green"));
        assertDoesNotThrow(() -> s2.setColor("yellow"));
    }

    @Test
    void isFilled() {
        Shape s1 = new Shape();
        Shape s2 = new Shape("blue", false);
        assertDoesNotThrow(() -> s1.isFilled());
        assertEquals(true, s1.isFilled());
        assertDoesNotThrow(() -> s2.isFilled());
        assertEquals(false, s2.isFilled());
    }

    @Test
    void setFilled() {
        Shape s1 = new Shape();
        Shape s2 = new Shape("blue", false);
        assertDoesNotThrow(() -> s1.setFilled(false));
        assertDoesNotThrow(() -> s2.setFilled(true));
    }

    @Test
    void testToString() {
        Shape s1 = new Shape();
        Shape s2 = new Shape("blue", false);
        assertDoesNotThrow(() -> s1.toString());
        assertEquals("Shape[color=red,filled=true]", s1.toString());
        assertDoesNotThrow(() -> s2.toString());
        assertEquals("Shape[color=blue,filled=false]", s2.toString());

    }
}
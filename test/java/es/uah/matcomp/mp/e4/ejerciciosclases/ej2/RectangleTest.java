package es.uah.matcomp.mp.e4.ejerciciosclases.ej2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getArea() {
        Rectangle r = new Rectangle(2,3);
        assertDoesNotThrow(() -> r.getArea());
        assertEquals(6, r.getArea());
    }

    @Test
    void getPerimeter() {
        Rectangle r = new Rectangle(2,3);
        assertDoesNotThrow(() -> r.getPerimeter());
        assertEquals(10, r.getPerimeter());
    }

    @Test
    void testToString() {
        Rectangle r1 = new Rectangle(2,3);
        assertDoesNotThrow(() -> r1.toString());
        assertEquals("Rectangle[width=2.0,length=3.0]", r1.toString());
    }
}
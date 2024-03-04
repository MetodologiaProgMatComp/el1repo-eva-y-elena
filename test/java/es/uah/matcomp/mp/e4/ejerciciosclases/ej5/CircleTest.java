package es.uah.matcomp.mp.e4.ejerciciosclases.ej5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getArea() {
        Circle c = new Circle(3);
        assertDoesNotThrow(() -> c.getArea());
        assertEquals(Math.PI*9, c.getArea());
    }

    @Test
    void getPerimeter() {
        Circle c = new Circle(3);
        assertDoesNotThrow(() -> c.getPerimeter());
        assertEquals(Math.PI*6, c.getPerimeter());
    }

    @Test
    void testToString() {
        Circle c = new Circle(3);
        assertDoesNotThrow(() -> c.toString());
        assertEquals("Circle[radius=3.0]", c.toString());
    }
}
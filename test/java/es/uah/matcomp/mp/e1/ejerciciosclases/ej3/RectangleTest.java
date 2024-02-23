package es.uah.matcomp.mp.e1.ejerciciosclases.ej3;

import es.uah.matcomp.mp.e1.ejerciciosclases.ej2.Circle;
import org.junit.jupiter.api.Test;

import static java.lang.Math.round;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getLength() {
        Rectangle r = new Rectangle();
        assertDoesNotThrow(() -> r.getLength());
        assertEquals(1.0f, r.getLength());
    }

    @Test
    void setLength() {
        Rectangle r = new Rectangle();
        assertDoesNotThrow(() -> r.setLength(5.6f));
    }

    @Test
    void getWidth() {
        Rectangle r = new Rectangle();
        assertDoesNotThrow(() -> r.getWidth());
        assertEquals(1.0f, r.getWidth());
    }

    @Test
    void setWidth() {
        Rectangle r = new Rectangle();
        assertDoesNotThrow(() -> r.setWidth(7.8f));
    }

    @Test
    void getArea() {
        Rectangle r = new Rectangle(5.6f,7.8f);
        assertDoesNotThrow(() -> r.getArea());
        assertEquals(43.68*100, round(r.getArea()*100));
    }

    @Test
    void getPerimeter() {
        Rectangle r = new Rectangle(5.6f, 7.8f);
        assertDoesNotThrow(() -> r.getPerimeter());
        assertEquals(26.80*100, round(r.getPerimeter()*100));
    }

    @Test
    void testToString() {
        Rectangle r = new Rectangle();
        assertDoesNotThrow(() -> r.toString());
    }
}
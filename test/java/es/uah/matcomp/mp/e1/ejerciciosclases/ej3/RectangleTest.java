package es.uah.matcomp.mp.e1.ejerciciosclases.ej3;

import org.junit.jupiter.api.Test;

import static java.lang.Math.round;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getLength() {
        Rectangle r = new Rectangle();
        Rectangle r1 = new Rectangle(2.0f,3.0f);
        assertDoesNotThrow(() -> r.getLength());
        assertEquals(1.0f, r.getLength());
        assertDoesNotThrow(() -> r1.getLength());
        assertEquals(2.0f, r1.getLength());
    }

    @Test
    void setLength() {
        Rectangle r = new Rectangle();
        Rectangle r1 = new Rectangle(2.0f,3.0f);
        assertDoesNotThrow(() -> r.setLength(5.6f));
        assertDoesNotThrow(() -> r1.setLength(5.6f));
    }

    @Test
    void getWidth() {
        Rectangle r = new Rectangle();
        Rectangle r1 = new Rectangle(2.0f,3.0f);
        assertDoesNotThrow(() -> r.getWidth());
        assertEquals(1.0f, r.getWidth());
        assertDoesNotThrow(() -> r1.getWidth());
        assertEquals(3.0f, r1.getWidth());
    }

    @Test
    void setWidth() {
        Rectangle r = new Rectangle();
        Rectangle r1 = new Rectangle(2.0f,3.0f);
        assertDoesNotThrow(() -> r.setWidth(7.8f));
        assertDoesNotThrow(() -> r1.setWidth(7.8f));
    }

    @Test
    void getArea() {
        Rectangle r = new Rectangle(5.6f,7.8f);
        Rectangle r1 = new Rectangle(2.0f,3.0f);
        assertDoesNotThrow(() -> r.getArea());
        assertEquals(43.68*100, round(r.getArea()*100));
        assertDoesNotThrow(() -> r1.getArea());
        assertEquals((2.0*3.0), r1.getArea());
    }

    @Test
    void getPerimeter() {
        Rectangle r = new Rectangle(5.6f, 7.8f);
        Rectangle r1 = new Rectangle(2.0f,3.0f);
        assertDoesNotThrow(() -> r.getPerimeter());
        assertEquals(26.80*100, round(r.getPerimeter()*100));
        assertDoesNotThrow(() -> r1.getPerimeter());
        assertEquals(((2*2.0)+(2*3.0)), r1.getPerimeter());
    }

    @Test
    void testToString() {
        Rectangle r = new Rectangle();
        Rectangle r1 = new Rectangle(2.0f,3.0f);
        assertDoesNotThrow(() -> r.toString());
        assertDoesNotThrow(() -> r1.toString());
    }
}
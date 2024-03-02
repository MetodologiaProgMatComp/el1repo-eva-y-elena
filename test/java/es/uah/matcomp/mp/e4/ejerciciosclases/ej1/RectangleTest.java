package es.uah.matcomp.mp.e4.ejerciciosclases.ej1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getWidth() {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2,3);
        Rectangle r3 = new Rectangle("blue", false,4,6);
        assertDoesNotThrow(() -> r1.getWidth());
        assertEquals(1, r1.getWidth());
        assertDoesNotThrow(() -> r2.getWidth());
        assertEquals(2, r2.getWidth());
        assertDoesNotThrow(() -> r3.getWidth());
        assertEquals(4, r3.getWidth());
    }

    @Test
    void setWidth() {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2,3);
        Rectangle r3 = new Rectangle("blue", false,4,6);
        assertDoesNotThrow(() -> r1.setWidth(7));
        assertDoesNotThrow(() -> r2.setWidth(8));
        assertDoesNotThrow(() -> r3.setWidth(9));
    }

    @Test
    void getLength() {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2,3);
        Rectangle r3 = new Rectangle("blue", false,4,6);
        assertDoesNotThrow(() -> r1.getLength());
        assertEquals(1, r1.getLength());
        assertDoesNotThrow(() -> r2.getLength());
        assertEquals(3, r2.getLength());
        assertDoesNotThrow(() -> r3.getLength());
        assertEquals(6, r3.getLength());
    }

    @Test
    void setLength() {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2,3);
        Rectangle r3 = new Rectangle("blue", false,4,6);
        assertDoesNotThrow(() -> r1.setLength(7));
        assertDoesNotThrow(() -> r2.setLength(8));
        assertDoesNotThrow(() -> r3.setLength(9));
    }

    @Test
    void getArea() {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2,3);
        Rectangle r3 = new Rectangle("blue", false,4,6);
        assertDoesNotThrow(() -> r1.getArea());
        assertEquals(1, r1.getArea());
        assertDoesNotThrow(() -> r2.getArea());
        assertEquals(6, r2.getArea());
        assertDoesNotThrow(() -> r3.getArea());
        assertEquals(24, r3.getArea());
    }

    @Test
    void getPerimeter() {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2,3);
        Rectangle r3 = new Rectangle("blue", false,4,6);
        assertDoesNotThrow(() -> r1.getPerimeter());
        assertEquals(4, r1.getPerimeter());
        assertDoesNotThrow(() -> r2.getPerimeter());
        assertEquals(10, r2.getPerimeter());
        assertDoesNotThrow(() -> r3.getPerimeter());
        assertEquals(20, r3.getPerimeter());
    }

    @Test
    void testToString() {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2,3);
        Rectangle r3 = new Rectangle("blue", false,4,6);
        assertDoesNotThrow(() -> r1.toString());
        assertEquals("Rectangle[Shape[color=red,filled=true],width=1.0,length=1.0]", r1.toString());
        assertDoesNotThrow(() -> r2.toString());
        assertEquals("Rectangle[Shape[color=red,filled=true],width=2.0,length=3.0]", r2.toString());
        assertDoesNotThrow(() -> r3.toString());
        assertEquals("Rectangle[Shape[color=blue,filled=false],width=4.0,length=6.0]", r3.toString());
    }
}
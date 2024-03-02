package es.uah.matcomp.mp.e3.ejerciciosclases.ej7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void testToString() {
        Point p = new Point(1,2);
        assertDoesNotThrow(()->p.toString());
        assertEquals("Point: (1,2)", p.toString());
    }

    @Test
    void getX() {
        Point p = new Point(1,2);
        assertDoesNotThrow(()->p.getX());
        assertEquals(1, p.getX());
    }

    @Test
    void getY() {
        Point p = new Point(1,2);
        assertDoesNotThrow(()->p.getY());
        assertEquals(2, p.getY());
    }

    @Test
    void setX() {
        Point p = new Point(1,2);
        assertDoesNotThrow(()->p.setX(2));
    }

    @Test
    void setY() {
        Point p = new Point(1,2);
        assertDoesNotThrow(()->p.setY(3));
    }

    @Test
    void setXY() {
        Point p = new Point(1,2);
        assertDoesNotThrow(()->p.setXY(2,3));
    }
}
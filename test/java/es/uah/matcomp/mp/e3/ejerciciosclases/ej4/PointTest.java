package es.uah.matcomp.mp.e3.ejerciciosclases.ej4;

import es.uah.matcomp.mp.e3.ejerciciosclases.ej3.Point2D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void getX() {
        Point p1 = new Point();
        Point p2 = new Point(1,2);
        assertDoesNotThrow(()->p1.getX());
        assertDoesNotThrow(()->p2.getX());
        assertEquals(0, p1.getX());
        assertEquals(1, p2.getX());
    }

    @Test
    void setX() {
        Point p1 = new Point();
        Point p2 = new Point(1,2);
        assertDoesNotThrow(()->p1.setX(2));
        assertDoesNotThrow(()->p2.setX(2));
    }

    @Test
    void getY() {
        Point p1 = new Point();
        Point p2 = new Point(1,2);
        assertDoesNotThrow(()->p1.getY());
        assertDoesNotThrow(()->p2.getY());
        assertEquals(0, p1.getY());
        assertEquals(2, p2.getY());
    }

    @Test
    void setY() {
        Point p1 = new Point();
        Point p2 = new Point(1,2);
        assertDoesNotThrow(()->p1.setY(2));
        assertDoesNotThrow(()->p2.setY(3));
    }

    @Test
    void getXY() {
        Point p1 = new Point();
        Point p2 = new Point(1,2);
        assertDoesNotThrow(()->p1.getXY());
        assertDoesNotThrow(()->p2.getXY());
    }

    @Test
    void setXY() {
        Point p1 = new Point();
        Point p2 = new Point(1,2);
        assertDoesNotThrow(()->p1.setXY(2,3));
        assertDoesNotThrow(()->p2.setXY(2,3));
    }

    @Test
    void testToString() {
        Point p1 = new Point();
        Point p2 = new Point(1,2);
        assertDoesNotThrow(()->p1.toString());
        assertDoesNotThrow(()->p2.toString());
        assertEquals("(0.0,0.0)", p1.toString());
        assertEquals("(1.0,2.0)", p2.toString());
    }

}
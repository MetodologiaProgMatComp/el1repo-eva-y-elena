package es.uah.matcomp.mp.e3.ejerciciosclases.ej3;

import es.uah.matcomp.mp.e2.ejerciciosclases.ej6.MyPoint;
import es.uah.matcomp.mp.e3.ejerciciosclases.ej2.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {
    @Test
    void getX() {
        Point2D p1 = new Point2D();
        Point2D p2 = new Point2D(1,2);
        assertDoesNotThrow(()->p1.getX());
        assertDoesNotThrow(()->p2.getX());
        assertEquals(0, p1.getX());
        assertEquals(1, p2.getX());
    }

    @Test
    void setX() {
        Point2D p1 = new Point2D();
        Point2D p2 = new Point2D(1,2);
        assertDoesNotThrow(()->p1.setX(2));
        assertDoesNotThrow(()->p2.setX(2));
    }

    @Test
    void getY() {
        Point2D p1 = new Point2D();
        Point2D p2 = new Point2D(1,2);
        assertDoesNotThrow(()->p1.getY());
        assertDoesNotThrow(()->p2.getY());
        assertEquals(0, p1.getY());
        assertEquals(2, p2.getY());
    }

    @Test
    void setY() {
        Point2D p1 = new Point2D();
        Point2D p2 = new Point2D(1,2);
        assertDoesNotThrow(()->p1.setY(2));
        assertDoesNotThrow(()->p2.setY(3));
    }

    @Test
    void getXY() {
        Point2D p1 = new Point2D();
        Point2D p2 = new Point2D(1,2);
        assertDoesNotThrow(()->p1.getXY());
        assertDoesNotThrow(()->p2.getXY());
    }

    @Test
    void setXY() {
        Point2D p1 = new Point2D();
        Point2D p2 = new Point2D(1,2);
        assertDoesNotThrow(()->p1.setXY(2,3));
        assertDoesNotThrow(()->p2.setXY(2,3));
    }

    @Test
    void testToString() {
        Point2D p1 = new Point2D();
        Point2D p2 = new Point2D(1,2);
        assertDoesNotThrow(()->p1.toString());
        assertDoesNotThrow(()->p2.toString());
        assertEquals("(0.0,0.0)", p1.toString());
        assertEquals("(1.0,2.0)", p2.toString());
    }


}
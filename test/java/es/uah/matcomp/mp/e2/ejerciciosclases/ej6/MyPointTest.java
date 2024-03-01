package es.uah.matcomp.mp.e2.ejerciciosclases.ej6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPointTest {

    @Test
    void getX() {
        MyPoint m = new MyPoint();
        MyPoint m1 = new MyPoint(1,2);
        assertDoesNotThrow(()->m.getX());
        assertDoesNotThrow(()->m1.getX());
        assertEquals(0, m.getX());
        assertEquals(1, m1.getX());
    }

    @Test
    void setX() {
        MyPoint m = new MyPoint();
        MyPoint m1 = new MyPoint(1,2);
        assertDoesNotThrow(()->m.setX(2));
        assertDoesNotThrow(()->m1.setX(2));
    }

    @Test
    void getY() {
        MyPoint m = new MyPoint();
        MyPoint m1 = new MyPoint(1,2);
        assertDoesNotThrow(()->m.getY());
        assertDoesNotThrow(()->m1.getY());
        assertEquals(0, m.getY());
        assertEquals(2, m1.getY());
    }

    @Test
    void setY() {
        MyPoint m = new MyPoint();
        MyPoint m1 = new MyPoint(1,2);
        assertDoesNotThrow(()->m.setY(2));
        assertDoesNotThrow(()->m1.setY(3));
    }

    @Test
    void getXY() {
        MyPoint m = new MyPoint();
        MyPoint m1 = new MyPoint(1,2);
        assertDoesNotThrow(()->m.getXY());
        assertDoesNotThrow(()->m1.getXY());
    }

    @Test
    void setXY() {
        MyPoint m = new MyPoint();
        MyPoint m1 = new MyPoint(1,2);
        assertDoesNotThrow(()->m.setXY(2,3));
        assertDoesNotThrow(()->m1.setXY(2,3));
    }

    @Test
    void testToString() {
        MyPoint m = new MyPoint();
        MyPoint m1 = new MyPoint(1,2);
        assertDoesNotThrow(()->m.toString());
        assertDoesNotThrow(()->m1.toString());
    }

    @Test
    void distance() {
        MyPoint m = new MyPoint();
        MyPoint m1 = new MyPoint(2,2);
        assertEquals(Math.sqrt(9+4), m.distance(3,2));
        assertEquals(Math.sqrt(2), m1.distance(3,3));
        assertDoesNotThrow(()->m.distance(3,2));
        assertDoesNotThrow(()->m1.distance(3,2));
    }

    @Test
    void testDistance() {
        MyPoint m = new MyPoint();
        MyPoint m1 = new MyPoint(1,2);
        assertEquals(Math.sqrt(5), m.distance(m1));
        assertEquals(Math.sqrt(5), m1.distance(m));
        assertDoesNotThrow(()->m.distance(m1));
        assertDoesNotThrow(()->m1.distance(m));
    }

    @Test
    void testDistance1() {
        MyPoint m = new MyPoint();
        MyPoint m1 = new MyPoint(1,2);
        assertEquals(0, m.distance());
        assertEquals(Math.sqrt(5), m1.distance());
        assertDoesNotThrow(()->m.distance());
        assertDoesNotThrow(()->m1.distance());
    }
}
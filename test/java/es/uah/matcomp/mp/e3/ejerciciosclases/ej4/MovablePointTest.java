package es.uah.matcomp.mp.e3.ejerciciosclases.ej4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {

    @Test
    void getXSpeed() {
        MovablePoint m1 = new MovablePoint(1,2,3,4);
        MovablePoint m2 = new MovablePoint(1,2);
        MovablePoint m3 = new MovablePoint();
        assertDoesNotThrow(()->m1.getXSpeed());
        assertDoesNotThrow(()->m2.getXSpeed());
        assertDoesNotThrow(()->m3.getXSpeed());
        assertEquals(3, m1.getXSpeed());
        assertEquals(1, m2.getXSpeed());
        assertEquals(0, m3.getXSpeed());
    }

    @Test
    void setXSpeed() {
        MovablePoint m1 = new MovablePoint(1,2,3,4);
        MovablePoint m2 = new MovablePoint(1,2);
        MovablePoint m3 = new MovablePoint();
        assertDoesNotThrow(()->m1.setXSpeed(8));
        assertDoesNotThrow(()->m2.setXSpeed(9));
        assertDoesNotThrow(()->m3.setXSpeed(6));
    }

    @Test
    void getYSpeed() {
        MovablePoint m1 = new MovablePoint(1,2,3,4);
        MovablePoint m2 = new MovablePoint(1,2);
        MovablePoint m3 = new MovablePoint();
        assertDoesNotThrow(()->m1.getYSpeed());
        assertDoesNotThrow(()->m2.getYSpeed());
        assertDoesNotThrow(()->m3.getYSpeed());
        assertEquals(4, m1.getYSpeed());
        assertEquals(2, m2.getYSpeed());
        assertEquals(0, m3.getYSpeed());
    }

    @Test
    void setYSpeed() {
        MovablePoint m1 = new MovablePoint(1,2,3,4);
        MovablePoint m2 = new MovablePoint(1,2);
        MovablePoint m3 = new MovablePoint();
        assertDoesNotThrow(()->m1.setYSpeed(5));
        assertDoesNotThrow(()->m2.setYSpeed(5));
        assertDoesNotThrow(()->m3.setYSpeed(7));
    }

    @Test
    void setSpeed() {
        MovablePoint m1 = new MovablePoint(1,2,3,4);
        MovablePoint m2 = new MovablePoint(1,2);
        MovablePoint m3 = new MovablePoint();
        assertDoesNotThrow(()->m1.setSpeed(5,4));
        assertDoesNotThrow(()->m2.setSpeed(5,2));
        assertDoesNotThrow(()->m3.setSpeed(7,9));
    }

    @Test
    void getSpeed() {
        MovablePoint m1 = new MovablePoint(1,2,3,4);
        MovablePoint m2 = new MovablePoint(1,2);
        MovablePoint m3 = new MovablePoint();
        assertDoesNotThrow(()->m1.getSpeed());
        assertDoesNotThrow(()->m2.getSpeed());
        assertDoesNotThrow(()->m3.getSpeed());
    }

    @Test
    void testToString() {
        MovablePoint m1 = new MovablePoint(1,2,3,4);
        MovablePoint m2 = new MovablePoint(1,2);
        MovablePoint m3 = new MovablePoint();
        assertDoesNotThrow(()->m1.getYSpeed());
        assertDoesNotThrow(()->m2.getYSpeed());
        assertDoesNotThrow(()->m3.getYSpeed());
        assertEquals("(1.0,2.0),speed=(3.0,4.0)", m1.toString());
        assertEquals("(0.0,0.0),speed=(1.0,2.0)", m2.toString());
        assertEquals("(0.0,0.0),speed=(0.0,0.0)", m3.toString());
    }

    @Test
    void move() {
        MovablePoint m1 = new MovablePoint(1,2,3,4);
        MovablePoint m2 = new MovablePoint(1,2);
        MovablePoint m3 = new MovablePoint();
        assertDoesNotThrow(()->m1.move());
        assertDoesNotThrow(()->m2.move());
        assertDoesNotThrow(()->m3.move());
        assertEquals( "(7.0,10.0),speed=(3.0,4.0)",m1.move());
        assertEquals("(1.0,2.0),speed=(1.0,2.0)", m2.move());
        assertEquals("(0.0,0.0),speed=(0.0,0.0)", m3.move());
    }
}
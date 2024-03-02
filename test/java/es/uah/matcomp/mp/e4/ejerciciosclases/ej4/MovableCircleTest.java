package es.uah.matcomp.mp.e4.ejerciciosclases.ej4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovableCircleTest {

    @Test
    void testToString() {
        Movable c = new MovableCircle(2,3,4,5,3);
        assertDoesNotThrow(() -> c.toString());
        assertEquals("(2,3) speed=(4,5),radius=3", c.toString());
    }

    @Test
    void moveUp() {
        Movable c = new MovableCircle(2,3,4,5,3);
        assertDoesNotThrow(() -> c.moveUp());
    }

    @Test
    void moveDown() {
        Movable c = new MovableCircle(2,3,4,5,3);
        assertDoesNotThrow(() -> c.moveDown());
    }

    @Test
    void moveLeft() {
        Movable c = new MovableCircle(2,3,4,5,3);
        assertDoesNotThrow(() -> c.moveLeft());
    }

    @Test
    void moveRight() {
        Movable c = new MovableCircle(2,3,4,5,3);
        assertDoesNotThrow(() -> c.moveRight());
    }
}
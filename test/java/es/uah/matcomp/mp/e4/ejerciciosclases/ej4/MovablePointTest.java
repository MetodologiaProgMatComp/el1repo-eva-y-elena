package es.uah.matcomp.mp.e4.ejerciciosclases.ej4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {

    @Test
    void testToString() {
        Movable p = new MovablePoint(2,3,4,5);
        assertDoesNotThrow(() -> p.toString());
        assertEquals("(2,3) speed=(4,5)", p.toString());
    }

    @Test
    void moveUp() {
        Movable p = new MovablePoint(2,3,4,5);
        assertDoesNotThrow(() -> p.moveUp());
    }

    @Test
    void moveDown() {
        Movable p = new MovablePoint(2,3,4,5);
        assertDoesNotThrow(() -> p.moveDown());
    }

    @Test
    void moveLeft() {
        Movable p = new MovablePoint(2,3,4,5);
        assertDoesNotThrow(() -> p.moveLeft());
    }

    @Test
    void moveRight() {
        Movable p = new MovablePoint(2,3,4,5);
        assertDoesNotThrow(() -> p.moveRight());
    }
}
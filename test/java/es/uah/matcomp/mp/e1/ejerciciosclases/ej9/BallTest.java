package es.uah.matcomp.mp.e1.ejerciciosclases.ej9;

import es.uah.matcomp.mp.e1.ejerciciosclases.ej8.Time;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    @Test
    void getX() {
        Ball b = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertDoesNotThrow(() -> b.getX());
    }

    @Test
    void setX() {
        Ball b = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertDoesNotThrow(() -> b.setX(80.0f));
    }

    @Test
    void getY() {
        Ball b = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertDoesNotThrow(() -> b.getY());
    }

    @Test
    void setY() {
        Ball b = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertDoesNotThrow(() -> b.setY(35.0f));
    }

    @Test
    void getRadius() {
        Ball b = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertDoesNotThrow(() -> b.getRadius());
    }

    @Test
    void setRadius() {
        Ball b = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertDoesNotThrow(() -> b.setRadius(5));
    }

    @Test
    void getXDelta() {
        Ball b = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertDoesNotThrow(() -> b.getXDelta());
    }

    @Test
    void setXDelta() {
        Ball b = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertDoesNotThrow(() -> b.setXDelta(4.0f));
    }

    @Test
    void getYDelta() {
        Ball b = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertDoesNotThrow(() -> b.getYDelta());
    }

    @Test
    void setYDelta() {
        Ball b = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertDoesNotThrow(() -> b.setYDelta(6.0f));
    }

    @Test
    void move() {
        Ball b = new Ball(80.0f, 35.0f, 5, 4.0f, 6.0f);
        assertDoesNotThrow(() -> b.move());
    }

    @Test
    void reflectHorizontal() {
        Ball b = new Ball(80.0f, 35.0f, 5, 4.0f, 6.0f);
        assertDoesNotThrow(() -> b.reflectHorizontal());
    }

    @Test
    void reflectVertical() {
        Ball b = new Ball(80.0f, 35.0f, 5, 4.0f, 6.0f);
        assertDoesNotThrow(() -> b.reflectVertical());
    }

    @Test
    void testToString() {
        Ball b = new Ball(80.0f, 35.0f, 5, 4.0f, 6.0f);
        assertDoesNotThrow(() -> b.toString());
    }
}
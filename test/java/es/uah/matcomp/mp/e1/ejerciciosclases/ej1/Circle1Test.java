package es.uah.matcomp.mp.e1.ejerciciosclases.ej1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Circle1Test {

    @Test
    void getRadius() {
        Circle1 c = new Circle1();
        assertDoesNotThrow(() -> c.getRadius());
    }

    @Test
    void getArea() {
        Circle1 c = new Circle1();
        assertDoesNotThrow(() -> c.getArea());
    }

    @Test
    void getColor() {
        Circle1 c = new Circle1();
        assertDoesNotThrow(() -> c.getColor());
    }

    @Test
    void setRadius() {
        Circle1 c = new Circle1();
        assertDoesNotThrow(() -> c.setRadius(8));
    }

    @Test
    void setColor() {
        Circle1 c = new Circle1();
        assertDoesNotThrow(() -> c.getColor());
    }

    @Test
    void testToString() {
        Circle1 c = new Circle1();
        assertDoesNotThrow(() -> c.toString());
    }
}
package es.uah.matcomp.mp.e1.ejerciciosclases.ej2;

import es.uah.matcomp.mp.e1.ejerciciosclases.ej1.Circle1;
import org.junit.jupiter.api.Test;

import static java.lang.Math.round;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle c = new Circle();
        assertDoesNotThrow(() -> c.getRadius());
    }

    @Test
    void setRadius() {
        Circle c = new Circle();
        assertDoesNotThrow(() -> c.setRadius(2.2));
    }

    @Test
    void getArea() {
        Circle c = new Circle(2.2);
        assertDoesNotThrow(() -> c.getArea());
        assertEquals(15.21*100, round(c.getArea()*100));
    }

    @Test
    void getCircumference() {
        Circle c = new Circle(2.2);
        assertDoesNotThrow(() -> c.getCircumference());
        assertEquals(13.82*100, round(c.getCircumference()*100));
    }

    @Test
    void testToString() {
        Circle c = new Circle();
        assertDoesNotThrow(() -> c.toString());
    }
}
package es.uah.matcomp.mp.e1.ejerciciosclases.ej2;

import es.uah.matcomp.mp.e1.ejerciciosclases.ej1.Circle1;
import org.junit.jupiter.api.Test;

import static java.lang.Math.round;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle c = new Circle();
        Circle c1 = new Circle(2.0);
        assertDoesNotThrow(() -> c.getRadius());
        assertEquals(1.0, c.getRadius());
        assertDoesNotThrow(() -> c1.getRadius());
        assertEquals(2.0, c1.getRadius());
    }

    @Test
    void setRadius() {
        Circle c = new Circle();
        Circle c1 = new Circle(2.0);
        assertDoesNotThrow(() -> c.setRadius(8));
        assertDoesNotThrow(() -> c1.setRadius(-8));
    }

    @Test
    void getArea() {
        Circle c = new Circle();
        Circle c1 = new Circle(2.0);
        assertDoesNotThrow(() -> c.getArea());
        assertEquals(Math.PI, c.getArea());
        assertDoesNotThrow(() -> c1.getArea());
        assertEquals((Math.PI*2*2), c1.getArea());
    }

    @Test
    void getCircumference() {
        Circle c = new Circle(2.2);
        Circle c1 = new Circle();
        assertDoesNotThrow(() -> c.getCircumference());
        assertEquals((2*Math.PI), c1.getCircumference());
        assertDoesNotThrow(() -> c1.getCircumference());
        assertEquals(13.82*100, round(c.getCircumference()*100));
    }

    @Test
    void testToString() {
        Circle c = new Circle();
        Circle c1 = new Circle(2.0);
        assertDoesNotThrow(() -> c.toString());
        assertDoesNotThrow(() -> c1.toString());
    }
}
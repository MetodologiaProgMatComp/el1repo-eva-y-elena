package es.uah.matcomp.mp.e1.ejerciciosclases.ej1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Circle1Test {

    @Test
    void getRadius() {
        Circle1 c = new Circle1();
        Circle1 c1 = new Circle1(2.0);
        Circle1 c2 = new Circle1(3.0, "blue");
        assertDoesNotThrow(() -> c.getRadius());
        assertEquals(1.0, c.getRadius());
        assertDoesNotThrow(() -> c1.getRadius());
        assertEquals(2.0, c1.getRadius());
        assertDoesNotThrow(() -> c2.getRadius());
        assertEquals(3.0, c2.getRadius());
    }

    @Test
    void getArea() {
        Circle1 c = new Circle1();
        Circle1 c1 = new Circle1(2.0);
        Circle1 c2 = new Circle1(3.0, "blue");
        assertDoesNotThrow(() -> c.getArea());
        assertEquals(Math.PI, c.getArea());
        assertDoesNotThrow(() -> c1.getArea());
        assertEquals((Math.PI*2*2), c1.getArea());
        assertDoesNotThrow(() -> c2.getArea());
        assertEquals((Math.PI*3*3), c2.getArea());
    }

    @Test
    void getColor() {
        Circle1 c = new Circle1();
        Circle1 c1 = new Circle1(2.0);
        Circle1 c2 = new Circle1(3.0, "blue");
        assertDoesNotThrow(() -> c.getColor());
        assertEquals("red", c.getColor());
        assertDoesNotThrow(() -> c1.getColor());
        assertEquals("red", c1.getColor());
        assertDoesNotThrow(() -> c2.getColor());
        assertEquals("blue", c2.getColor());
    }

    @Test
    void setRadius() {
        Circle1 c = new Circle1();
        Circle1 c1 = new Circle1(2.0);
        Circle1 c2 = new Circle1(3.0, "blue");
        assertDoesNotThrow(() -> c.setRadius(8));
        assertDoesNotThrow(() -> c1.setRadius(8));
        assertDoesNotThrow(() -> c2.setRadius(-8));
    }

    @Test
    void setColor() {
        Circle1 c = new Circle1();
        Circle1 c1 = new Circle1(2.0);
        Circle1 c2 = new Circle1(3.0, "blue");
        assertDoesNotThrow(() -> c.setColor("green"));
        assertDoesNotThrow(() -> c1.setColor("green"));
        assertDoesNotThrow(() -> c2.setColor("green"));
    }

    @Test
    void testToString() {
        Circle1 c = new Circle1();
        Circle1 c1 = new Circle1(2.0);
        Circle1 c2 = new Circle1(3.0, "blue");
        assertDoesNotThrow(() -> c.toString());
        assertDoesNotThrow(() -> c1.toString());
        assertDoesNotThrow(() -> c2.toString());
    }
}
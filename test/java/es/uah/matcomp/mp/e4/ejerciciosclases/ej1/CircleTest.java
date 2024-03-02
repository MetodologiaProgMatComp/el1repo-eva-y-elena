package es.uah.matcomp.mp.e4.ejerciciosclases.ej1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void getRadius() {
        Circle c1 = new Circle();
        Circle c2 = new Circle(3);
        Circle c3 = new Circle("blue", false,4);
        assertDoesNotThrow(() -> c1.getRadius());
        assertEquals(1, c1.getRadius());
        assertDoesNotThrow(() -> c2.getRadius());
        assertEquals(3, c2.getRadius());
        assertDoesNotThrow(() -> c3.getRadius());
        assertEquals(4, c3.getRadius());
    }

    @Test
    void setRadius() {
        Circle c1 = new Circle();
        Circle c2 = new Circle(3);
        Circle c3 = new Circle("blue", false,4);
        assertDoesNotThrow(() -> c1.setRadius(5));
        assertDoesNotThrow(() -> c2.setRadius(6));
        assertDoesNotThrow(() -> c3.setRadius(7));
    }

    @Test
    void getArea() {
        Circle c1 = new Circle();
        Circle c2 = new Circle(3);
        Circle c3 = new Circle("blue", false,4);
        assertDoesNotThrow(() -> c1.getArea());
        assertEquals(Math.PI, c1.getArea());
        assertDoesNotThrow(() -> c2.getArea());
        assertEquals(Math.PI*9, c2.getArea());
        assertDoesNotThrow(() -> c3.getArea());
        assertEquals(Math.PI*16, c3.getArea());
    }

    @Test
    void getPerimeter() {
        Circle c1 = new Circle();
        Circle c2 = new Circle(3);
        Circle c3 = new Circle("blue", false,4);
        assertDoesNotThrow(() -> c1.getPerimeter());
        assertEquals(Math.PI*2, c1.getPerimeter());
        assertDoesNotThrow(() -> c2.getPerimeter());
        assertEquals(Math.PI*6, c2.getPerimeter());
        assertDoesNotThrow(() -> c3.getPerimeter());
        assertEquals(Math.PI*8, c3.getPerimeter());

    }

    @Test
    void testToString() {
        Circle c1 = new Circle();
        Circle c2 = new Circle(3);
        Circle c3 = new Circle("blue", false,4);
        assertDoesNotThrow(() -> c1.toString());
        assertEquals("Circle[Shape[color=red,filled=true],radius=1.0]", c1.toString());
        assertDoesNotThrow(() -> c2.toString());
        assertEquals("Circle[Shape[color=red,filled=true],radius=3.0]", c2.toString());
        assertDoesNotThrow(() -> c3.toString());
        assertEquals("Circle[Shape[color=blue,filled=false],radius=4.0]", c3.toString());
    }


}
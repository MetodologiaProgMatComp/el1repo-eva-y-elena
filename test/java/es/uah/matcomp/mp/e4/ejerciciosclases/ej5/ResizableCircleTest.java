package es.uah.matcomp.mp.e4.ejerciciosclases.ej5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResizableCircleTest {

    @Test
    void testToString() {
        ResizableCircle c = new ResizableCircle(3);
        assertDoesNotThrow(() -> c.toString());
        assertEquals("ResizableCircle[Circle[radius=3.0]]", c.toString());
    }

    @Test
    void resize() {
        ResizableCircle c = new ResizableCircle(3);
        assertDoesNotThrow(() -> c.resize(150));
    }
}
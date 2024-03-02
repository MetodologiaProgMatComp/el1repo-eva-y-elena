package es.uah.matcomp.mp.e3.ejerciciosclases.ej8;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void getHeight() {
        Cylinder c1 = new Cylinder();
        Cylinder c2 = new Cylinder(2);
        Cylinder c3 = new Cylinder(2,3);
        assertDoesNotThrow(() -> c1.getHeight());
        assertEquals(1.0, c1.getHeight());
        assertDoesNotThrow(() -> c2.getHeight());
        assertEquals(2.0, c2.getHeight());
        assertDoesNotThrow(() -> c3.getHeight());
        assertEquals(3.0, c3.getHeight());
    }

    @Test
    void getVolume() {
        Cylinder c1 = new Cylinder();
        Cylinder c2 = new Cylinder(2);
        Cylinder c3 = new Cylinder(2,3);
        assertDoesNotThrow(() -> c1.getVolume());
        assertEquals(Math.PI*1, c1.getVolume());
        assertDoesNotThrow(() -> c2.getVolume());
        assertEquals(Math.PI*2, c2.getVolume());
        assertDoesNotThrow(() -> c3.getVolume());
        assertEquals(Math.PI*12, c3.getVolume());
    }

    @Test
    void testToString() {
        Cylinder c1 = new Cylinder();
        Cylinder c2 = new Cylinder(2);
        Cylinder c3 = new Cylinder(2,3);
        assertDoesNotThrow(() -> c1.toString());
        assertEquals("Cylinder: composes of Circle [radius= 1.0 color= red] height=1.0", c1.toString());
        assertDoesNotThrow(() -> c2.toString());
        assertEquals("Cylinder: composes of Circle [radius= 1.0 color= red] height=2.0", c2.toString());
        assertDoesNotThrow(() -> c3.toString());
        assertEquals("Cylinder: composes of Circle [radius= 2.0 color= red] height=3.0", c3.toString());
    }
}
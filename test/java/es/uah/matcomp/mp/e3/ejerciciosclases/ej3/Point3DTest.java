package es.uah.matcomp.mp.e3.ejerciciosclases.ej3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {

    @Test
    void getZ() {
        Point3D p1 = new Point3D();
        Point3D p2 = new Point3D(1,1,1);
        assertDoesNotThrow(()->p1.getZ());
        assertDoesNotThrow(()->p2.getZ());
        assertEquals(0, p1.getZ());
        assertEquals(1, p2.getZ());
    }

    @Test
    void setZ() {
        Point3D p1 = new Point3D();
        Point3D p2 = new Point3D(1,1,1);
        assertDoesNotThrow(()->p1.setZ(2));
        assertDoesNotThrow(()->p2.setZ(3));
    }

    @Test
    void setXYZ() {
        Point3D p1 = new Point3D();
        Point3D p2 = new Point3D(1,1,1);
        assertDoesNotThrow(()->p1.setXYZ(2,2,2));
        assertDoesNotThrow(()->p2.setXYZ(3,3,3));
    }

    @Test
    void getXYZ() {
        Point3D p1 = new Point3D();
        Point3D p2 = new Point3D(1,1,1);
        assertDoesNotThrow(()->p1.getXYZ());
        assertDoesNotThrow(()->p2.getXYZ());
    }

    @Test
    void testToString() {
        Point3D p1 = new Point3D();
        Point3D p2 = new Point3D(1,1,1);
        assertDoesNotThrow(()->p1.toString());
        assertDoesNotThrow(()->p2.toString());
        assertEquals("(0.0,0.0,0.0)", p1.toString());
        assertEquals("(1.0,1.0,1.0)", p2.toString());
    }
}
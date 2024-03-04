package es.uah.matcomp.mp.e2.ejerciciosclases.ej9;
import es.uah.matcomp.mp.e2.ejerciciosclases.ej6.MyPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTriangleTest {

    @Test
    void testToString() {
        MyTriangle t1 = new MyTriangle(1,2,3,4,5,6);
        MyPoint p1 = new MyPoint(2,3);
        MyPoint p2 = new MyPoint(1,4);
        MyPoint p3 = new MyPoint(6,8);
        MyTriangle t2 = new MyTriangle(p1,p2,p3);
        assertDoesNotThrow(()->t1.toString());
        assertDoesNotThrow(()->t2.toString());
        assertEquals("MyTriangle[v1=(1,2),v2=(3,4),v3=(5,6)]", t1.toString());
        assertEquals("MyTriangle[v1=(2,3),v2=(1,4),v3=(6,8)]", t2.toString());
    }

    @Test
    void getPerimeter() {
        MyTriangle t1 = new MyTriangle(1,2,3,4,5,6);
        MyPoint p1 = new MyPoint(2,3);
        MyPoint p2 = new MyPoint(1,4);
        MyPoint p3 = new MyPoint(6,8);
        MyTriangle t2 = new MyTriangle(p1,p2,p3);
        assertDoesNotThrow(()->t1.getPerimeter());
        assertDoesNotThrow(()->t2.getPerimeter());
        assertEquals(p1.distance(p2)+p2.distance(p3)+p3.distance(p1), t2.getPerimeter());
        assertEquals(new MyPoint(1,2).distance(3,4)+new MyPoint(3,4).distance(5,6)+new MyPoint(5,6).distance(1,2), t1.getPerimeter());
    }

    @Test
    void getType() {
        MyTriangle t1 = new MyTriangle(1,3,3,4,5,6);
        MyPoint p1 = new MyPoint(1,1);
        MyPoint p2 = new MyPoint(1,3);
        MyPoint p3 = new MyPoint(2,2);
        MyTriangle t2 = new MyTriangle(p1,p2,p3);
        MyTriangle t3 = new MyTriangle(0,0,0,0,0,0);
        assertDoesNotThrow(()->t1.getType());
        assertDoesNotThrow(()->t2.getType());
        assertDoesNotThrow(()->t3.getType());
        assertEquals("Scalene", t1.getType());
        assertEquals("Isosceles", t2.getType());
        assertEquals("Equilateral", t3.getType());
    }
}
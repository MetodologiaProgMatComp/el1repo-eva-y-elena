package es.uah.matcomp.mp.e2.ejerciciosclases.ej8;

import es.uah.matcomp.mp.e2.ejerciciosclases.ej6.MyPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircleTest {

    @Test
    void getRadius() {
        MyCircle c = new MyCircle();
        MyCircle c1 = new MyCircle(1,2,3);
        MyPoint m = new MyPoint(2,3);
        MyCircle c2 = new MyCircle(m, 2);
        assertDoesNotThrow(()->c.getRadius());
        assertDoesNotThrow(()->c1.getRadius());
        assertDoesNotThrow(()->c2.getRadius());
        assertEquals(1, c.getRadius());
        assertEquals(3, c1.getRadius());
        assertEquals(2, c2.getRadius());
    }

    @Test
    void setRadius() {
        MyCircle c = new MyCircle();
        MyCircle c1 = new MyCircle(1,2,3);
        MyPoint m = new MyPoint(2,3);
        MyCircle c2 = new MyCircle(m, 2);
        assertDoesNotThrow(()->c.setRadius(2));
        assertDoesNotThrow(()->c1.setRadius(2));
        assertDoesNotThrow(()->c2.setRadius(3));
    }

    @Test
    void getCenter() {
        MyCircle c = new MyCircle();
        MyCircle c1 = new MyCircle(1,2,3);
        MyPoint m = new MyPoint(2,3);
        MyCircle c2 = new MyCircle(m, 2);
        assertDoesNotThrow(()->c.getCenter());
        assertDoesNotThrow(()->c1.getCenter());
        assertDoesNotThrow(()->c2.getCenter());
    }

    @Test
    void setCenter() {
        MyCircle c = new MyCircle();
        MyCircle c1 = new MyCircle(1,2,3);
        MyPoint m = new MyPoint(2,3);
        MyCircle c2 = new MyCircle(m, 2);
        assertDoesNotThrow(()->c.setCenter(m));
        assertDoesNotThrow(()->c1.setCenter(m));
        assertDoesNotThrow(()->c2.setCenter(m));
    }

    @Test
    void getCenterX() {
        MyCircle c = new MyCircle();
        MyCircle c1 = new MyCircle(1,2,3);
        MyPoint m = new MyPoint(2,3);
        MyCircle c2 = new MyCircle(m, 2);
        assertDoesNotThrow(()->c.getCenterX());
        assertDoesNotThrow(()->c1.getCenterX());
        assertDoesNotThrow(()->c2.getCenterX());
        assertEquals(0, c.getCenterX());
        assertEquals(1, c1.getCenterX());
        assertEquals(2, c2.getCenterX());
    }

    @Test
    void setCenterX() {
        MyCircle c = new MyCircle();
        MyCircle c1 = new MyCircle(1,2,3);
        MyPoint m = new MyPoint(2,3);
        MyCircle c2 = new MyCircle(m, 2);
        assertDoesNotThrow(()->c.setCenterX(2));
        assertDoesNotThrow(()->c1.setCenterX(3));
        assertDoesNotThrow(()->c2.setCenterX(2));
    }

    @Test
    void getCenterY() {
        MyCircle c = new MyCircle();
        MyCircle c1 = new MyCircle(1,2,3);
        MyPoint m = new MyPoint(2,3);
        MyCircle c2 = new MyCircle(m, 2);
        assertDoesNotThrow(()->c.getCenterY());
        assertDoesNotThrow(()->c1.getCenterY());
        assertDoesNotThrow(()->c2.getCenterY());
        assertEquals(0, c.getCenterY());
        assertEquals(2, c1.getCenterY());
        assertEquals(3, c2.getCenterY());
    }

    @Test
    void setCenterY() {
        MyCircle c = new MyCircle();
        MyCircle c1 = new MyCircle(1,2,3);
        MyPoint m = new MyPoint(2,3);
        MyCircle c2 = new MyCircle(m, 2);
        assertDoesNotThrow(()->c.setCenterY(4));
        assertDoesNotThrow(()->c1.setCenterY(2));
        assertDoesNotThrow(()->c2.setCenterY(3));
    }

    @Test
    void getCenterXY() {
        MyCircle c = new MyCircle();
        MyCircle c1 = new MyCircle(1,2,3);
        MyPoint m = new MyPoint(2,3);
        MyCircle c2 = new MyCircle(m, 2);
        assertDoesNotThrow(()->c.getCenterXY());
        assertDoesNotThrow(()->c1.getCenterXY());
        assertDoesNotThrow(()->c2.getCenterXY());
    }

    @Test
    void setCenterXY() {
        MyCircle c = new MyCircle();
        MyCircle c1 = new MyCircle(1,2,3);
        MyPoint m = new MyPoint(2,3);
        MyCircle c2 = new MyCircle(m, 2);
        assertDoesNotThrow(()->c.setCenterXY(6,4));
        assertDoesNotThrow(()->c1.setCenterXY(2,1));
        assertDoesNotThrow(()->c2.setCenterXY(4,2));
    }

    @Test
    void testToString() {
        MyCircle c = new MyCircle();
        MyCircle c1 = new MyCircle(1,2,3);
        MyPoint m = new MyPoint(2,3);
        MyCircle c2 = new MyCircle(m, 2);
        assertDoesNotThrow(()->c.toString());
        assertDoesNotThrow(()->c1.toString());
        assertDoesNotThrow(()->c2.toString());
    }

    @Test
    void getArea() {
        MyCircle c = new MyCircle();
        MyCircle c1 = new MyCircle(1,2,3);
        MyPoint m = new MyPoint(2,3);
        MyCircle c2 = new MyCircle(m, 2);
        assertEquals((Math.PI*1), c.getArea());
        assertEquals((Math.PI*9), c1.getArea());
        assertEquals((Math.PI*4), c2.getArea());
        assertDoesNotThrow(()->c.getArea());
        assertDoesNotThrow(()->c1.getArea());
        assertDoesNotThrow(()->c2.getArea());
    }

    @Test
    void getCircumference() {
        MyCircle c = new MyCircle();
        MyCircle c1 = new MyCircle(1,2,3);
        MyPoint m = new MyPoint(2,3);
        MyCircle c2 = new MyCircle(m, 2);
        assertEquals((Math.PI*2), c.getCircumference());
        assertEquals((Math.PI*6), c1.getCircumference());
        assertEquals((Math.PI*4), c2.getCircumference());
        assertDoesNotThrow(()->c.getCircumference());
        assertDoesNotThrow(()->c1.getCircumference());
        assertDoesNotThrow(()->c2.getCircumference());
    }

    @Test
    void distance() {
        MyCircle c = new MyCircle();
        MyCircle c1 = new MyCircle(1,2,3);
        MyPoint m = new MyPoint(2,3);
        MyCircle c2 = new MyCircle(m, 2);
        assertEquals((Math.sqrt(5)), c.distance(c1));
        assertEquals((Math.sqrt(5)), c1.distance(c));
        assertEquals((Math.sqrt(13)), c2.distance(c));
        assertDoesNotThrow(()->c.distance(c1));
        assertDoesNotThrow(()->c1.distance(c));
        assertDoesNotThrow(()->c2.distance(c));
    }
}
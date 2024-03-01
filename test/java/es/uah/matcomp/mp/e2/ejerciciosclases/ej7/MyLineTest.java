package es.uah.matcomp.mp.e2.ejerciciosclases.ej7;

import es.uah.matcomp.mp.e2.ejerciciosclases.ej6.MyPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLineTest {

    @Test
    void getBegin() {
        MyLine l = new MyLine(1,2,2,3);
        MyPoint m = new MyPoint();
        MyPoint m1 = new MyPoint(1,2);
        MyLine l1 = new MyLine(m,m1);
        assertDoesNotThrow(()->l.getBegin());
        assertDoesNotThrow(()-> l1.getBegin());
    }

    @Test
    void setBegin() {
        MyLine l = new MyLine(1,2,2,3);
        MyPoint m = new MyPoint();
        MyPoint m1 = new MyPoint(1,2);
        MyLine l1 = new MyLine(m,m1);
        assertDoesNotThrow(()->l.setBegin(m));
        assertDoesNotThrow(()-> l1.setBegin(m1));
    }

    @Test
    void getEnd() {
        MyLine l = new MyLine(1,2,2,3);
        MyPoint m2 = new MyPoint(2,3);
        MyPoint m = new MyPoint();
        MyPoint m1 = new MyPoint(1,2);
        MyLine l1 = new MyLine(m,m1);
        assertDoesNotThrow(()->l.getEnd());
        assertDoesNotThrow(()-> l1.getEnd());
    }

    @Test
    void setEnd() {
        MyLine l = new MyLine(1,2,2,3);
        MyPoint m = new MyPoint();
        MyPoint m1 = new MyPoint(1,2);
        MyLine l1 = new MyLine(m,m1);
        assertDoesNotThrow(()->l.setEnd(m));
        assertDoesNotThrow(()-> l1.setEnd(m1));
    }

    @Test
    void getBeginX() {
        MyLine l = new MyLine(1,2,2,3);
        MyPoint m = new MyPoint();
        MyPoint m1 = new MyPoint(1,2);
        MyLine l1 = new MyLine(m,m1);
        assertDoesNotThrow(()->l.getBeginX());
        assertDoesNotThrow(()-> l1.getBeginX());
        assertEquals(1,l.getBeginX());
        assertEquals(0, l1.getBeginX());
    }

    @Test
    void setBeginX() {
        MyLine l = new MyLine(1,2,2,3);
        MyPoint m = new MyPoint();
        MyPoint m1 = new MyPoint(1,2);
        MyLine l1 = new MyLine(m,m1);
        assertDoesNotThrow(()->l.setBeginX(1));
        assertDoesNotThrow(()-> l1.setBeginX(2));
    }

    @Test
    void getBeginY() {
        MyLine l = new MyLine(1,2,2,3);
        MyPoint m = new MyPoint();
        MyPoint m1 = new MyPoint(1,2);
        MyLine l1 = new MyLine(m,m1);
        assertDoesNotThrow(()->l.getBeginY());
        assertDoesNotThrow(()-> l1.getBeginY());
        assertEquals(2,l.getBeginY());
        assertEquals(0, l1.getBeginY());
    }

    @Test
    void setBeginY() {
        MyLine l = new MyLine(1,2,2,3);
        MyPoint m = new MyPoint();
        MyPoint m1 = new MyPoint(1,2);
        MyLine l1 = new MyLine(m,m1);
        assertDoesNotThrow(()->l.setBeginY(2));
        assertDoesNotThrow(()-> l1.setBeginY(3));
    }

    @Test
    void getEndX() {
        MyLine l = new MyLine(1,2,2,3);
        MyPoint m = new MyPoint();
        MyPoint m1 = new MyPoint(1,2);
        MyLine l1 = new MyLine(m,m1);
        assertDoesNotThrow(()->l.getEndX());
        assertDoesNotThrow(()-> l1.getEndX());
        assertEquals(2, l.getEndX());
        assertEquals(1, l1.getEndX());
    }

    @Test
    void setEndX() {
        MyLine l = new MyLine(1,2,2,3);
        MyPoint m = new MyPoint();
        MyPoint m1 = new MyPoint(1,2);
        MyLine l1 = new MyLine(m,m1);
        assertDoesNotThrow(()->l.setEndX(2));
        assertDoesNotThrow(()-> l1.setEndX(2));
    }

    @Test
    void getEndY() {
        MyLine l = new MyLine(1,2,2,3);
        MyPoint m = new MyPoint();
        MyPoint m1 = new MyPoint(1,2);
        MyLine l1 = new MyLine(m,m1);
        assertDoesNotThrow(()->l.getEndY());
        assertDoesNotThrow(()-> l1.getEndY());
        assertEquals(3, l.getEndY());
        assertEquals(2, l1.getEndY());
    }

    @Test
    void setEndY() {
        MyLine l = new MyLine(1,2,2,3);
        MyPoint m = new MyPoint();
        MyPoint m1 = new MyPoint(1,2);
        MyLine l1 = new MyLine(m,m1);
        assertDoesNotThrow(()->l.setEndY(2));
        assertDoesNotThrow(()-> l1.setEndY(3));
    }

    @Test
    void getBeginXY() {
        MyLine l = new MyLine(1,2,2,3);
        MyPoint m = new MyPoint();
        MyPoint m1 = new MyPoint(1,2);
        MyLine l1 = new MyLine(m,m1);
        assertDoesNotThrow(()->l.getBeginXY());
        assertDoesNotThrow(()-> l1.getBeginXY());
    }

    @Test
    void setBeginXY() {
        MyLine l = new MyLine(1,2,2,3);
        MyPoint m = new MyPoint();
        MyPoint m1 = new MyPoint(1,2);
        MyLine l1 = new MyLine(m,m1);
        assertDoesNotThrow(()->l.setBeginXY(1,2));
        assertDoesNotThrow(()-> l1.setBeginXY(2,4));
    }

    @Test
    void getEndXY() {
        MyLine l = new MyLine(1,2,2,3);
        MyPoint m = new MyPoint();
        MyPoint m1 = new MyPoint(1,2);
        MyLine l1 = new MyLine(m,m1);
        assertDoesNotThrow(()->l.getEndXY());
        assertDoesNotThrow(()-> l1.getEndXY());
    }

    @Test
    void setEndXY() {
        MyLine l = new MyLine(1,2,2,3);
        MyPoint m = new MyPoint();
        MyPoint m1 = new MyPoint(1,2);
        MyLine l1 = new MyLine(m,m1);
        assertDoesNotThrow(()->l.setEndXY(2,3));
        assertDoesNotThrow(()-> l1.setEndXY(3,4));
    }

    @Test
    void getLength() {
        MyLine l = new MyLine(1,2,2,3);
        MyPoint m = new MyPoint();
        MyPoint m1 = new MyPoint(1,2);
        MyLine l1 = new MyLine(m,m1);
        assertDoesNotThrow(()->l.getLength());
        assertDoesNotThrow(()-> l1.getLength());
        assertEquals(Math.sqrt(2), l.getLength());
        assertEquals(Math.sqrt(5), l1.getLength());
    }

    @Test
    void getGradient() {
        MyLine l = new MyLine(1,2,2,3);
        MyPoint m = new MyPoint();
        MyPoint m1 = new MyPoint(1,2);
        MyLine l1 = new MyLine(m,m1);
        assertDoesNotThrow(()->l.getGradient());
        assertDoesNotThrow(()-> l1.getGradient());
        assertEquals(Math.atan2(1,1), l.getGradient());
        assertEquals(Math.atan2(2,1), l1.getGradient());
    }

    @Test
    void testToString() {
        MyLine l = new MyLine(1,2,2,3);
        MyPoint m = new MyPoint();
        MyPoint m1 = new MyPoint(1,2);
        MyLine l1 = new MyLine(m,m1);
        assertDoesNotThrow(()->l.toString());
        assertDoesNotThrow(()-> l1.toString());
    }
}
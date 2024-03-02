package es.uah.matcomp.mp.e3.ejerciciosclases.ej7;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineSubTest {

    @Test
    void testToString() {
        LineSub l1 = new LineSub(1,2,2,3);
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,3);
        LineSub l2 = new LineSub(p1,p2);
        assertDoesNotThrow(()->l1.toString());
        assertDoesNotThrow(()-> l2.toString());
        assertEquals("MyLine[begin=Point: (1,2),end=Point: (2,3)]",l1.toString());
        assertEquals("MyLine[begin=Point: (0,0),end=Point: (3,3)]", l2.toString());
    }

    @Test
    void getBegin() {
        LineSub l1 = new LineSub(1,2,2,3);
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,3);
        LineSub l2 = new LineSub(p1,p2);
        assertDoesNotThrow(()->l1.getBegin());
        assertDoesNotThrow(()-> l2.getBegin());
    }

    @Test
    void getEnd() {
        LineSub l1 = new LineSub(1,2,2,3);
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,3);
        LineSub l2 = new LineSub(p1,p2);
        assertDoesNotThrow(()->l1.getEnd());
        assertDoesNotThrow(()-> l2.getEnd());
    }

    @Test
    void setBegin() {
        LineSub l1 = new LineSub(1,2,2,3);
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,3);
        LineSub l2 = new LineSub(p1,p2);
        assertDoesNotThrow(()->l1.setBegin(p1));
        assertDoesNotThrow(()-> l2.setBegin(p2));
    }

    @Test
    void setEnd() {
        LineSub l1 = new LineSub(1,2,2,3);
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,3);
        LineSub l2 = new LineSub(p1,p2);
        assertDoesNotThrow(()->l1.setEnd(p1));
        assertDoesNotThrow(()-> l2.setEnd(p2));
    }

    @Test
    void getBeginX() {
        LineSub l1 = new LineSub(1,2,2,3);
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,3);
        LineSub l2 = new LineSub(p1,p2);
        assertDoesNotThrow(()->l1.getBeginX());
        assertDoesNotThrow(()-> l2.getBeginX());
        assertEquals(1,l1.getBeginX());
        assertEquals(0, l2.getBeginX());
    }

    @Test
    void getBeginY() {
        LineSub l1 = new LineSub(1,2,2,3);
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,3);
        LineSub l2 = new LineSub(p1,p2);
        assertDoesNotThrow(()->l1.getBeginY());
        assertDoesNotThrow(()-> l2.getBeginY());
        assertEquals(2,l1.getBeginY());
        assertEquals(0, l2.getBeginY());
    }

    @Test
    void getEndX() {
        LineSub l1 = new LineSub(1,2,2,3);
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,3);
        LineSub l2 = new LineSub(p1,p2);
        assertDoesNotThrow(()->l1.getEndX());
        assertDoesNotThrow(()-> l2.getEndX());
        assertEquals(2,l1.getEndX());
        assertEquals(3, l2.getEndX());
    }

    @Test
    void getEndY() {
        LineSub l1 = new LineSub(1,2,2,3);
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,3);
        LineSub l2 = new LineSub(p1,p2);
        assertDoesNotThrow(()->l1.getEndY());
        assertDoesNotThrow(()-> l2.getEndY());
        assertEquals(3,l1.getEndY());
        assertEquals(3, l2.getEndY());
    }

    @Test
    void setBeginX() {
        LineSub l1 = new LineSub(1,2,2,3);
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,3);
        LineSub l2 = new LineSub(p1,p2);
        assertDoesNotThrow(()->l1.setBeginX(5));
        assertDoesNotThrow(()-> l2.setBeginX(6));
    }

    @Test
    void setBeginY() {
        LineSub l1 = new LineSub(1,2,2,3);
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,3);
        LineSub l2 = new LineSub(p1,p2);
        assertDoesNotThrow(()->l1.setBeginY(8));
        assertDoesNotThrow(()-> l2.setBeginY(9));
    }

    @Test
    void setBeginXY() {
        LineSub l1 = new LineSub(1,2,2,3);
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,3);
        LineSub l2 = new LineSub(p1,p2);
        assertDoesNotThrow(()->l1.setBeginXY(5,9));
        assertDoesNotThrow(()-> l2.setBeginXY(6,1));
    }

    @Test
    void setEndX() {
        LineSub l1 = new LineSub(1,2,2,3);
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,3);
        LineSub l2 = new LineSub(p1,p2);
        assertDoesNotThrow(()->l1.setEndX(4));
        assertDoesNotThrow(()-> l2.setEndX(5));
    }

    @Test
    void setEndY() {
        LineSub l1 = new LineSub(1,2,2,3);
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,3);
        LineSub l2 = new LineSub(p1,p2);
        assertDoesNotThrow(()->l1.setEndY(5));
        assertDoesNotThrow(()-> l2.setEndY(7));
    }

    @Test
    void setEndXY() {
        LineSub l1 = new LineSub(1,2,2,3);
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,3);
        LineSub l2 = new LineSub(p1,p2);
        assertDoesNotThrow(()->l1.setEndXY(5,7));
        assertDoesNotThrow(()-> l2.setEndXY(7,4));
    }

    @Test
    void getLength() {
        LineSub l1 = new LineSub(1,2,2,3);
        Point p1 = new Point(0,0);
        Point p2 = new Point(1,2);
        LineSub l2 = new LineSub(p1,p2);
        assertDoesNotThrow(()->l1.getLength());
        assertDoesNotThrow(()-> l2.getLength());
        assertEquals(1, l1.getLength());
        assertEquals(2, l2.getLength());
    }

    @Test
    void getGradient() {
        LineSub l1 = new LineSub(1,2,2,3);
        Point p1 = new Point(0,0);
        Point p2 = new Point(1,2);
        LineSub l2 = new LineSub(p1,p2);
        assertDoesNotThrow(()->l1.getGradient());
        assertDoesNotThrow(()-> l2.getGradient());
        assertEquals(Math.atan2(1,1), l1.getGradient());
        assertEquals(Math.atan2(2,1), l2.getGradient());
    }
}
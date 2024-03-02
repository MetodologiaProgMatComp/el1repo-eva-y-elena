package es.uah.matcomp.mp.e4.ejerciciosclases.ej1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getSide() {
        Square s1 = new Square();
        Square s2 = new Square(2);
        Square s3 = new Square(3, "blue",false);
        assertDoesNotThrow(() -> s1.getSide());
        assertEquals(1, s1.getSide());
        assertDoesNotThrow(() -> s2.getSide());
        assertEquals(2, s2.getSide());
        assertDoesNotThrow(() -> s3.getSide());
        assertEquals(3, s3.getSide());
    }

    @Test
    void setSide() {
        Square s1 = new Square();
        Square s2 = new Square(2);
        Square s3 = new Square(3, "blue",false);
        assertDoesNotThrow(() -> s1.setSide(4));
        assertDoesNotThrow(() -> s2.setSide(5));
        assertDoesNotThrow(() -> s3.setSide(6));
    }

    @Test
    void setWidth() {
        Square s1 = new Square();
        Square s2 = new Square(2);
        Square s3 = new Square(3, "blue",false);
        assertDoesNotThrow(() -> s1.setWidth(4));
        assertDoesNotThrow(() -> s2.setWidth(5));
        assertDoesNotThrow(() -> s3.setWidth(6));
    }

    @Test
    void setLength() {
        Square s1 = new Square();
        Square s2 = new Square(2);
        Square s3 = new Square(3, "blue",false);
        assertDoesNotThrow(() -> s1.setLength(7));
        assertDoesNotThrow(() -> s2.setLength(8));
        assertDoesNotThrow(() -> s3.setLength(9));
    }

    @Test
    void testToString() {
        Square s1 = new Square();
        Square s2 = new Square(2);
        Square s3 = new Square(3, "blue",false);
        assertDoesNotThrow(() -> s1.toString());
        assertEquals("Square[Rectangle[Shape[color=red,filled=true],width=1.0,length=1.0], side=1.0]", s1.toString());
        assertDoesNotThrow(() -> s2.toString());
        assertEquals("Square[Rectangle[Shape[color=red,filled=true],width=2.0,length=2.0], side=2.0]", s2.toString());
        assertDoesNotThrow(() -> s3.toString());
        assertEquals("Square[Rectangle[Shape[color=blue,filled=false],width=3.0,length=3.0], side=3.0]", s3.toString());
    }
}
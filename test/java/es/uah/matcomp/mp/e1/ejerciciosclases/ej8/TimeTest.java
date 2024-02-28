package es.uah.matcomp.mp.e1.ejerciciosclases.ej8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void getHour() {
        Time t = new Time(1,2,3);
        assertDoesNotThrow(() -> t.getHour());
        assertEquals(1, t.getHour());
    }

    @Test
    void setHour() {
        Time t = new Time(1,2,3);
        assertDoesNotThrow(() -> t.setHour(4));
    }

    @Test
    void getMinute() {
        Time t = new Time(1,2,3);
        assertDoesNotThrow(() -> t.getMinute());
        assertEquals(2, t.getMinute());
    }

    @Test
    void setMinute() {
        Time t = new Time(1,2,3);
        assertDoesNotThrow(() -> t.setMinute(5));
    }

    @Test
    void getSecond() {
        Time t = new Time(1,2,3);
        assertDoesNotThrow(() -> t.getSecond());
        assertEquals(3, t.getSecond());
    }

    @Test
    void setSecond() {
        Time t = new Time(1,2,3);
        assertDoesNotThrow(() -> t.setSecond(6));
    }

    @Test
    void setTime() {
        Time t = new Time(1,2,3);
        assertDoesNotThrow(() -> t.setTime(23,59,58));
    }

    @Test
    void testToString() {
        Time t = new Time(1,2,3);
        Time t1 = new Time(10,20,30);
        assertDoesNotThrow(() -> t.toString());
        assertDoesNotThrow(()-> t1.toString());
    }

    @Test
    void nextSecond() {
        Time t = new Time(23,59,58);
        Time t1 = new Time(23,59,59);
        assertDoesNotThrow(() -> t.nextSecond());
        assertDoesNotThrow(()-> t1.nextSecond());
    }

    @Test
    void previousSecond() {
        Time t = new Time(23,59,58);
        Time t1 = new Time(00,00,00);
        assertDoesNotThrow(() -> t.previousSecond());
        assertDoesNotThrow(()-> t1.previousSecond());
    }
}
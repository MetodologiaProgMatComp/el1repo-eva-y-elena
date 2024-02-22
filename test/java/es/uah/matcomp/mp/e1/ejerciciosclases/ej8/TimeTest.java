package es.uah.matcomp.mp.e1.ejerciciosclases.ej8;

import es.uah.matcomp.mp.e1.ejerciciosclases.ej7.Date;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void getHour() {
        Time t = new Time(1,2,3);
        assertDoesNotThrow(() -> t.getHour());
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
        assertDoesNotThrow(() -> t.toString());
    }

    @Test
    void nextSecond() {
        Time t = new Time(23,59,58);
        assertDoesNotThrow(() -> t.nextSecond());
    }

    @Test
    void previousSecond() {
        Time t = new Time(23,59,58);
        assertDoesNotThrow(() -> t.previousSecond());
    }
}
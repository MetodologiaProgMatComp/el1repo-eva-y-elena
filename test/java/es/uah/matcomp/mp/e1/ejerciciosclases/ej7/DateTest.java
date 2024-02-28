package es.uah.matcomp.mp.e1.ejerciciosclases.ej7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void getDay() {
        Date d = new Date(1,2,2014);
        assertDoesNotThrow(() -> d.getDay());
        assertEquals(1,d.getDay());
    }

    @Test
    void getMonth() {
        Date d = new Date(1,2,2014);
        assertDoesNotThrow(() -> d.getMonth());
        assertEquals(2,d.getMonth());
    }

    @Test
    void getYear() {
        Date d = new Date(1,2,2014);
        assertDoesNotThrow(() -> d.getYear());
        assertEquals(2014, d.getYear());
    }

    @Test
    void setDay() {
        Date d = new Date(1,2,2014);
        assertDoesNotThrow(() -> d.setDay(9));
    }

    @Test
    void setMonth() {
        Date d = new Date(1,2,2014);
        assertDoesNotThrow(() -> d.setMonth(12));
    }

    @Test
    void setYear() {
        Date d = new Date(1,2,2014);
        assertDoesNotThrow(() -> d.setYear(2099));
    }

    @Test
    void setDate() {
        Date d = new Date(1,2,2014);
        assertDoesNotThrow(() -> d.setDate(3, 4, 2016));
    }

    @Test
    void testToString() {
        Date d = new Date(1,2,2014);
        Date d1 = new Date(10,11,4);
        assertDoesNotThrow(() -> d.toString());
        assertDoesNotThrow(()->d1.toString());
    }
}
package es.uah.matcomp.mp.e3.ejerciciosclases.ej2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {

    @Test
    void getSchool() {
        Staff s = new Staff("Maria", "Madrid", "school",1 );
        assertDoesNotThrow(() -> s.getSchool());
        assertEquals("school", s.getSchool());
    }

    @Test
    void setSchool() {
        Staff s = new Staff("Maria", "Madrid", "school",1 );
        assertDoesNotThrow(() -> s.setSchool("school2"));
    }

    @Test
    void getPay() {
        Staff s = new Staff("Maria", "Madrid", "school",1 );
        assertDoesNotThrow(() -> s.getPay());
        assertEquals(1, s.getPay());
    }

    @Test
    void setPay() {
        Staff s = new Staff("Maria", "Madrid", "school",1 );
        assertDoesNotThrow(() -> s.setPay(2));
    }

    @Test
    void testToString() {
        Staff s = new Staff("Maria", "Madrid", "school",1 );
        assertDoesNotThrow(() -> s.toString());
        assertEquals("Staff[Person[name=Maria,address=Madrid],school=school,pay=1.0]", s.toString());
    }
}
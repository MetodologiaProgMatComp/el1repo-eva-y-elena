package es.uah.matcomp.mp.e3.ejerciciosclases.ej2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getProgram() {
        Student s = new Student("Maria", "Madrid","bueno", 6, 100.0);
        assertDoesNotThrow(() -> s.getProgram());
        assertEquals("bueno", s.getProgram());
    }

    @Test
    void setProgram() {
        Student s = new Student("Maria", "Madrid","bueno", 6, 100.0);
        assertDoesNotThrow(() -> s.setProgram("programa"));
    }

    @Test
    void getYear() {
        Student s = new Student("Maria", "Madrid","bueno", 6, 100.0);
        assertDoesNotThrow(() -> s.getYear());
        assertEquals(6, s.getYear());
    }

    @Test
    void setYear() {
        Student s = new Student("Maria", "Madrid","bueno", 6, 100.0);
        assertDoesNotThrow(() -> s.setYear(2));
    }

    @Test
    void getFee() {
        Student s = new Student("Maria", "Madrid","bueno", 6, 100.0);
        assertDoesNotThrow(() -> s.getFee());
        assertEquals(100.0, s.getFee());
    }

    @Test
    void setFee() {
        Student s = new Student("Maria", "Madrid","bueno", 6, 100.0);
        assertDoesNotThrow(() -> s.setFee(50.0));
    }

    @Test
    void testToString() {
        Student s = new Student("Maria", "Madrid","bueno", 6, 100.0);
        assertDoesNotThrow(() -> s.toString());
        assertEquals("Student[Person[name=Maria,address=Madrid],program=bueno,year=6,fee=100.0]", s.toString());
    }
}
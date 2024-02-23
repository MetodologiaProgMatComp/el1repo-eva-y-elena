package es.uah.matcomp.mp.e1.ejerciciosclases.ej4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void getId() {
        Employee e = new Employee(8,"Peter", "Tan", 2500);
        assertDoesNotThrow(() -> e.getId());
        assertEquals(8,e.getId());
    }

    @Test
    void getFirstName() {
        Employee e = new Employee(8,"Peter", "Tan", 2500);
        assertDoesNotThrow(() -> e.getFirstName());
        assertEquals("Peter", e.getFirstName());
    }

    @Test
    void getLastName() {
        Employee e = new Employee(8,"Peter", "Tan", 2500);
        assertDoesNotThrow(() -> e.getLastName());
        assertEquals("Tan", e.getLastName());
    }

    @Test
    void getName() {
        Employee e = new Employee(8,"Peter", "Tan", 2500);
        assertDoesNotThrow(() -> e.getName());
        assertEquals("Peter Tan", e.getName());
    }

    @Test
    void getSalary() {
        Employee e = new Employee(8,"Peter", "Tan", 2500);
        assertDoesNotThrow(() -> e.getSalary());
        assertEquals(2500, e.getSalary());
    }

    @Test
    void setSalary() {
        Employee e = new Employee(8,"Peter", "Tan", 2500);
        assertDoesNotThrow(() -> e.setSalary(999));
    }

    @Test
    void getAnnualSalary() {
        Employee e = new Employee(8,"Peter", "Tan", 999);
        assertDoesNotThrow(() -> e.getAnnualSalary());
        assertEquals(11988, e.getAnnualSalary());
    }

    @Test
    void raiseSalary() {
        Employee e = new Employee(8,"Peter", "Tan", 999);
        assertEquals(1098, e.raiseSalary(10));
        assertDoesNotThrow(() -> e.raiseSalary(10));
    }

    @Test
    void testToString() {
        Employee e = new Employee(8,"Peter", "Tan", 2500);
        assertDoesNotThrow(() -> e.toString());
    }
}
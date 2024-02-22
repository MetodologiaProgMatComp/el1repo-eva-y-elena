package es.uah.matcomp.mp.e1.ejerciciosclases.ej4;

import es.uah.matcomp.mp.e1.ejerciciosclases.ej3.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void getId() {
        Employee e = new Employee(8,"Peter", "Tan", 2500);
        assertDoesNotThrow(() -> e.getId());
    }

    @Test
    void getFirstName() {
        Employee e = new Employee(8,"Peter", "Tan", 2500);
        assertDoesNotThrow(() -> e.getFirstName());
    }

    @Test
    void getLastName() {
        Employee e = new Employee(8,"Peter", "Tan", 2500);
        assertDoesNotThrow(() -> e.getLastName());
    }

    @Test
    void getName() {
        Employee e = new Employee(8,"Peter", "Tan", 2500);
        assertDoesNotThrow(() -> e.getName());
    }

    @Test
    void getSalary() {
        Employee e = new Employee(8,"Peter", "Tan", 2500);
        assertDoesNotThrow(() -> e.getSalary());
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
        assertDoesNotThrow(() -> e.raiseSalary(10));
        assertEquals(1098, e.raiseSalary(10));
    }

    @Test
    void testToString() {
        Employee e = new Employee(8,"Peter", "Tan", 2500);
        assertDoesNotThrow(() -> e.toString());
    }
}
package es.uah.matcomp.mp.e1.ejerciciosclases.ej4;

import es.uah.matcomp.mp.e1.ejerciciosclases.ej3.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void getId() {
        Employee e = new Employee();
        assertDoesNotThrow(() -> e.getId());
    }

    @Test
    void getFirstName() {
        Employee e = new Employee();
        assertDoesNotThrow(() -> e.getLength());
    }

    @Test
    void getLastName() {
    }

    @Test
    void getName() {
    }

    @Test
    void getSalary() {
    }

    @Test
    void setSalary() {
    }

    @Test
    void getAnnualSalary() {
    }

    @Test
    void raiseSalary() {
    }

    @Test
    void testToString() {
    }
}
package es.uah.matcomp.mp.e2.ejerciciosclases.ej4;

import org.junit.jupiter.api.Test;

import static java.lang.Math.round;
import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    @Test
    void getId() {
        Customer c = new Customer(88, "Juan", 10);
        Invoice i = new Invoice(101, c,888.8);
        assertDoesNotThrow(() -> i.getId());
        assertEquals(101, i.getId());
    }

    @Test
    void getCustomer() {
        Customer c = new Customer(88, "Juan", 10);
        Invoice i = new Invoice(101, c,888.8);
        assertDoesNotThrow(() -> i.getCustomer());
        assertEquals(c, i.getCustomer());
    }

    @Test
    void getAmount() {
        Customer c = new Customer(88, "Juan", 10);
        Invoice i = new Invoice(101, c,888.8);
        assertDoesNotThrow(() -> i.getAmount());
        assertEquals(888.8, i.getAmount());
    }

    @Test
    void setCustomer() {
        Customer c = new Customer(88, "Juan", 10);
        Customer c1 = new Customer(99,"Tan Ah Teck", 12);
        Invoice i = new Invoice(101, c,888.8);
        assertDoesNotThrow(() -> i.setCustomer(c1));
    }

    @Test
    void setAmount() {
        Customer c = new Customer(88, "Juan", 10);
        Invoice i = new Invoice(101, c,888.8);
        assertDoesNotThrow(() -> i.setAmount(999));
    }

    @Test
    void getCustomerId() {
        Customer c = new Customer(88, "Juan", 10);
        Invoice i = new Invoice(101, c,888.8);
        assertDoesNotThrow(() -> i.getCustomerId());
        assertEquals(88, i.getCustomerId());
    }

    @Test
    void getCustomerName() {
        Customer c = new Customer(88, "Juan", 10);
        Invoice i = new Invoice(101, c,888.8);
        assertDoesNotThrow(() -> i.getCustomerName());
        assertEquals("Juan", i.getCustomerName());
    }

    @Test
    void getCustomerDiscount() {
        Customer c = new Customer(88, "Juan", 10);
        Invoice i = new Invoice(101, c,888.8);
        assertDoesNotThrow(() -> i.getCustomerDiscount());
        assertEquals(10, i.getCustomerDiscount());
    }

    @Test
    void getAmountAfterDiscount() {
        Customer c = new Customer(88, "Juan", 8);
        Invoice i = new Invoice(101, c,999.9);
        assertDoesNotThrow(() -> i.getAmountAfterDiscount());
        assertEquals((919.91*100), round(i.getAmountAfterDiscount()*100));
    }

    @Test
    void testToString() {
        Customer c = new Customer(88, "Juan", 10);
        Invoice i = new Invoice(101, c,888.8);
        assertDoesNotThrow(() -> i.toString());
    }
}
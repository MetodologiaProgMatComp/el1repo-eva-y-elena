package es.uah.matcomp.mp.e2.ejerciciosclases.ej4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    @Test
    void getId() {
        Customer c = new Customer(88, "Juan", 10);
        Invoice i = new Invoice(101, c,888.8);
        assertDoesNotThrow(() -> i.getId());
        assertEquals(88, i.getId());
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
        Invoice i = new Invoice(101, c,888.8);
        assertDoesNotThrow(() -> i.setCustomer());
        assertEquals("Tan Ah Teck", i.getId());
    }

    @Test
    void setAmount() {
    }

    @Test
    void getCustomerId() {
    }

    @Test
    void getCustomerName() {
    }

    @Test
    void getCustomerDiscount() {
    }

    @Test
    void getAmountAfterDiscount() {
    }

    @Test
    void testToString() {
    }
}
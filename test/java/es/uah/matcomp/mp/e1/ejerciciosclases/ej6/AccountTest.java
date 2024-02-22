package es.uah.matcomp.mp.e1.ejerciciosclases.ej6;

import es.uah.matcomp.mp.e1.ejerciciosclases.ej5.InvoiceItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getID() {
        A e = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        assertDoesNotThrow(() -> e.getId());
    }

    @Test
    void getName() {
    }

    @Test
    void getBalance() {
    }

    @Test
    void credit() {
    }

    @Test
    void debit() {
    }

    @Test
    void transferTo() {
    }

    @Test
    void testToString() {
    }
}
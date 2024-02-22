package es.uah.matcomp.mp.e1.ejerciciosclases.ej5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceItemTest {

    @Test
    void getId() {
        InvoiceItem e = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        assertDoesNotThrow(() -> e.getId());
    }

    @Test
    void getDesc() {
        InvoiceItem e = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        assertDoesNotThrow(() -> e.getDesc());
    }

    @Test
    void getQty() {
        InvoiceItem e = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        assertDoesNotThrow(() -> e.getQty());
    }

    @Test
    void setQty() {
        InvoiceItem e = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        assertDoesNotThrow(() -> e.setQty(999));
    }

    @Test
    void getUnitPrice() {
        InvoiceItem e = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        assertDoesNotThrow(() -> e.getUnitPrice());
    }

    @Test
    void setUnitPrice() {
        InvoiceItem e = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        assertDoesNotThrow(() -> e.setUnitPrice(0.99));
    }

    @Test
    void getTotal() {
        InvoiceItem e = new InvoiceItem("A101", "Pen Red", 999, 0.99);
        assertEquals(989.01, e.getTotal());
        assertDoesNotThrow(() -> e.getTotal());
    }

    @Test
    void testToString() {
        InvoiceItem e = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        assertDoesNotThrow(() -> e.toString());
    }
}
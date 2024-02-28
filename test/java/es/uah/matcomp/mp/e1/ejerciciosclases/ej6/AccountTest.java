package es.uah.matcomp.mp.e1.ejerciciosclases.ej6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getID() {
        Account e = new Account("A101", "Tan Ah Teck", 88);
        assertDoesNotThrow(() -> e.getID());
        assertEquals("A101", e.getID());
    }

    @Test
    void getName() {
        Account e = new Account("A101", "Tan Ah Teck", 88);
        assertDoesNotThrow(() -> e.getName());
        assertEquals("Tan Ah Teck", e.getName());
    }

    @Test
    void getBalance() {
        Account e = new Account("A101", "Tan Ah Teck", 88);
        assertDoesNotThrow(() -> e.getBalance());
        assertEquals(88, e.getBalance());
    }

    @Test
    void credit() {
        Account e = new Account("A101", "Tan Ah Teck", 88);
        assertEquals(188, e.credit(100));
        assertDoesNotThrow(()->e.credit(100));
    }

    @Test
    void debit() {
        Account e = new Account("A101", "Tan Ah Teck", 188);
        assertEquals(138, e.debit(50));
        assertDoesNotThrow(() -> e.debit(50));
        assertDoesNotThrow(()->e.debit(200));
    }

    @Test
    void transferTo() {
        Account e1 = new Account("A101", "Tan Ah Teck", 138);
        Account e2 = new Account("A102", "Kumar");
        assertEquals(38, e1.transferTo(e2, 100));
        assertDoesNotThrow(() -> e1.transferTo(e2, 100));
    }

    @Test
    void testToString() {
        Account e = new Account("A101", "Tan Ah Teck", 88);
        assertDoesNotThrow(() -> e.toString());
    }
}
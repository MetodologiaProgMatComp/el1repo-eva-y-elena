package es.uah.matcomp.mp.e2.ejerciciosclases.ej5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getId() {
        Customer c = new Customer(88, "Juan", 'm');
        Account a = new Account(101, c,888.8);
        Account a1 = new Account(101, c);
        assertDoesNotThrow(() -> a.getId());
        assertEquals(101, a.getId());
        assertDoesNotThrow(() -> a1.getId());
        assertEquals(101, a1.getId());
    }

    @Test
    void getCustomer() {
        Customer c = new Customer(88, "Juan", 'm');
        Account a = new Account(101, c,888.8);
        Account a1 = new Account(101, c);
        assertDoesNotThrow(() -> a.getCustomer());
        assertDoesNotThrow(()-> a1.getCustomer());
    }

    @Test
    void getBalance() {
        Customer c = new Customer(88, "Juan", 'm');
        Account a = new Account(101, c,888.8);
        Account a1 = new Account(101, c);
        assertDoesNotThrow(() -> a.getBalance());
        assertEquals(888.8, a.getBalance());
        assertDoesNotThrow(() -> a1.getBalance());
        assertEquals(0, a1.getBalance());
    }

    @Test
    void setBalance() {
        Customer c = new Customer(88, "Juan", 'm');
        Account a = new Account(101, c,888.8);
        Account a1 = new Account(101, c);
        assertDoesNotThrow(() -> a.setBalance(2));
        assertDoesNotThrow(()-> a1.setBalance(2));
    }

    @Test
    void testToString() {
        Customer c = new Customer(88, "Juan", 'm');
        Account a = new Account(101, c,888.8);
        Account a1 = new Account(101, c);
        assertDoesNotThrow(() -> a.toString());
        assertDoesNotThrow(()-> a1.toString());
    }

    @Test
    void getCustomerName() {
        Customer c = new Customer(88, "Juan", 'm');
        Account a = new Account(101, c,888.8);
        Account a1 = new Account(101, c);
        assertDoesNotThrow(() -> a.getCustomerName());
        assertEquals("Juan", a.getCustomerName());
        assertDoesNotThrow(() -> a1.getCustomerName());
        assertEquals("Juan", a1.getCustomerName());
    }

    @Test
    void deposit() {
        Customer c = new Customer(88, "Juan", 'm');
        Account a = new Account(101, c,888.8);
        Account a1 = new Account(101, c);
        assertDoesNotThrow(() -> a.deposit(2));
        assertDoesNotThrow(() -> a1.deposit(2));
    }

    @Test
    void withdraw() {
        Customer c = new Customer(88, "Juan", 'm');
        Account a = new Account(101, c,888.8);
        Account a1 = new Account(101, c);
        assertDoesNotThrow(() -> a.withdraw(2));
        assertDoesNotThrow(() -> a1.withdraw(2));
    }
}
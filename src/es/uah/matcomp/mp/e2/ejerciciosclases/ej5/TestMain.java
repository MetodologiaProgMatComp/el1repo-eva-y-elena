package es.uah.matcomp.mp.e2.ejerciciosclases.ej5;

public class TestMain {
    public static void main(String[] args) {
        // Test Customer class
        Customer c1 = new Customer(88, "Tan Ah Teck", 'm');
        System.out.println(c1); // Customer's toString()
        System.out.println("id is: " + c1.getId());
        System.out.println("name is: " + c1.getName());
        System.out.println("gender is: " + c1.getGender());
        // Test Account class
        Account inv1 = new Account(101, c1, 888.8);
        System.out.println(inv1);
        inv1.setBalance(999.9);
        System.out.println(inv1);
        System.out.println("id is: " + inv1.getId());
        System.out.println("customer is: " + inv1.getCustomer()); // Customer's toString()
        System.out.println("balance is: " + inv1.getBalance());
        System.out.println("customer's name is: " + inv1.getCustomerName());
        System.out.println("customer's deposit is: " + inv1.deposit(9));
        System.out.println("customer's withdraw is: " + inv1.withdraw(9));
    }
}


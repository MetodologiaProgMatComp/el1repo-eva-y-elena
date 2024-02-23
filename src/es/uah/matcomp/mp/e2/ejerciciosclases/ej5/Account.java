package es.uah.matcomp.mp.e2.ejerciciosclases.ej5;

public class Account {
    private int id;
    private Customer customer;
    private double balance;
    public Account(int id, Customer customer, double balance){
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    public Account(int id, Customer customer){
        this.id = id;
        this.customer = customer;
        balance = 0;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String toString() {
        return customer + "balance=$" + balance;
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public double deposit(double amount){
        return balance+=amount;
    }
    public double withdraw(double amount){
        if (balance >= amount){
            return balance -= amount;
        }
        else{
            System.out.println("amount withdrawn exceeds the current balance!");
            return balance;
        }


    }
}

package es.uah.matcomp.mp.e2.ejerciciosclases.ej2;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;
    public Book(String name, Author[] authors, double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
        qty = 0;
    }
    public Book(String name, Author[] authors, double price, int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    public String toString() {

        return "Book[name=" + name + "," + authors + ",price=" + price + ",qty=" + qty + "]";
    }


}



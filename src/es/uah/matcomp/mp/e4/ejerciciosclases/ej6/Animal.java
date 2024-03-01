package es.uah.matcomp.mp.e4.ejerciciosclases.ej6;

abstract public class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }
    abstract public void greets();
}


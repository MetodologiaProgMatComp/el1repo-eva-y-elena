package es.uah.matcomp.mp.e4.ejerciciosclases.ej6;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void greets() {
        System.out.println("Meow");
    }
}


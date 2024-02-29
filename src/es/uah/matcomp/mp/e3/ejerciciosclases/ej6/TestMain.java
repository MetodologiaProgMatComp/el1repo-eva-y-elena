package es.uah.matcomp.mp.e3.ejerciciosclases.ej6;

public class TestMain {
    public static void main(String[] args) {
        Animal animal = new Animal("A");
        Mammal mammal = new Mammal("B");
        Cat cat = new Cat("C");
        Dog dog = new Dog("D");
        Dog dog2 = new Dog("2");

        System.out.println(animal);
        System.out.println(mammal);
        System.out.println(cat);
        System.out.println(dog);

        System.out.print("The cat says "); cat.greets();
        System.out.print("The dog says "); dog.greets();
        System.out.print("Other dog says "); dog.greets(dog2);

    }
}

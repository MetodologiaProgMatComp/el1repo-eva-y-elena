package es.uah.matcomp.mp.e4.ejerciciosclases.ej6;

public class TestMain {
    public static void main(String[] args) {
        Animal cat = new Cat("A");
        System.out.println(cat.toString());
        cat.greets();

        Animal dog1 = new Dog("B");
        Animal dog2 = new Dog("C");
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        dog1.greets();
        dog1.greets();

        Animal bigDog = new BigDog("C");
        bigDog.greets();


    }
}

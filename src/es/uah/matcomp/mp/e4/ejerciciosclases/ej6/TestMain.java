package es.uah.matcomp.mp.e4.ejerciciosclases.ej6;

public class TestMain {
    public static void main(String[] args) {
        Animal cat = new Cat("A");
        cat.greets();

        Dog dog1 = new Dog("B");
        Dog dog2 = new Dog("C");
        dog1.greets();
        dog1.greets(dog2);

        BigDog bigdog = new BigDog("D");
        BigDog bigdog2 = new BigDog("E");
        bigdog.greets();
        bigdog.greets(dog1);
        bigdog.greets(bigdog2);


    }
}

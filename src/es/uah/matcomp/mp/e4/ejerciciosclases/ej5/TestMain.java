package es.uah.matcomp.mp.e4.ejerciciosclases.ej5;


public class TestMain {
    public static void main(String[] args) {
        GeometricObject s1 = new Circle(5.5);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());

        Circle c1 = (Circle) s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());


        ResizableCircle r = new ResizableCircle(3);
        System.out.println("Circulo antes: " + r);
        System.out.println("Perímetro antes: " + r.getPerimeter());
        System.out.println("Área antes: " + r.getArea());

        // Redimensionar el círculo y mostrar su perímetro y área después de la redimension
        r.resize(150);
        System.out.println("Circulo despues: " + r);
        System.out.println("Perímetro despues: " + r.getPerimeter());
        System.out.println("Área despues: " + r.getArea());
    }

}

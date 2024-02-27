package es.uah.matcomp.mp.e2.ejerciciosclases.ej7;
import es.uah.matcomp.mp.e2.ejerciciosclases.ej6.MyPoint;

public class TestMain {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(0, 2);
        MyPoint p2 = new MyPoint(4, 4);
        // Test program to test all constructors and public methods
        MyLine l1 = new MyLine(2, 3, 4, 5); // Test constructor
        MyLine l2 = new MyLine(p1, p2);
        System.out.println(l1);
        System.out.println(l2);// Test toString()
        l1.setBegin(p1); // Test setters
        l1.setEnd(p2);
        l1.setBeginX(8); // Test setters
        l1.setBeginY(6);
        l1.setEndX(3); // Test setters
        l1.setEndY(8);
        l1.setBeginXY(8, 4); // Test setters
        l1.setEndXY(6,3);

        System.out.println("begin of l1 is: " + l1.getBegin()); // Test getters
        System.out.println("end is: " + l1.getEnd());
        p1.setXY(3, 0); // Test setXY()
        System.out.println(p1.getXY()[0]); // Test getXY()
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);// Test another constructor
        System.out.println(p2);
// Testing the overloaded methods distance()
        System.out.println(p1.distance(p2)); // which version? Distancia desde el punto a otro punto.
        System.out.println(p2.distance(p1)); // which version? Distancia desde el punto a otro punto.
        System.out.println(p1.distance(5, 6)); // which version? Distancia desde el punto a las coordenadas pasadas por parámetro.
        System.out.println(p1.distance()); // which version? Distancia desde el punto al origen de coordenadas
    }
}

package es.uah.matcomp.mp.e3.ejerciciosclases.ej7;

public class TestMain {
    public static void main(String[] args) {
        Point p1 = new Point(0, 2);
        Point p2 = new Point(4, 4);
        // Test program to test all constructors and public methods
        LineSub l1 = new LineSub(2, 3, 4, 5); // Test constructor
        LineSub l2 = new LineSub(p1, p2);
        System.out.println(l1);
        System.out.println(l2);// Test toString()
        l1.setBegin(p1); // Test setters
        l1.setEnd(p2);
        System.out.println(l1.getEnd());
        System.out.println(l1.getBegin());
        l1.setBeginX(8); // Test setters
        l1.setBeginY(6);
        System.out.println(l1.getBeginX());
        System.out.println(l1.getBeginY());
        l1.setEndX(3); // Test setters
        l1.setEndY(8);
        System.out.println(l1.getEndX());
        System.out.println(l1.getEndY());
        l1.setBeginXY(8, 4); // Test setters
        l1.setEndXY(6,3);
        System.out.println(l1.toString());
        System.out.println(l2.toString());
        System.out.println(l1.getLength());
        System.out.println(l2.getGradient());
    }
}


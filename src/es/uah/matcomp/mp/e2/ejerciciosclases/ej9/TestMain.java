package es.uah.matcomp.mp.e2.ejerciciosclases.ej9;
import es.uah.matcomp.mp.e2.ejerciciosclases.ej6.MyPoint;

public class TestMain {
    public static void main(String[] args) {
        MyTriangle t1 = new MyTriangle(1, 2, 2, 5,6,6);
        MyPoint p1 = new MyPoint(0,0);
        MyPoint p2 = new MyPoint(0,2);
        MyPoint p3 = new MyPoint(1,1);
        MyTriangle t2 = new MyTriangle(p1, p2, p3);
        System.out.println("1." + t1);
        System.out.println("2." + t1);
        System.out.println("Perimeter of triangle 1 is " + t1.getPerimeter());
        System.out.println("Perimeter of triangle 2 is " + t2.getPerimeter());
        System.out.println("Triangle 1 is " + t1.getType());
        System.out.println("Triangle 2 is " + t2.getType());
    }
}

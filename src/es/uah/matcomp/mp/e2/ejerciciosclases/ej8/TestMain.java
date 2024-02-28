package es.uah.matcomp.mp.e2.ejerciciosclases.ej8;

import es.uah.matcomp.mp.e2.ejerciciosclases.ej6.MyPoint;


public class TestMain {

    public static void main (String[] p) {
        MyPoint p1 = new MyPoint(0, 2);
        MyPoint p2 = new MyPoint(4, 4);
        MyCircle c1 = new MyCircle();
        MyCircle c2 = new MyCircle(2, 3, 1);
        MyCircle c3 = new MyCircle(p1, 2);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        System.out.println(c2.getRadius());
        c2.setRadius(2);
        System.out.println(c3.getCenter());
        c3.setCenter(p2);
        System.out.println(c3.getCenterX());
        c3.setCenterX(2);
        System.out.println(c3.getCenterY());
        c3.setCenterY(1);
        c3.setCenterXY(3,2);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        System.out.println(c2.getArea());
        System.out.println(c2.getCircumference());
        System.out.println(c3.distance(c2));
    }
}

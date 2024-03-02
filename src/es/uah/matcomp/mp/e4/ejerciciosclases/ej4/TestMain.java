package es.uah.matcomp.mp.e4.ejerciciosclases.ej4;


public class TestMain {
    public static void main(String[] args) {
        Movable p1 = new MovablePoint(1,2,3,4);
        System.out.println(p1.toString());
        p1.moveUp();
        System.out.println("Move up: " + p1.toString());

        p1.moveLeft();
        System.out.println("Move left: " + p1.toString());

        p1.moveDown();
        System.out.println("Move down: " + p1.toString());

        p1.moveRight();
        System.out.println("Move right: " + p1.toString());

        MovablePoint p2 = (MovablePoint) p1;
        System.out.println(p2);


        Movable m1 = new MovableCircle(2,2,5,3,3);
        System.out.println(p1.toString());
        p1.moveUp();
        System.out.println("Move up: " + m1.toString());

        p1.moveLeft();
        System.out.println("Move left: " + m1.toString());

        p1.moveDown();
        System.out.println("Move down: " + m1.toString());

        p1.moveRight();
        System.out.println("Move right: " + m1.toString());

        MovableCircle c = (MovableCircle) m1;
        System.out.println(c);

    }
}

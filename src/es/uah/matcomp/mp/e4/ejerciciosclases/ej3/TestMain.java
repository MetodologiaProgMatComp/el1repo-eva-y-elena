package es.uah.matcomp.mp.e4.ejerciciosclases.ej3;

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

    }
}

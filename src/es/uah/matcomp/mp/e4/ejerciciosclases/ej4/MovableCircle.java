package es.uah.matcomp.mp.e4.ejerciciosclases.ej4;

import es.uah.matcomp.mp.e1.ejerciciosclases.ej1.Circle1;

public class MovableCircle implements Movable{
    int radius;
    MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public String toString() {
        return center + ",radius=" + radius;
    }
    @Override
    public void moveUp(){
        center.moveUp();
    }
    @Override
    public void moveDown(){
        center.moveDown();
    }
    @Override
    public void moveLeft(){
        center.moveLeft();
    }
    @Override
    public void moveRight(){
        center.moveRight();
    }
}

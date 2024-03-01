package es.uah.matcomp.mp.e4.ejerciciosclases.ej4;

public class MovablePoint implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return "(" + x + "," + y + ") speed=(" + xSpeed + "," + ySpeed + ")";
    }
    @Override
    public void moveUp(){
        this.y = y-=ySpeed;
    }
    @Override
    public void moveDown(){
        this.y = y+=ySpeed;
    }
    @Override
    public void moveLeft(){
        this.x = x-=xSpeed;
    }
    @Override
    public void moveRight(){
        this.x = x+=xSpeed;
    }
}

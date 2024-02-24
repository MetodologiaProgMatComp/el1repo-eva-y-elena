package es.uah.matcomp.mp.e2.ejerciciosclases.ej6;

public class MyPoint {
    private int x;
    private int y;
    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY() {
        return new int[] {x, y};
    }
    public void setXY(int x, int y) {
        this.y = y;
        this.x = x;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distance(int x, int y){
        double dx = this.x - x;
        double dy = this.y - y;
        return Math.sqrt((dx*dx)+(dy*dy));
    }
    public double distance(MyPoint another){
        return distance(another.getX(), another.getY());
    }
    public double distance(){
        return distance(0, 0);
    }
}

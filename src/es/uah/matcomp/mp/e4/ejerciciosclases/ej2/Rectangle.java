package es.uah.matcomp.mp.e4.ejerciciosclases.ej2;


public class Rectangle implements GeometricObject {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea(){
        return width*length;
    }
    @Override
    public double getPerimeter(){
        return 2*width+2*length;
    }
    @Override
    public String toString() {
        return "Rectangle[width=" + width + ",length=" + length + "]";
    }

}


package es.uah.matcomp.mp.e3.ejerciciosclases.ej8;

import es.uah.matcomp.mp.e1.ejerciciosclases.ej1.Circle1;

public class Cylinder{
    private Circle1 base;  // Base circle, an instance of Circle class
    private double height;

    // Constructor with default color, radius and height
    public Cylinder() {
        base = new Circle1(); // Call the constructor to construct the Circle
        height = 1.0;
    }

    public Cylinder(double height) {
        base = new Circle1();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        base = new Circle1(radius);
        this.height = height;
    }


    public double getHeight() {
        return height;
    }


    public double getVolume() {
        return base.getArea()*height;
    }
    @Override
    public String toString() {
        return "Cylinder: composes of " + base + " height=" + height;
    }
}



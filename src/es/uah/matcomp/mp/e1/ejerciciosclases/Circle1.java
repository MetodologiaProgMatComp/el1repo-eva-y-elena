package es.uah.matcomp.mp.e1.ejerciciosclases;

/**
 * The Circle class models a circle with a radius and color.
 */
public class Circle1 { // Save as "Circle.java"
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;

    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle1() { // 1st (default) constructor
        radius = 1.0;
        color = "red";
    }

    /** Constructs a Circle instance with the given radius and default color */
    public Circle1(double radius) { // 2nd constructor
        this.radius = radius;
        color = "red";
    }

    /** Constructs a Circle instance with the given radius and color */
    public Circle1 (double radius, String color) { // 3rd constructor
        this.radius = radius;
        this.color = color;
    }

    /** Returns the radius */
    public double getRadius() {
        return this.radius;
    }

    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius*radius*Math.PI;
    }

    /** Getter for instance variable color */
    public String getColor() {
        return this.color;
    }

    /** Setter for instance variable radius */
    public void setRadius(double radius){
        if (radius>0) {
            this.radius = radius;
        }else{
            System.out.println("el radio no puede ser negativo ni 0");
        }
    }

    /** Setter for instance variable color */
    public void setColor(String color){
        this.color = color;
    }

    /** Return a self-descriptive string of this instance in the form of Circle[radius=?, color=?] */
    public String toString(){
        return "Circle [radius= " + radius + " color= " + color + "]";
    }
}

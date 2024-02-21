package es.uah.matcomp.mp.e1.ejerciciosclases.ej1;

/**
 * A Test Driver for the Circle class
 */
public class TCircle { // Save as "TestCircle.java"
    public static void main(String[] args) {
        // Declare an instance of Circle class called c1.
        // Construct the instance c1 by invoking the "default" constructor
        // which sets its radius and color to their default value.
        Circle1 c1 = new Circle1();
        // Invoke public methods on instance c1, via dot operator.
        System.out.println("The circle has radius of "
                + c1.getRadius() + " and area of " + c1.getArea());
        System.out.println("The color is " + c1.getColor());
        //The circle has radius of 1.0 and area of 3.141592653589793

        // Declare an instance of class circle called c2.
        // Construct the instance c2 by invoking the second constructor
        // with the given radius and default color.
        Circle1 c2 = new Circle1(2.0);
        // Invoke public methods on instance c2, via dot operator.
        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of " + c2.getArea());
        System.out.println("The color is " + c2.getColor());
        //The circle has radius of 2.0 and area of 12.566370614359172

        // Declare an instance of Circle class called c3.
        // Construct the instance c3 by invoking the third constructor
        //with the given radius and color.
        Circle1 c3 = new Circle1(3.0,"blue");
        // Invoke public methods on instance c3, via dot operator.
        System.out.println("The circle has radius of "
                + c3.getRadius() + " and area of " + c3.getArea());
        System.out.println("The color is " + c3.getColor());
        //The circle has radius of 3.0 and area of 28.274333882308138

        Circle1 c4 = new Circle1();     //constructs an instance of Circle
        c4.setRadius(8);              //change radius
        System.out.println("radius is: " + c4.getRadius());     //Print radius via getter

        c4.setColor("green");
        System.out.println("color is: " + c4.getColor());

        Circle1 c5 = new Circle1(5.5);
        System.out.println(c5.toString());  //explicit call

        Circle1 c6 = new Circle1(6.6);
        System.out.println(c6.toString());  //explicit call
        System.out.println(c6);   //println() calls toString() implicitly same as above
        System.out.println("Operator '+' invokes toString() too: " + c6);   // '+' invokes toString() too
    }
}

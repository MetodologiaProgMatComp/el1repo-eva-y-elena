package es.uah.matcomp.mp.e3.ejerciciosclases.ej8;


public class TestMain { // save as "TestCylinder.java"
    public static void main (String[] args) {
        // Declare and allocate a new instance of cylinder
        // with default color, radius, and height
        Cylinder c1 = new Cylinder();
        System.out.println(c1);
        System.out.println("Cylinder:"
                + " height=" + c1.getHeight()
                + " volume=" + c1.getVolume());

        // Declare and allocate a new instance of cylinder
        // specifying height, with default color and radius
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("Cylinder:"
                + " height=" + c2.getHeight()
                + " volume=" + c2.getVolume());

        // Declare and allocate a new instance of cylinder
        // specifying radius and height, with default color
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder:"
                + " height=" + c3.getHeight()
                + " volume=" + c3.getVolume());
    }
}

package es.uah.matcomp.mp.e4.ejerciciosclases.ej2;


public class TestMain {public static void main(String[] args) {
    GeometricObject s1 = new Circle(5.5);
    System.out.println(s1);
    System.out.println(s1.getArea());
    System.out.println(s1.getPerimeter());


    Circle c1 = (Circle) s1;
    System.out.println(c1);
    System.out.println(c1.getArea());
    System.out.println(c1.getPerimeter());

    GeometricObject s2 = new GeometricObject() {
        @Override
        public double getArea() {
            return 0;
        }

        @Override
        public double getPerimeter() {
            return 0;
        }
    };

    GeometricObject s3 = new Rectangle(1.0, 2.0);
    System.out.println(s3);
    System.out.println(s3.getArea());
    System.out.println(s3.getPerimeter());

    Rectangle r1 = (Rectangle) s3;
    ;
    System.out.println(r1);
    System.out.println(r1.getArea());
    System.out.println(r1.getPerimeter());

}


}


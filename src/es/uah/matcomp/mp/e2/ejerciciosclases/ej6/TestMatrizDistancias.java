package es.uah.matcomp.mp.e2.ejerciciosclases.ej6;

public class TestMatrizDistancias {
    public static void main(String[] args) {
        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i + 1, i + 1);
        }
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                System.out.print(points[i].distance(points[j]) + "\t");
            }
            System.out.println();
        }
    }
}
